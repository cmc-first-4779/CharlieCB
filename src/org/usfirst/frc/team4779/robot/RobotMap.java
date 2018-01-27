/*----------------------------------------------------------------------------*/
/* Copyright (c) 2017-2018 FIRST. All Rights Reserved.                        */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package org.usfirst.frc.team4779.robot;

/**
 * The RobotMap is a mapping from the ports sensors and actuators are wired into
 * to a variable name. This provides flexibility changing wiring, makes checking
 * the wiring easier and significantly reduces the number of magic numbers
 * floating around.
 */
public class RobotMap {
	
	//  Map out all of the Spark Controllers to each of the PWM ports on the RoboRIO.
	public static int shooter = 0;
	public static int rearLeftDrive = 1;
	public static int rightRearDrive = 2;
	public static int frontLeftDrive = 3;
	public static int frontRightDrive = 4;
	public static int carousel = 5;
	public static int gobbler = 6;
	//PWM Port #7 is empty.  Nothing is plugged in.
	public static int climbMotor = 8;
	public static int sweeper = 9;
	
	//These are the buttons on the Joysticks. You can call in other subsystems.
	public static int aButton = 1;
	public static int bButton = 2;
	public static int xButton = 3;
	public static int yButton = 4;
	public static int leftBumperButton = 5;
	public static int rightBumperButton = 6;
	public static int xAxisStick = 0;
	public static int yAxisStick = 1;
	
	
	// For example to map the left and right motors, you could define the
	// following variables to use with your drivetrain subsystem.
	// public static int leftMotor = 1;
	// public static int rightMotor = 2;

	// If you are using multiple modules, make sure to define both the port
	// number and the module. For example you with a rangefinder:
	// public static int rangefinderPort = 1;
	// public static int rangefinderModule = 1;
}


