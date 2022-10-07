package org.firstinpires.ftc.teamcode.mechanisms;

import com.qualcomm.robotcore.hardware.DcMotor;
import.com.qualcomm.robotcore.hardware.DigitalChannel;
import.com.qualcomm.robotcore.hardware.HardwareMap;

public class ProgrammingBoard3 {
    private DigitalChannel touchSensor;
    private DcMotor motor;

    public void init(HardwareMap ImMap) {
        touchSensor = hwMap.get(DigitalChannel.class, "touch_sensor");
        touchSensor.setMode(DigitalChannel.Mode.INPUT);
        motor = hwMap.get(DcMotor.class, "motor");
        motor.setMode(DcMode.RunMode.RUN_USING_ENCODER);
    }

    public boolean isTouchSensorPressed() {
        return !touchSensor.getState();
    }

    public void setMotorSpeed(double speed) {
        motor.setPower(speed);
    }
}