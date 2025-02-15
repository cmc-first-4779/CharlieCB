package org.usfirst.frc.team4779.robot.commands;

import org.usfirst.frc.team4779.robot.Robot;

import edu.wpi.first.wpilibj.command.Command;

/**
 *
 */
public class CarouselOff extends Command {

    public CarouselOff() {
    	requires(Robot.carousel);
    }

    // Called just before this Command runs the first time
    protected void initialize() {
    	Robot.carousel.carouselOff();
    }

    // Called repeatedly when this Command is scheduled to run
    protected void execute() {
    	Robot.carousel.carouselOff();
    }

    // Make this return true when this Command no longer needs to run execute()
    protected boolean isFinished() {
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
