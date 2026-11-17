package org.firstinspires.ftc.teamcode.robot.opmode.teleop;

import com.qualcomm.robotcore.eventloop.opmode.OpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;

import org.firstinspires.ftc.teamcode.robot.subsystem.*;
@TeleOp(name = "main TeleOP", group = "TeleOp")
public class TeleOP extends OpMode {
    Drivetrain drivetrain;
    Shooter shooter;
    Storage storage;
    Intake intake;
    PollenServo pollenServo;

    @Override
    public void init() {
        drivetrain = new Drivetrain(hardwareMap);
        intake = new Intake(hardwareMap);
        shooter = new Shooter(hardwareMap);
        storage =  new Storage(hardwareMap);
        pollenServo = new PollenServo(hardwareMap);
    }

    @Override
    public void loop() {
        //TODO controls veranderen
        drivetrain.drive(gamepad1.left_stick_y, gamepad1.right_stick_x);

        if (gamepad1.left_trigger > 0.1) {
            intake.intake();
        } else {
            intake.stop();
        }

        if (gamepad1.right_trigger > 0.1) {
            shooter.shoot();
        } else {
            shooter.stop();
        }

        //TODO marge groter maken
        if (shooter.getVelocity() >= 1140 && shooter.getVelocity() <= 1180) {
            storage.storage();
        } else {
            storage.stop();
        }

        if (gamepad1.left_bumper) {
            pollenServo.down();
        }

        if (gamepad1.right_bumper) {
            pollenServo.up();
        }
    }
}
