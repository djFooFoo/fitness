package generation.fitness;

import generation.spi.Level;
import generation.spi.Schedule;

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
		return "Running schedule from a Continuum Craft Lead";
	}
}
