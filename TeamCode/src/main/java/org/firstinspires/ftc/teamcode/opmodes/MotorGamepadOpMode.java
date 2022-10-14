package org.firstinspires.ftc.teamcode.opmodes;

import com.qualcomm.robotcore.eventloop.opmode.OpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;

import org.firstinspires.ftc.teamcode.mechanisms.ProgrammingBoard4;

@TeleOp
public class MotorGamepadOpMode extends OpMode {
    ProgrammingBoard4 board = new ProgrammingBoard4();
    @Override
    public void init(){
        board.init(hardwareMap);
    }

    @Override
    public void loop(){
        double motorSpeed = gamepad1.left_stick_y;
        board.setLeftMotorSpeed(motorSpeed);
        telemetry.addData("Motor speed", motorSpeed);
        //telemetry.addData("Motor rotations", board.getMotorRotations());

        double motorSpeed = gamepad1.right_stick_y;
        board.setRightMotorSpeed(motorSpeed)
        telemetry.addData("Motor speed", motorSpeed);
        // telemetry.addData("Motor rotations",board.getMotorRotations());
    }
}