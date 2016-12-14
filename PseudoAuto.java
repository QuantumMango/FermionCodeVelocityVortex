package org.firstinspires.ftc.teamcode;

import com.qualcomm.robotcore.eventloop.opmode.LinearOpMode;
import com.qualcomm.robotcore.hardware.DcMotor;

/**
 * Created by ftclh on 12/14/2016.
 */

public class PseudoAuto extends LinearOpMode{
    public void runOpMode() throws InterruptedException{
        //basic pseudocode for the autonomous
        //DON'T ACTUALLY USE THIS PROGRAM
        //It's just an outline of the idea

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
        //ADD SENSORS TOO

        waitForStart();

        /*Currently have:
            •two color sensors (quite basic; probably will replace one with phone
                -use lower one for line detecting
            •Optical distance sensor (useful)
            •Phone camera
                -OpenCV manager
            ADD GYRO
         */

        //set COLOR (have a red program and a blue program)

        //Go straight untill sensor hits white stripe
        //Turn (135 degrees to the right)
        //check beacon color
        //if left side matches COLOR
            //turn slightly left
                //ADJUST THIS; find exact angle
            //go foreward slowly (use distance sensor)
        //if right side matches COLOR
            //turn slightly right
                //ADJUST THIS; find correct angle to hit the button
            //slowly advance
        //else
            //stop robot
        //when distance goes to 0, stop robot

     }
    }

