package org.usfirst.frc.team4779.robot.commands;

import org.usfirst.frc.team4779.robot.Robot;

import edu.wpi.first.wpilibj.command.Command;

/**
 *
 */
public class SweeperOn extends Command {

    public SweeperOn() {
    	requires(Robot.sweeper);
    	setTimeout(10);
    }
 // Called just before this Command runs the first time
    protected void initialize() {
    	Robot.sweeper.sweeperOn();
    }

    // Called repeatedly when this Command is scheduled to run
    protected void execute() {
    	Robot.sweeper.sweeperOn();
    }

    // Make this return true when this Command no longer needs to run execute()
    protected boolean isFinished() {
        return isTimedOut();
    }
    protected void end() {
    	Robot.sweeper.sweeperOff();
    }

    // Called when another command which requires one or more of the same
    // subsystems is scheduled to run
    protected void interrupted() {
    }
}
