package org.firstinspires.ftc.teamcode.robot.opmode.autonomous;

import com.qualcomm.robotcore.eventloop.opmode.Autonomous;
import com.qualcomm.robotcore.eventloop.opmode.LinearOpMode;

import org.firstinspires.ftc.teamcode.robot.subsystem.*;

@Autonomous(name="main Auto", group="Autonomous")
public class Auto extends LinearOpMode {
    Drivetrain drivetrain;
    Intake intake;
    Shooter shooter;
    Storage storage;

    @Override
    public void runOpMode() throws InterruptedException {

    }
}
