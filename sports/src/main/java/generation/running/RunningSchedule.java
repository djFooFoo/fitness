package generation.running;

import generation.spi.Level;
import generation.spi.Schedule;

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
