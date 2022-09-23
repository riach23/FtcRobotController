package org.firstinspires.ftc.teamcode;

import com.qualcomm.robotcore.eventloop.opmode.OpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;

@TeleOp
public class GamepadOpMode extends OpMode {

    @Override
    public void init(){

    }

    public void loop(){

    telemetry.addData("Left stick x", gamepad.left_stick_x);
    telemetry.addData("Left stick y", gamepad.left_stick_y);
   }
}

