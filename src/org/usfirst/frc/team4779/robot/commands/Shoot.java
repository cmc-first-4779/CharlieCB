package org.usfirst.frc.team4779.robot.commands;

import edu.wpi.first.wpilibj.command.CommandGroup;

/**
 *
 */
public class Shoot extends CommandGroup {

    public Shoot() {
    	addSequential(new ShooterOn(2));
    	addParallel(new CarouselOn());
    	addParallel(new ShooterOn());
    }
}
