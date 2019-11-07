package com.continuum.generation.fitness;

import com.continuum.generation.spi.GenerationService;

/**
 * @author dj
 */
public class FitnessFactory {
	public static GenerationService provider() {
		return new FitnessGenerationServiceImpl();
	}
}
