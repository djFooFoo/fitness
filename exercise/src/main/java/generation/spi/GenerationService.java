package generation.spi;

/**
 * @author dj
 */
public interface GenerationService {
	/**
	 * @return the fitness schedule.
	 */
	Schedule generateSchedule();
}
