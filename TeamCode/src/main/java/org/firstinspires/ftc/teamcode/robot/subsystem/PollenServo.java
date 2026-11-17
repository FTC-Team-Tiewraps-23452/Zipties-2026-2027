package org.firstinspires.ftc.teamcode.robot.subsystem;

import com.qualcomm.robotcore.hardware.HardwareMap;
import com.qualcomm.robotcore.hardware.Servo;

public class PollenServo {
    private Servo pollenServo;

    public PollenServo (HardwareMap hardwareMap) {
        pollenServo = hardwareMap.get(Servo.class, "PollenServo");
    }

    public void up () {
        pollenServo.setPosition(1);
    }

    public void down () {
        pollenServo.setPosition(0);
    }
}
