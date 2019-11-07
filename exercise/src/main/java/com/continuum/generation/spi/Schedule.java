package com.continuum.generation.spi;

public interface Schedule {
	default String getName() {
		return "Fitness schedule";
	}

	Level getLevel();
}
