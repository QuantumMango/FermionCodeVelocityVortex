package org.firstinspires.ftc.teamcode;


import com.qualcomm.robotcore.eventloop.opmode.LinearOpMode;
import com.qualcomm.robotcore.hardware.DcMotor;
import com.qualcomm.robotcore.hardware.DcMotorSimple;


/**
 * Created by ftclh on 10/11/2016.
 */


@com.qualcomm.robotcore.eventloop.opmode.TeleOp(name="Drive", group="TeleOp")
public class TeleOp extends LinearOpMode {
    @Override
    public void runOpMode() throws InterruptedException {
        HardwareRobot robot = new HardwareRobot();
        robot.init(hardwareMap);
        robot.left.setMode(DcMotor.RunMode.RUN_WITHOUT_ENCODER);
        robot.right.setMode(DcMotor.RunMode.RUN_WITHOUT_ENCODER);
        robot.launcher.setMode(DcMotor.RunMode.RUN_WITHOUT_ENCODER);
        robot.collector.setMode(DcMotor.RunMode.RUN_WITHOUT_ENCODER);

        waitForStart();

        while (opModeIsActive()) {
            robot.left.setPower(gamepad1.left_stick_y);
            robot.right.setPower(gamepad1.right_stick_y);

            if (gamepad1.x) {
                if (robot.left.getDirection().equals(DcMotorSimple.Direction.FORWARD)
                        && robot.right.getDirection().equals(DcMotorSimple.Direction.FORWARD)) {
                    robot.left.setDirection(DcMotorSimple.Direction.REVERSE);
                    robot.right.setDirection(DcMotorSimple.Direction.REVERSE);
                } else {
                    robot.left.setDirection(DcMotorSimple.Direction.FORWARD);
                    robot.right.setDirection(DcMotorSimple.Direction.FORWARD);
                }
            }
            if (gamepad1.a)
                robot.launcher.setPower(-1.0);
            if (gamepad1.b)
                robot.launcher.setPower(0.0);
            if (gamepad1.left_bumper)
                robot.collector.setPower(1.0);
            if (gamepad1.right_bumper)
                robot.collector.setPower(0.0);
        }
    }
}






