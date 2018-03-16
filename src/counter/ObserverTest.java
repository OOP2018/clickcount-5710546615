package counter;

import java.util.Scanner;

/**
 * Test the Observer Observable behavior for counter object.
 * 
 * @author Visurt Anuttivong
 */
public class ObserverTest {
	
	/**
	 * Starts testing and show the result on console.
	 * 
	 * @param args not used
	 */
	public static void main(String[] args) {
		final Scanner console = new Scanner(System.in);
		Counter counter = new Counter();
		ConsoleView view = new ConsoleView(counter);
		counter.addObserver(view);
		
		while(true) {
			System.out.print("Count how many? ");
			int howmany = console.nextInt();
			if (howmany == 0) System.exit(0);
			counter.add(howmany);
		}
	}
}