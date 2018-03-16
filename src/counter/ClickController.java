package counter;

import javafx.fxml.FXML;
import javafx.scene.control.Button;

/**
 * Controller for the Counter buttons user interface.
 * 
 * @author Visurt Anuttivong
 *
 */
public class ClickController {
	@FXML
	private Button plusbutton;
	@FXML
	private Button minusbutton;
	/** The counter that records button clicks. */
	private Counter counter;
	
	/**
	 * Gets the counter.
	 * 
	 * @return the counter
	 */
	public Counter getCounter() {
		return counter;
	}

	/**
	 * Sets the counter
	 * @param counter the new counter to set in
	 */
	public void setCounter(Counter counter) {
		this.counter = counter;
	}

	/**
	 * Plus Button Handler is to increase the counter by 1.
	 */
	public void plusButtonHandler() {
		counter.add(1);
	}
	
	/**
	 * Minus Button Handler is to decrease the counter by 1.
	 */
	public void minusButtonHandler() {
		counter.add(-1);
	}
}
