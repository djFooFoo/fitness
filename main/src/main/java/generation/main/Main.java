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

		ServiceLoader.load(GenerationService.class)
				.stream()
				.map(ServiceLoader.Provider::get)
				.map(GenerationService::generateSchedule)
				.forEach(Main::printSchedule);
	}

	private static void printSchedule(Schedule schedule) {
		System.out.println(schedule.getName() + " with level: " + schedule.getLevel());
	}

}
