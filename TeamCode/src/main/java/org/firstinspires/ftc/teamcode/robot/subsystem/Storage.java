package org.firstinspires.ftc.teamcode.robot.subsystem;

import com.qualcomm.robotcore.hardware.DcMotor;
import com.qualcomm.robotcore.hardware.HardwareMap;

public class Storage {
    private DcMotor storageMotor;
    public Storage(HardwareMap hardwareMap) {
        storageMotor = hardwareMap.get(DcMotor.class, "StorageMotor");

        storageMotor.setZeroPowerBehavior(DcMotor.ZeroPowerBehavior.BRAKE);
    }

    public void storage () {
        storageMotor.setPower(1);
    }

    public void stop () {
        storageMotor.setPower(0);
    }
}
