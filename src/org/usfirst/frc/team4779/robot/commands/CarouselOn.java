package org.usfirst.frc.team4779.robot.commands;

import org.usfirst.frc.team4779.robot.Robot;

import edu.wpi.first.wpilibj.command.Command;

/**
 *
 */
public class CarouselOn extends Command {

    public CarouselOn() {
    	requires(Robot.carousel);
    	setTimeout(10);
    }

    // Called just before this Command runs the first time
    protected void initialize() {
    	Robot.carousel.carouselOn();
    }

    // Called repeatedly when this Command is scheduled to run
    protected void execute() {
    	Robot.carousel.carouselOn();
    }

    // Make this return true when this Command no longer needs to run execute()
    protected boolean isFinished() {
        return isTimedOut();
    }

    // Called once after isFinished returns true
    protected void end() {
    }

    // Called when another command which requires one or more of the same
    // subsystems is scheduled to run
    protected void interrupted() {
    }
}
