package counter;

/**
 * A simple counter.
 * 
 * @author Visurt Anuttivong
 */
public class Counter extends java.util.Observable {
	private int count;
	
	/**
	 * Initializes a new counter.
	 */
	public Counter() {
		this.count = 0;
	}
	
	/**
	 * Adds new amount to counter
	 * 
	 * @param howmuch the amount
	 */
	public void add(int howmuch) {
		count += howmuch;
		
		setChanged();
		notifyObservers();
	}
	
	/**
	 * Gets the current count.
	 * 
	 * @return the count
	 */
	public int getCount() {
		return count;
	}
}
