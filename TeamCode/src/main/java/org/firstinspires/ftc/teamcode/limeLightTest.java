package org.firstinspires.ftc.teamcode;

import com.qualcomm.hardware.limelightvision.LLResult;
import com.qualcomm.hardware.limelightvision.Limelight3A;
import com.qualcomm.robotcore.eventloop.opmode.Autonomous;
import com.qualcomm.robotcore.eventloop.opmode.OpMode;


// to get into config of the limelightvision: limelight.local:5801
@Autonomous
public class limeLightTest extends OpMode {
    private Limelight3A limelight3A;



    @Override
    public void init() {
        limelight3A = hardwareMap.get(Limelight3A.class, "LimeLight");
        limelight3A.pipelineSwitch(0);
        limelight3A.start();
    }

    @Override
    public void start() {
        limelight3A.start();
    }

    @Override
    public void loop() {
        LLResult llResult = limelight3A.getLatestResult();
        if(llResult != null & llResult.isValid()){
            telemetry.addData("Target x offset", llResult.getTx());
            telemetry.addData("Target y offset", llResult.getTy());
            telemetry.addData("Target area offset", llResult.getTa());
        }
    }
}
