package counter;

import java.util.Observable;

/**
 * Print the counter value on the console whenever it changes.
 * 
 * @author Visurt Anuttivong
 */
public class ConsoleView implements java.util.Observer {
	private Counter counter;

	/**
	 * A ConsoleView with reference to a counter (the subject).
	 * 
	 * @param counter the counter to display.
	 */
	public ConsoleView(Counter counter) {
		this.counter = counter;
	}

	/**
	 * Update the counter and print it out.
	 * 
	 * @param subject not used
	 * @param info to check object null or not
	 */
	public void update(Observable subject, Object info) {
		if (info != null)
			System.out.println(info);
		System.out.println("Count: " + counter.getCount());
	}
}
