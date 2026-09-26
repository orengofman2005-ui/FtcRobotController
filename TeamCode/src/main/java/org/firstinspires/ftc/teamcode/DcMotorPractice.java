package org.firstinspires.ftc.teamcode;

import com.qualcomm.robotcore.eventloop.opmode.OpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;

import org.firstinspires.ftc.teamcode.mechanisem.testBench;

@TeleOp
public class DcMotorPractice extends OpMode {
    testBench bench = new testBench();

    @Override
    public void init() {
        bench.init(hardwareMap);
    }

    @Override
    public void loop() {
        //with joystick
        double motorSpeed = gamepad1.left_stick_y;
        bench.setMotorSpeed(motorSpeed);
        //without joystick
        bench.setMotorSpeed(0.5);

        if(bench.getTouchSensorState()){
            bench.setMotorSpeed(0.5);
        }
        else{
            bench.setMotorSpeed(0.0);
        }


    }
}
