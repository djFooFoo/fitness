package com.continuum.generation.spi;

/**
 * @author dj
 */

public enum Level {
	ADVANCED("Advanced"),
	INTERMEDIATE("Intermediate"),
	BEGINNER("Beginner");

	private String level;

	Level(String level) {
		this.level = level;
	}

	@Override
	public String toString() {
		return this.level;
	}
}
