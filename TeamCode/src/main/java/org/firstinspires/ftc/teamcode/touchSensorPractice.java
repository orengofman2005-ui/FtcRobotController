package org.firstinspires.ftc.teamcode;

import com.qualcomm.robotcore.eventloop.opmode.OpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;

import org.firstinspires.ftc.teamcode.mechanisem.testBench;

@TeleOp
public class touchSensorPractice extends OpMode {

    testBench bench = new testBench();


    @Override
    public void init() {
    bench.init(hardwareMap);
    }

    @Override
    public void loop() {
        telemetry.addData("touch sensor state: ", bench.getTouchSensorState());
        telemetry.addData("touch is realeased?: ", bench.isReleased());

    }
}
