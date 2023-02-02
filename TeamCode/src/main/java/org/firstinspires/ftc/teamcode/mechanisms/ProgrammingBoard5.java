package org.firstinspires.ftc.teamcode.mechanisms;

import com.qualcomm.robotcore.hardware.DcMotor;
import com.qualcomm.robotcore.hardware.DigitalChannel;
import com.qualcomm.robotcore.hardware.HardwareMap;
import com.qualcomm.robotcore.hardware.Servo;

public class ProgrammingBoard5
{
    private DigitalChannel touchSensor;
    private DcMotor motor;
    private double ticksPerRotation;
    private Servo servo;

    public void init(HardwareMap hwMap)
    {
        touchSensor = hwMap.get(DigitalChannel.class,"touch sensor");
        touchSensor.setMode(DigitalChannel.MODE.INPUT);
        motor = hwMap.get(DcMotor.class,"motor");
        motor.setMode(DcMotor.RunMode.RUN_USING_ENCODER);
        ticksPerRotation = motor.getMotorType().getTicksPerRev();
        servo = hwMap.get(Servo.class,"servo");
    }

    public boolean isTouchSensorPressed()
    {
        return !touchSensor.getState();
    }

    public void setMotorSpeed(double speed)
    {
        motor.setPower(speed);
    }

    public double getMotorRotations()
    {
        return motor.getcurrentPosition();
    }

    public void setServoPosition(double position)
    {
        servo.setPosition(position);
    }    
}