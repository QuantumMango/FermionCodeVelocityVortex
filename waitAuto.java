package org.firstinspires.ftc.teamcode;

import com.qualcomm.robotcore.eventloop.opmode.LinearOpMode;
import com.qualcomm.robotcore.hardware.DcMotor;

/**
 * Created by ftclh on 12/3/2016.
 */

@com.qualcomm.robotcore.eventloop.opmode.Autonomous(name="WaitAuto", group="Autonomous")
public class waitAuto extends LinearOpMode {
    @Override
    public void runOpMode() throws InterruptedException{
        HardwareRobot robot = new HardwareRobot();
        robot.init(hardwareMap);
        robot.right.setMode(DcMotor.RunMode.STOP_AND_RESET_ENCODER);
        robot.left.setMode(DcMotor.RunMode.STOP_AND_RESET_ENCODER);
        //robot.bar.setMode(DcMotor.RunMode.STOP_AND_RESET_ENCODER);
        //robot.launcher.setMode(DcMotor.RunMode.STOP_AND_RESET_ENCODER);
        robot.left.setMode(DcMotor.RunMode.RUN_USING_ENCODER);
        robot.right.setMode(DcMotor.RunMode.RUN_USING_ENCODER);
        //robot.bar.setMode(DcMotor.RunMode.RUN_USING_ENCODER);
        //robot.launcher.setMode(DcMotor.RunMode.RUN_USING_ENCODER);
        //add yoga ball stuff

        waitForStart();


        //double check the distance to cap ball
        sleep(20000);
        robot.right.setPower(-1.0);
        robot.left.setPower(-1.0);
        sleep(3500);
        robot.right.setPower(0);
        robot.left.setPower(0);
    }
}
