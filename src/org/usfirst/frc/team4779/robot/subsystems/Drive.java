package org.usfirst.frc.team4779.robot.subsystems;

import org.usfirst.frc.team4779.robot.RobotMap;
import org.usfirst.frc.team4779.robot.commands.DriveWithJoystick;

import edu.wpi.first.wpilibj.Spark;
import edu.wpi.first.wpilibj.SpeedControllerGroup;
import edu.wpi.first.wpilibj.command.Subsystem;
import edu.wpi.first.wpilibj.drive.DifferentialDrive;

/**
 *
 */
public class Drive extends Subsystem {

    // Put methods for controlling this subsystem
    // here. Call these from Commands.
	
	Spark leftFrontDrive = new Spark(RobotMap.frontLeftDrive);
	Spark leftRearDrive = new Spark(RobotMap.rearLeftDrive);
	Spark rightFrontDrive = new Spark(RobotMap.frontRightDrive);
	Spark rightRearDrive = new Spark(RobotMap.rightRearDrive);
	
	SpeedControllerGroup leftDrive = new SpeedControllerGroup(leftFrontDrive, leftRearDrive);
	SpeedControllerGroup rightDrive = new SpeedControllerGroup(rightFrontDrive, rightRearDrive);

	DifferentialDrive myDrive = new DifferentialDrive(leftDrive, rightDrive);
	
    public void initDefaultCommand() {
        // Set the default command for a subsystem here.
        //setDefaultCommand(new MySpecialCommand());
    	setDefaultCommand(new DriveWithJoystick());
    }
    
    public void arcadeDrive(double yAxis, double xAxis) {
    	System.out.println(yAxis);
    	myDrive.arcadeDrive(yAxis, -xAxis);
    }	
    
    public void stop() {
    	myDrive.arcadeDrive(0, 0);
    }
}

