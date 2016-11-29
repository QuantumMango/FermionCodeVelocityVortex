package org.firstinspires.ftc.teamcode;


import com.qualcomm.robotcore.eventloop.opmode.LinearOpMode;
import com.qualcomm.robotcore.hardware.DcMotor;


/**
 * Created by ftclh on 10/11/2016.
 */


@com.qualcomm.robotcore.eventloop.opmode.TeleOp(name="Drive", group="TeleOp")
public class TeleOp extends LinearOpMode {
    @Override
    public void runOpMode() throws InterruptedException{
        HardwareRobot robot = new HardwareRobot();
        robot.init(hardwareMap);
        robot.left.setMode(DcMotor.RunMode.RUN_WITHOUT_ENCODER);
        robot.right.setMode(DcMotor.RunMode.RUN_WITHOUT_ENCODER);
        robot.launcher.setMode(DcMotor.RunMode.RUN_WITHOUT_ENCODER);
        //robot.yoga.setMode(DcMotor.RunMode.RUN_WITHOUT_ENCODER);
        robot.bar.setMode(DcMotor.RunMode.RUN_WITHOUT_ENCODER);

        waitForStart();

        while(opModeIsActive()){
            robot.left.setPower(gamepad1.left_stick_y);
            robot.right.setPower(gamepad1.right_stick_y);
            //foreward
            if (gamepad1.left_trigger>.05)
                robot.bar.setPower(-gamepad1.left_trigger);
            //reverse
            else if (gamepad1.right_trigger>.05)
                robot.bar.setPower(gamepad1.right_trigger);
            else
                robot.bar.setPower(0);
            robot.launcher.setPower(-gamepad2.right_stick_y);
            /*if (gamepad2.left_stick_y > 0.5){
               robot.yoga.setPower(0.5);
            } else if (gamepad2.left_stick_y < -0.5){
               robot.yoga.setPower(0.5);
            } else {
               robot.yoga.serPower(-gamepad2.left_stick_y);
            }
            */
        }
    }
}






