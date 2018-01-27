package org.usfirst.frc.team4779.robot.subsystems;

import org.usfirst.frc.team4779.robot.RobotMap;
import org.usfirst.frc.team4779.robot.commands.GobblerOff;

import edu.wpi.first.wpilibj.Spark;
import edu.wpi.first.wpilibj.command.Subsystem;

/**
 *
 */
public class Gobbler extends Subsystem {
		Spark gobblerMotor = new Spark(RobotMap.gobbler);
		
		public Gobbler() {
			super();
			}
		
		public void initDefaultCommand() {
	    	setDefaultCommand(new GobblerOff());    
	    }
	    
	    public void gobblerOpen() {
	    	gobblerMotor.set(RobotMap.gobblerOpenMotorPower);	
	    }
	  
	    public void gobblerClose() {
	    	gobblerMotor.set(RobotMap.gobblerCloseMotorPower);	
	    }
	    
	    public void gobblerOff() {
	    	gobblerMotor.set(0);
	    }
	    

	    // Put methods for controlling this subsystem
	    // here. Call these from Commands.

	   
	}