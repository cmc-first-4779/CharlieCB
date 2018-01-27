package org.usfirst.frc.team4779.robot.subsystems;

import org.usfirst.frc.team4779.robot.RobotMap;
import org.usfirst.frc.team4779.robot.commands.ShooterOff;

import edu.wpi.first.wpilibj.Spark;
import edu.wpi.first.wpilibj.command.Subsystem;

/**
 *
 */
public class Shooter extends Subsystem {
	Spark shooterMotor = new Spark(RobotMap.shooter);
	
	public Shooter() {
		super();
		}
	
	public void initDefaultCommand() {
    	setDefaultCommand(new ShooterOff());    
    }
    
    public void shooterOn() {
    	shooterMotor.set(RobotMap.shooterMotorPower);	
    }
    
    public void shooterOff(){
    	shooterMotor.set(0);
    }
    

    // Put methods for controlling this subsystem
    // here. Call these from Commands.

   
}

