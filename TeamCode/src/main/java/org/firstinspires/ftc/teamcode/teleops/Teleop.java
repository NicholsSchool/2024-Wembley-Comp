package org.firstinspires.ftc.teamcode.teleops;

import com.qualcomm.robotcore.eventloop.opmode.OpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;

import org.firstinspires.ftc.teamcode.robot.RobotContainer;
import org.firstinspires.ftc.teamcode.utils.Constants;

/**
 * Blue Teleop
 */
@TeleOp(name = "Teleop")
public class Teleop extends OpMode implements Constants {
    private RobotContainer robotContainer;

    /*
     * Code to run ONCE when the driver hits INIT
     */
    @Override
    public void init() {
        robotContainer = new RobotContainer(hardwareMap, false, gamepad1, gamepad2);
    }

    /*
     * Code to run REPEATEDLY after the driver hits PLAY but before they hit STOP
     */
    @Override
    public void loop() {
        robotContainer.robot();
    }
}