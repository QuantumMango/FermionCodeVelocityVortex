package org.firstinspires.ftc.teamcode;


import com.qualcomm.robotcore.eventloop.opmode.LinearOpMode;


/**
 * Created by ftclh on 10/11/2016.
 */


@com.qualcomm.robotcore.eventloop.opmode.TeleOp(name="Drive", group="Linear Opmode")
public class TeleOp extends LinearOpMode {
    @Override
    public void runOpMode() throws InterruptedException{
        HardwareRobot robot = new HardwareRobot();
        robot.init(hardwareMap);


        waitForStart();


        while(opModeIsActive()){
            robot.left.setPower(-gamepad1.left_stick_y);
            robot.right.setPower(-gamepad1.right_stick_y);
            robot.bar.setPower(-gamepad2.left_stick_y);
            robot.launcher.setPower(-gamepad2.right_stick_x);
        }
    }
}


