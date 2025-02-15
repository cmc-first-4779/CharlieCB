/*----------------------------------------------------------------------------*/
/* Copyright (c) 2017-2018 FIRST. All Rights Reserved.                        */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package org.usfirst.frc.team4779.robot;

import org.usfirst.frc.team4779.robot.commands.CarouselOn;
import org.usfirst.frc.team4779.robot.commands.ClimberOn;
import org.usfirst.frc.team4779.robot.commands.GobblerClose;
import org.usfirst.frc.team4779.robot.commands.GobblerOpen;
import org.usfirst.frc.team4779.robot.commands.Shoot;
import org.usfirst.frc.team4779.robot.commands.ShooterOn;
import org.usfirst.frc.team4779.robot.commands.SweeperOn;
import org.usfirst.frc.team4779.robot.commands.TurnRight;
import org.usfirst.frc.team4779.robot.commands.DriveStraight;

import edu.wpi.first.wpilibj.Joystick;
import edu.wpi.first.wpilibj.buttons.JoystickButton;

/**
 * This class is the glue that binds the controls on the physical operator
 * interface to the commands and command groups that allow control of the robot.
 */
public class OI {
	
	//Declare the two joysticks
	Joystick driverStick = new Joystick(RobotMap.driverStickUSBPort);
	Joystick operStick = new Joystick(RobotMap.operStickUSBPort);
	
	public OI() {
		JoystickButton operStickYButton = new JoystickButton(operStick,RobotMap.yButton);
		JoystickButton operStickXButton = new JoystickButton(operStick, RobotMap.xButton);
		JoystickButton operStickAButton = new JoystickButton(operStick, RobotMap.aButton);
		JoystickButton operStickBButton = new JoystickButton(operStick, RobotMap.bButton);
		JoystickButton driverStickLeftBumper = new JoystickButton(driverStick, RobotMap.leftBumperButton);
		JoystickButton driverStickRightBumper = new JoystickButton(driverStick, RobotMap.rightBumperButton);
		JoystickButton driverStickBButton = new JoystickButton(driverStick, RobotMap.bButton);
		JoystickButton driverStickAButton = new JoystickButton(driverStick, RobotMap.aButton);
		
		
		/*Set up the Oper Stick buttons to call the right commands.
		 * X turns on the Carousel
		 * Y turns on the Climber
		 * A turns on the Sweeper
		 * B turns on the Shooter
		 */
		operStickXButton.whenPressed(new CarouselOn());
		operStickYButton.whenPressed(new ClimberOn()); 
		operStickAButton.whenPressed(new SweeperOn());
		operStickBButton.whileHeld(new Shoot());
		driverStickBButton.whileHeld(new DriveStraight());
		driverStickAButton.whenPressed(new TurnRight());
		
		driverStickLeftBumper.whileHeld(new GobblerOpen());
		driverStickRightBumper.whileHeld(new GobblerClose());
		
	}
	 public Joystick getDriverStick() {
		return driverStick;
	 }
	
	
	//// CREATING BUTTONS
	// One type of button is a joystick button which is any button on a
	//// joystick.
	// You create one by telling it which joystick it's on and which button
	// number it is.
	// Joystick stick = new Joystick(port);
	// Button button = new JoystickButton(stick, buttonNumber);

	// There are a few additional built in buttons you can use. Additionally,
	// by subclassing Button you can create custom triggers and bind those to
	// commands the same as any other Button.

	//// TRIGGERING COMMANDS WITH BUTTONS
	// Once you have a button, it's trivial to bind it to a button in one of
	// three ways:

	// Start the command when the button is pressed and let it run the command
	// until it is finished as determined by it's isFinished method.
	// button.whenPressed(new ExampleCommand());

	// Run the command while the button is being held down and interrupt it once
	// the button is released.
	// button.whileHeld(new ExampleCommand());

	// Start the command when the button is released and let it run the command
	// until it is finished as determined by it's isFinished method.
	// button.whenReleased(new ExampleCommand());
}
