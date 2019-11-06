package generation.running;

import generation.spi.GenerationService;

/**
 * @author dj
 */
public class RunningFactory {
	public static GenerationService provider() {
		return new RunningGenerationServiceImpl();
	}
}
