import generation.fitness.FitnessFactory;
import generation.running.RunningFactory;

module generation.sports {
	requires generation.exercise;

	exports generation.fitness;
	exports generation.running;

	provides generation.spi.GenerationService with FitnessFactory, RunningFactory;
}
