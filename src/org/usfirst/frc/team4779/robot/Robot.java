/*----------------------------------------------------------------------------*/
/* Copyright (c) 2017-2018 FIRST. All Rights Reserved.                        */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package org.usfirst.frc.team4779.robot;


import edu.wpi.first.wpilibj.IterativeRobot;
import edu.wpi.first.wpilibj.command.Command;
import edu.wpi.first.wpilibj.command.Scheduler;
import edu.wpi.first.wpilibj.smartdashboard.SendableChooser;
import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;

import org.usfirst.frc.team4779.robot.commands.Shoot;
import org.usfirst.frc.team4779.robot.commands.DriveStraight;
import org.usfirst.frc.team4779.robot.commands.DriveTest;
import org.usfirst.frc.team4779.robot.subsystems.Carousel;
import org.usfirst.frc.team4779.robot.subsystems.Climber;
import org.usfirst.frc.team4779.robot.subsystems.DriveTrain;
import org.usfirst.frc.team4779.robot.subsystems.Gobbler;
import org.usfirst.frc.team4779.robot.subsystems.Shooter;
import org.usfirst.frc.team4779.robot.subsystems.Sweeper;

/**
 * The VM is configured to automatically run this class, and to call the
 * functions corresponding to each mode, as described in the TimedRobot
 * documentation. If you change the name of this class or the package after
 * creating this project, you must also update the build.properties file in the
 * project.
 */
public class Robot extends IterativeRobot {
//	public static final ExampleSubsystem kExampleSubsystem
//			= new ExampleSubsystem();
	Command m_autonomousCommand;
	public static Sweeper sweeper;
	public static Shooter shooter;
	public static Carousel carousel;
	public static Climber climber;
	public static Gobbler gobbler;
	public static DriveTrain driveTrain;
	public static OI m_oi;
	
	


	
//	SendableChooser<Command> m_chooser = new SendableChooser<>();
	/**
	 * This function is run when the robot is first started up and should be
	 * used for any initialization code.
	 */
	@Override
	public void robotInit() {
		driveTrain = new DriveTrain();
		sweeper = new Sweeper();
		shooter = new Shooter();
		carousel = new Carousel();
		climber = new Climber();
		gobbler = new Gobbler ();
		
		//   MUST DEFINE THE OI LAST!!!!!!
		m_oi = new OI();
		
	/*	m_chooser.addDefault("Default Auto", new ExampleCommand());
		// chooser.addObject("My Auto", new MyAutoCommand());
		SmartDashboard.putData("Auto mode", m_chooser); */
	
		Robot.driveTrain.resetGyro();
		Robot.driveTrain.calibrateGyro();
		SmartDashboard.putData(climber);
		SmartDashboard.putData(driveTrain);
	}

	/**
	 * This function is called once each time the robot enters Disabled mode.
	 * You can use it to reset any subsystem information you want to clear when
	 * the robot is disabled.
	 */
	@Override
	public void disabledInit() {

	}

	@Override
	public void disabledPeriodic() {
		Scheduler.getInstance().run();
	}

	/**
	 * This autonomous (along with the chooser code above) shows how to select
	 * between different autonomous modes using the dashboard. The sendable
	 * chooser code works with the Java SmartDashboard. If you prefer the
	 * LabVIEW Dashboard, remove all of the chooser code and uncomment the
	 * getString code to get the auto name from the text box below the Gyro
	 *
	 * <p>You can add additional auto modes by adding additional commands to the
	 * chooser code above (like the commented example) or additional comparisons
	 * to the switch structure below with additional strings & commands.
	 */
	@Override
	public void autonomousInit() {
		
		m_autonomousCommand = new DriveTest();
		m_autonomousCommand.start();
		
		//m_autonomousCommand = m_chooser.getSelected();

		/*
		 * Auton no problem!
		 * String autoSelected = SmartDashboard.getString("Auto Selector",
		 * "Default"); switch(autoSelected) { case "My Auto": autonomousCommand
		 * = new MyAutoCommand(); break; case "Default Auto": default:
		 * autonomousCommand = new ExampleCommand(); break; }
		 */

		// schedule the autonomous command (example)
		if (m_autonomousCommand != null) {
			m_autonomousCommand.start();
		}
	}

	/**
	 * This function is called periodically during autonomous.
	 */
	@Override
	public void autonomousPeriodic() {
		Scheduler.getInstance().run();
		log();
	}

	@Override
	public void teleopInit() {
		// This makes sure that the autonomous stops running when
		// teleop starts running. If you want the autonomous to
		// continue until interrupted by another command, remove
		// this line or comment it out.
		if (m_autonomousCommand != null) {
			m_autonomousCommand.cancel();
		}
	}

	/**
	 * This function is called periodically during operator control.
	 */
	@Override
	public void teleopPeriodic() {
		Scheduler.getInstance().run();
	}

	/**
	 * This function is called periodically during test mode.
	 */
	@Override
	public void testPeriodic() {
	}
	
	/**
	 * The log method puts interesting information to the SmartDashboard.
	 */
	private void log() {
		//climber.log();
	}
}
