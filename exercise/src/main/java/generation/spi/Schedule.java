package generation.spi;

public interface Schedule {
	default String getName() {
		return "fitness schedule";
	}

	Level getLevel();
}
