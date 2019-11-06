package generation.running;

import generation.spi.GenerationService;
import generation.spi.Schedule;

/**
 * @author dj
 */
public class RunningGenerationServiceImpl implements GenerationService {
	@Override
	public Schedule generateSchedule() {
		return new RunningSchedule();
	}
}
