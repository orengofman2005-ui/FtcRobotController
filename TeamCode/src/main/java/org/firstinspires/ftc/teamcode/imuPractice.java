package org.firstinspires.ftc.teamcode;

import com.qualcomm.robotcore.eventloop.opmode.OpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;
import org.firstinspires.ftc.robotcore.external.navigation.AngleUnit;
import org.firstinspires.ftc.teamcode.mechanisem.testBrenchIMU;

@TeleOp
public class imuPractice extends OpMode{
    testBrenchIMU bench = new testBrenchIMU();

    @Override
    public void init() {
        bench.init(hardwareMap);
    }

    @Override
    public void loop() {
        double heading = bench.getHeading(AngleUnit.RADIANS);
        telemetry.addData("Heading", heading);

        if (heading < 0.5 && heading > -0.5) {
            bench.setMotor(0);
        } else if (heading < -0.5) {
            bench.setMotor(0.5);
        } else if (heading > 0.5) {
            bench.setMotor(-0.5);
        }
    }
}