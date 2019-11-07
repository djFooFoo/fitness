package com.continuum.generation.spi;

/**
 * @author dj
 */
public interface GenerationService {
	/**
	 * Generates a fitness schedule.
	 * @return the schedule.
	 */
	Schedule generate();
}
