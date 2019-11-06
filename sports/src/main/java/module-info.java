import generation.fitness.FitnessFactory;
import generation.running.RunningFactory;

module sports {
	requires exercise;

	exports generation.fitness;
	exports generation.running;

	provides generation.spi.GenerationService with FitnessFactory, RunningFactory;
}
