import com.continuum.generation.fitness.FitnessFactory;
import com.continuum.generation.running.RunningFactory;

module com.continuum.generation.sports {
	requires com.continuum.generation.exercise;

	exports com.continuum.generation.fitness;
	exports com.continuum.generation.running;

	provides com.continuum.generation.spi.GenerationService with FitnessFactory, RunningFactory;
}
