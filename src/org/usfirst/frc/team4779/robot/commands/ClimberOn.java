package org.usfirst.frc.team4779.robot.commands;

import org.usfirst.frc.team4779.robot.Robot;

import edu.wpi.first.wpilibj.command.Command;

/**
 *
 */
public class ClimberOn extends Command {

    public ClimberOn() {
    	requires(Robot.climber);
    	setTimeout(3);
   
    	
    	
        // Use requires() here to declare subsystem dependencies
        // eg. requires(chassis);
    }

    // Called just before this Command runs the first time
    protected void initialize() {
    	Robot.climber.climberOff();
    }

    // Called repeatedly when this Command is scheduled to run
    protected void execute() {
    	Robot.climber.climberOn();
    }

    // Make this return true when this Command no longer needs to run execute()
    protected boolean isFinished() {
       return isTimedOut();
    	//return false;
    }

    // Called once after isFinished returns true
    protected void end() {
    }

    // Called when another command which requires one or more of the same
    // subsystems is scheduled to run
    protected void interrupted() {
    }
}
