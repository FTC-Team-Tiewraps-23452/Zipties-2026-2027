package org.firstinspires.ftc.teamcode.robot.subsystem;

import com.qualcomm.robotcore.hardware.DcMotor;
import com.qualcomm.robotcore.hardware.DcMotorEx;
import com.qualcomm.robotcore.hardware.HardwareMap;

public class Shooter {
    private DcMotorEx shooterMotor;
    public Shooter (HardwareMap hardwareMap) {
        shooterMotor = hardwareMap.get(DcMotorEx.class, "ShooterMotor");
    }

    public void shoot () {
        shooterMotor.setVelocity(1160);
    }

    public void stop () {
        shooterMotor.setVelocity(0);
    }

    public double getVelocity () {
        return shooterMotor.getVelocity();
    }
}
