package com.continuum.generation.main;

import java.util.ServiceLoader;

import com.continuum.generation.spi.GenerationService;
import com.continuum.generation.spi.Schedule;

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
				.map(GenerationService::generate)
				.forEach(Main::print);
	}

	private static void print(Schedule schedule) {
		System.out.println(schedule.getName() + " with level: " + schedule.getLevel());
	}

}
