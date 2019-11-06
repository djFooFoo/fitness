package generation.fitness;

import generation.spi.GenerationService;

/**
 * @author dj
 */
public class FitnessFactory {
	public static GenerationService provider() {
		return new FitnessGenerationServiceImpl();
	}
}
