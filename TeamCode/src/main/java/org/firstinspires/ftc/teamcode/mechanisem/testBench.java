package org.firstinspires.ftc.teamcode.mechanisem;

import com.qualcomm.robotcore.hardware.DcMotor;
import com.qualcomm.robotcore.hardware.DcMotorSimple;
import com.qualcomm.robotcore.hardware.DigitalChannel;
import com.qualcomm.robotcore.hardware.HardwareMap;

public class testBench {
    private DigitalChannel touchSensor;
    private DcMotor motor;
    private double ticketPerRev;


    public void init(HardwareMap hwMap){
        //touch sensor
        touchSensor = hwMap.get(DigitalChannel.class , "touch_sensor");
        touchSensor.setMode(DigitalChannel.Mode.INPUT);
        //DC motor
        motor = hwMap.get(DcMotor.class,"motor");
        //using encoder means its going use pid and be more realible to save the velocity no metter the voltage
        motor.setMode(DcMotor.RunMode.RUN_USING_ENCODER);
        ticketPerRev = motor.getMotorType().getTicksPerRev();
        motor.setZeroPowerBehavior(DcMotor.ZeroPowerBehavior.BRAKE);
        //reverse its for one of the engines that will be in the same direct to the other engine(they are opposite direct
        motor.setDirection(DcMotorSimple.Direction.REVERSE);



    }
    public boolean getTouchSensorState(){
        return !touchSensor.getState();
    }
    public boolean isReleased(){
        return touchSensor.getState();
    }


    public void setMotorSpeed(double speed){
        //accept values from -1 to 1
        motor.setPower(speed);
    }

    public double getMotorRevs(){
        return motor.getCurrentPosition()/ticketPerRev;
    }


}
