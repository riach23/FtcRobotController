package org.firstinspires.ftc.teamcode.mechanisms.opmodes;

import com.qualcomm.robotcore.eventloop.opMode.OpMode;
import com.qualcomm.robotcore.eventloop.opMode.TeleOp;

import org.firstinspires.ftc.teamcode.mechanisms.ProgrammingBoard5;

@TeleOp
public class ServoGamepadOpMode extends OpMode 
{
    ProgrammingBoard5 board = new ProgrammingBoard();
    @Override
    public void init()
    {
        board.init(hardwareMap);
    }

    @Override
    public void loop()
    {
        if(gamepad1.a)
        {
            board.setServoPosition(1.0);
        }

        else if(gamepad1.b)
        {
            board.setServoPosition(0.0);
        }

        else 
        {
            board.setServoPosition(0.5);
        }
    }
}