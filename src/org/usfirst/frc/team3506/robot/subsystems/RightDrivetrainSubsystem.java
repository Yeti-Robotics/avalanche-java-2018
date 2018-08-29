package org.usfirst.frc.team3506.robot.subsystems;

import org.usfirst.frc.team3506.robot.Robot;
import org.usfirst.frc.team3506.robot.RobotMap;

import edu.wpi.first.wpilibj.command.PIDSubsystem;

/**
 *
 */
public class RightDrivetrainSubsystem extends PIDSubsystem {
	
	public double speed = 1;
	
    public RightDrivetrainSubsystem() {
		super("Right Drivetrain", RobotMap.DRIVE_P, RobotMap.DRIVE_I, RobotMap.DRIVE_D);
		setOutputRange(-.5, .5);
		setAbsoluteTolerance(1);
    }

    public void initDefaultCommand() {
    }

    @Override
    protected double returnPIDInput() {
        return Robot.drivetrainSubsystem.getRightEncoderDistance();
    }

    @Override
    protected void usePIDOutput(double output) {
        Robot.drivetrainSubsystem.moveDriveTrainRight(-output);
    }
}