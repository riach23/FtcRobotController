package org.firstinpires.ftc.teamcode.mechanisms;

import com.qualcomm.robotcore.hardware.DcMotor;
import com.qualcomm.robotcore.hardware.DigitalChannel;
import com.qualcomm.robotcore.hardware.HardwareMap;

public class ProgrammingBoard4 {
    private DigitalChannel touchSensor;
    private DcMotor motor_right;
    private DcMotor motor_left;
    private DcMotor motor_front_one;
    private DcMotor motor_front_two;
    private servo servo;

    private double ticketsPerRotation;

    public void setLeftMotorSpeed(double speed) {
        motor_left.setPower(speed);
    }

    public void setRightMotorSpeed(double speed) {
        motor_right.setPower(speed);
    }

    public void setFirstFrontMotorSpeed(double speed) {
        motor_front_one.setPower(speed);
    }

    public void setSecondFrontMotorSpeed(double speed) {
        motor_front_two.setPower(speed);
    }

    public void setSecondFrontMotorSpeed(double speed) {
        motor_front_two.setPower(speed);
    }

    public void setetServoSpeed(double speed) {
        servo.setPower(speed);
    }
}