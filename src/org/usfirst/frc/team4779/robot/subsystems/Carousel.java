package org.usfirst.frc.team4779.robot.subsystems;

import org.usfirst.frc.team4779.robot.RobotMap;
import org.usfirst.frc.team4779.robot.commands.CarouselOff;

import edu.wpi.first.wpilibj.Spark;
import edu.wpi.first.wpilibj.command.Subsystem;

/**
 *
 */
public class Carousel extends Subsystem {
	Spark carouselMotor = new Spark(RobotMap.carousel);
	
	public Carousel () {
		super();
		}
	
	public void initDefaultCommand() {
    	setDefaultCommand(new CarouselOff());    
    }
    
    public void carouselOn() {
    	carouselMotor.set(RobotMap.carouselMotorPower);	
    }
    
    public void carouselOff() {
    	carouselMotor.set(0);
    }
    
  
    // Put methods for controlling this subsystem
    // here. Call these from Commands.

  
}

