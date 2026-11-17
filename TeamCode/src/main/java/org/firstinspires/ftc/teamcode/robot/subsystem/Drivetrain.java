package org.firstinspires.ftc.teamcode.robot.subsystem;

import com.qualcomm.robotcore.hardware.DcMotor;
import com.qualcomm.robotcore.hardware.DcMotorSimple;
import com.qualcomm.robotcore.hardware.HardwareMap;

public class Drivetrain {
    private DcMotor leftDrive;
    private DcMotor rightDrive;
    public Drivetrain(HardwareMap hardwareMap) {
        leftDrive = hardwareMap.get(DcMotor.class, "TankLeft");
        rightDrive = hardwareMap.get(DcMotor.class, "TankRight");

        leftDrive.setDirection(DcMotorSimple.Direction.FORWARD);
        rightDrive.setDirection(DcMotorSimple.Direction.REVERSE);

        leftDrive.setZeroPowerBehavior(DcMotor.ZeroPowerBehavior.BRAKE);
        rightDrive.setZeroPowerBehavior(DcMotor.ZeroPowerBehavior.BRAKE);
    }

    public void drive (double leftY, double rightX) {
        //TODO verander wat de voorkant is
        double leftPower = leftY + rightX;
        double rightPower = leftY - rightX;

        leftDrive.setPower(leftPower);
        rightDrive.setPower(rightPower);

    }
}
