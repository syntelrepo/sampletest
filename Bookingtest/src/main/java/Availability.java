/*******************************************************************************
 * 2016, All rights reserved.
 *******************************************************************************/

import java.util.Date;
// Start of user code (user defined imports)

// End of user code

/**
 * Description of Availability.
 * 
 * @author A25481
 */
public class Availability {
	/**
	 * Description of the property start.
	 */
	public Date start = new Date();

	/**
	 * Description of the property end.
	 */
	public Date end = new Date();

	// Start of user code (user defined attributes for Availability)

	// End of user code

	/**
	 * The constructor.
	 */
	public Availability() {
		// Start of user code constructor for Availability)
		super();
		// End of user code
	}

	// Start of user code (user defined methods for Availability)

	// End of user code
	/**
	 * Returns start.
	 * @return start 
	 */
	public Date getStart() {
		return this.start;
	}

	/**
	 * Sets a value to attribute start. 
	 * @param newStart 
	 */
	public void setStart(Date newStart) {
		this.start = newStart;
	}

	/**
	 * Returns end.
	 * @return end 
	 */
	public Date getEnd() {
		return this.end;
	}

	/**
	 * Sets a value to attribute end. 
	 * @param newEnd 
	 */
	public void setEnd(Date newEnd) {
		this.end = newEnd;
	}

}
