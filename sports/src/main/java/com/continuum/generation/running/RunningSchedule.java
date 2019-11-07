package com.continuum.generation.running;

import com.continuum.generation.spi.Level;
import com.continuum.generation.spi.Schedule;

/**
 * @author dj
 */
public class RunningSchedule implements Schedule {
	@Override
	public Level getLevel() {
		return Level.INTERMEDIATE;
	}

	@Override
	public String getName() {
		return "Running schedule from a Continuum Craftsman";
	}
}
