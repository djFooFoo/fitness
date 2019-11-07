package com.continuum.generation.running;

import com.continuum.generation.spi.GenerationService;
import com.continuum.generation.spi.Schedule;

/**
 * @author dj
 */
public class RunningGenerationServiceImpl implements GenerationService {
	@Override
	public Schedule generate() {
		return new RunningSchedule();
	}
}
