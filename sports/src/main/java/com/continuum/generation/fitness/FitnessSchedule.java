package com.continuum.generation.fitness;

import com.continuum.generation.spi.Level;
import com.continuum.generation.spi.Schedule;

/**
 * @author dj
 */
public class FitnessSchedule implements Schedule {
	@Override
	public Level getLevel() {
		return Level.ADVANCED;
	}

	@Override
	public String getName() {
		return "Fitness schedule from a Continuum Craft Lead";
	}
}
