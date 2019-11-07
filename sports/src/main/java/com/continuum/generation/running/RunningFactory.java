package com.continuum.generation.running;

import com.continuum.generation.spi.GenerationService;

/**
 * @author dj
 */
public class RunningFactory {
	public static GenerationService provider() {
		return new RunningGenerationServiceImpl();
	}
}
