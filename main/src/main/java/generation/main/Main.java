package generation.main;

import java.util.ServiceLoader;

import generation.spi.GenerationService;
import generation.spi.Schedule;

/**
 * @author dj
 */
public class Main {
	public static void main(String[] args) {
		// We don't specify where our implementation is coming from. This is not decided at compile time, but at run time.
		// Notice that we do specify the runtime dependency in the pom.xml, so that's where the implementations come from!
		ServiceLoader<GenerationService> generationServices = ServiceLoader.load(GenerationService.class);

		System.out.println("We found " + generationServices.stream().count() + " generation services.");

		for(GenerationService generationService: generationServices){
			Schedule schedule = generationService.generateSchedule();
			System.out.println(schedule.getName() + " with level: " + schedule.getLevel());
		}
	}

}
