package org.firstinspires.ftc.teamcode.opmodes;

import com.qualcomm.robotcore.eventloop.opmode.Opmode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;

import org.firstinpires.ftc.teamcode.mechanisms.ProgrammingBoard4;

@TeleOp
public class MotorOpMode extends OpMode {
    ProgrammingBoard4 board = new ProgrammingBoard4 ();
    @Override
    public void init() {
        board.init(hardwareMap);
    }

    @Override
    public void loop () {
        board.setMotorSpeed(0,5);
    }
}