package org.usfirst.frc.team4779.robot.commands;

import org.usfirst.frc.team4779.robot.Robot;

import edu.wpi.first.wpilibj.command.Command;

/**
 *
 */
public class GobblerOpen extends Command {

    public GobblerOpen() {
    	requires(Robot.gobbler);
    	//setTimeout(10);
    }

    // Called just before this Command runs the first time
    protected void initialize() {
    	Robot.gobbler.gobblerOpen();
    }

    // Called repeatedly when this Command is scheduled to run
    protected void execute() {
    	Robot.gobbler.gobblerOpen();
    }

    // Make this return true when this Command no longer needs to run execute()
    protected boolean isFinished() {
        //return isTimedOut();
    	return false;
    }

    // Called once after isFinished returns true
    protected void end() {
    }

    // Called when another command which requires one or more of the same
    // subsystems is scheduled to run
    protected void interrupted() {
    }
}
