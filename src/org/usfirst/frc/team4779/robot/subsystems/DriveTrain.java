package org.usfirst.frc.team4779.robot.subsystems;

import org.usfirst.frc.team4779.robot.RobotMap;
import org.usfirst.frc.team4779.robot.commands.DriveJoystick;

import edu.wpi.first.wpilibj.ADXRS450_Gyro;
import edu.wpi.first.wpilibj.Spark;
import edu.wpi.first.wpilibj.SpeedController;
import edu.wpi.first.wpilibj.SpeedControllerGroup;
import edu.wpi.first.wpilibj.command.Subsystem;
import edu.wpi.first.wpilibj.drive.DifferentialDrive;
import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;

/**
 *
 */
public class DriveTrain extends Subsystem {
	
	Spark frontLeftDrive = new Spark(RobotMap.frontLeftDrive);
	Spark frontRightDrive = new Spark(RobotMap.frontRightDrive);
	Spark rearLeftDrive = new Spark(RobotMap.rearLeftDrive);
	Spark rearRightDrive = new Spark(RobotMap.rearRightDrive);
	SpeedControllerGroup myDriveLeft = new SpeedControllerGroup(frontLeftDrive, rearLeftDrive);
	SpeedControllerGroup myDriveRight = new SpeedControllerGroup (frontRightDrive, rearRightDrive);
	
	DifferentialDrive myDrive = new DifferentialDrive(myDriveLeft, myDriveRight);

	ADXRS450_Gyro gyro = new ADXRS450_Gyro();
	double Kp = .4;
	
	public DriveTrain() {
		super("DriveTrain");
		gyro.reset();
		gyro.calibrate();
		System.out.println("Finished gyro calibration");
	}
	
    public void initDefaultCommand() {
        setDefaultCommand(new DriveJoystick());
    }
    public void arcadeDrive(double yAxis, double xAxis) {
    	myDrive.arcadeDrive(yAxis, -xAxis);
    }
    public void stop() {
    	myDrive.arcadeDrive(0,0);
    }
    
    public void driveStraight() {
		SmartDashboard.putNumber("Gryo Angle", gyro.getAngle());
    	double angle = gyro.getAngle();
    	System.out.println("Angle: " + angle);
    	myDrive.arcadeDrive(-.7, Kp*angle );
    }    
    public void turnRight() {
    	myDrive.arcadeDrive(0,-.5);
    	SmartDashboard.putNumber("Gryo Angle", gyro.getAngle());
    }
    public void turnLeft() {
    	myDrive.arcadeDrive(0,.5);
    	 }
    public void calibrateGyro () {
    	gyro.calibrate();
    	System.out.println("Calibration of Gyro Complete");
    }
    public void resetGyro() {
    	gyro.reset();
    }
    public double getGyroAngle() {
    	return gyro.getAngle();
    }
}

