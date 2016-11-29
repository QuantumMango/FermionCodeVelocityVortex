package org.firstinspires.ftc.teamcode;




import com.qualcomm.robotcore.hardware.DcMotor;
import com.qualcomm.robotcore.hardware.DcMotorSimple;
import com.qualcomm.robotcore.hardware.HardwareMap;
import com.qualcomm.robotcore.util.ElapsedTime;

//tank drive robot with beater bar and ball launcher
public class HardwareRobot {
    public DcMotor  left = null;
    public DcMotor right = null;
    public DcMotor launcher = null;
    //public DcMotor yoga = null;
    public DcMotor bar = null;
    HardwareMap map = null;
    private ElapsedTime period  = new ElapsedTime();

    //constructor
    public HardwareRobot(){
    }

    public void init(HardwareMap inputMap){
        map = inputMap;
        left = map.dcMotor.get("left");
        left.setDirection(DcMotorSimple.Direction.FORWARD);
        left.setPower(0);
        right = map.dcMotor.get("right");
        right.setDirection(DcMotorSimple.Direction.FORWARD);
        right.setPower(0);
        launcher = map.dcMotor.get("launcher");
        launcher.setDirection(DcMotorSimple.Direction.FORWARD);
        launcher.setPower(0);
        /*yoga = map.dcMotor.get("yoga");
        yoga.setDirection(DcMotorSimple.Direction.FORWARD);
        yoga.setPower(0);*/
        bar = map.dcMotor.get("bar");
        bar.setDirection(DcMotorSimple.Direction.FORWARD);
        bar.setPower(0);
    }


    /*waitForTick implements a periodic delay. However, this acts like a metronome with a regular periodic tick.  This is used to compensate for varying processing times for each cycle. The function looks at the elapsed cycle time, and sleeps for the remaining time interval.
      @param periodMs  Length of wait cycle in mSec.
    * @throws InterruptedException
    */
    public void waitForTick(long periodMs) throws InterruptedException {

        long  remaining = periodMs - (long)period.milliseconds();

        // sleep for the remaining portion of the regular cycle period.
        if (remaining > 0)
            Thread.sleep(remaining);

        // Reset the cycle clock for the next pass.
        period.reset();
    }
}


