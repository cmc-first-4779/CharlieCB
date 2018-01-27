package org.usfirst.frc.team4779.robot.subsystems;

import org.usfirst.frc.team4779.robot.RobotMap;
import org.usfirst.frc.team4779.robot.commands.SweeperOff;

import edu.wpi.first.wpilibj.Spark;
import edu.wpi.first.wpilibj.command.Subsystem;

/**
 *
 */
public class Sweeper extends Subsystem {
	Spark sweeperMotor = new Spark(RobotMap.sweeper);
	
	public Sweeper() {
		super();
		}
	
	public void initDefaultCommand() {
    	setDefaultCommand(new SweeperOff());    
    }
    
    public void sweeperOn() {
    	sweeperMotor.set(-1);	
    }
  
    public void sweeperOff() {
    	sweeperMotor.set(0);
    }
    

    // Put methods for controlling this subsystem
    // here. Call these from Commands.

   
}
