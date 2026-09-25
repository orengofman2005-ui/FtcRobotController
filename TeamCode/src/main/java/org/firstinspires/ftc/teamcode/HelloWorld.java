package org.firstinspires.ftc.teamcode;

import com.qualcomm.robotcore.eventloop.opmode.OpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;

@TeleOp //could be also Autonomous
/* @Disabled
    will not show the file on the REV Driver Hub
 */

public class HelloWorld  extends OpMode {
    /* OpMode already has init() so we need to override if we use init() in our own class named - HelloWorld */
    @Override
    public void init() {
        /* addData prints on the screen */
        telemetry.addData("Hello","World");

    }

    @Override
    public void loop() {

    }
}
/* to upload this code we need connect computer to the REV CONTROL HUB ( the main driver) */
