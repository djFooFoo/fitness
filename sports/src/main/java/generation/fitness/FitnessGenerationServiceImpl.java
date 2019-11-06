package generation.fitness;

import generation.spi.GenerationService;
import generation.spi.Schedule;

/**
 * @author dj
 */
public class FitnessGenerationServiceImpl implements GenerationService {
	@Override
	public Schedule generateSchedule() {
		return new FitnessSchedule();
	}
}
