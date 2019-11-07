package com.continuum.generation.fitness;

import com.continuum.generation.spi.GenerationService;
import com.continuum.generation.spi.Schedule;

/**
 * @author dj
 */
public class FitnessGenerationServiceImpl implements GenerationService {
	@Override
	public Schedule generateSchedule() {
		return new FitnessSchedule();
	}
}
