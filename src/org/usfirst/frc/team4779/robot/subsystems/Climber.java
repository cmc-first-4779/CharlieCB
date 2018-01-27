package org.usfirst.frc.team4779.robot.subsystems;

import org.usfirst.frc.team4779.robot.RobotMap;
import org.usfirst.frc.team4779.robot.commands.ClimberDoNothing;

import edu.wpi.first.wpilibj.Spark;
import edu.wpi.first.wpilibj.command.Subsystem;

/** 
 *
 */
public class Climber extends Subsystem {

 Spark climbMotor = new Spark(RobotMap.climbMotor);
 
 public Climber() {
	 super();
 }

    public void initDefaultCommand() {
    	setDefaultCommand(new ClimberDoNothing());    
    }
    
    public void climberOn() {
    	climbMotor.set(1);	
    }
    public void climberOff() {
    	climbMotor.set(0);	
    }
    
	public void log() {
	}
}

