package org.firstinpires.ftc.teamcode.mechanisms;

import com.qualcomm.robotcore.hardware.DcMotor;
import com.qualcomm.robotcore.hardware.DigitalChannel;
import com.qualcomm.robotcore.hardware.HardwareMap;

public class ProgrammingBoard4 {
    private DigitalChannel touchSensor;
    private DcMotor motor_right;
    private DcMotor motor_left;

    private double ticketsPerRotation;

    public void setLeftMotorSpeed(double speed) {
        motor_left.setPower(speed);
    }

    public void setRightMotorSpeed(double speed) {
        motor_right.setPower(speed);
    }
}