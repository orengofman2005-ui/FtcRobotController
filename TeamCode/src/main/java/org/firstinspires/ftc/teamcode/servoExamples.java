package org.firstinspires.ftc.teamcode;

import com.qualcomm.robotcore.eventloop.opmode.OpMode;

import org.firstinspires.ftc.teamcode.mechanisem.TestBrnchServo;

public class servoExamples extends OpMode {
    TestBrnchServo bench = new TestBrnchServo();
    @Override
    public void init() {
        bench.init(hardwareMap);
    }

    @Override
    public void loop() {
        if(gamepad1.a){
            bench.setServoRot(1.0);
        }
        else{
            bench.setServoRot(0.0);
        }

        if(gamepad1.b){
            bench.setServoPos(1.0);
        }
        else{
            bench.setServoPos(0.0);
        }

    }
}
