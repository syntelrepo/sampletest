/*******************************************************************************
 * 2016, All rights reserved.
 *******************************************************************************/

// Start of user code (user defined imports)

// End of user code

/**
 * Description of Category.
 * 
 * @author A25481
 */
public class Category {
	/**
	 * Description of the property name.
	 */
	public Object name = ;

	/**
	 * Description of the property destination.
	 */
	public Object destination = ;

	/**
	 * Description of the property availabilityRanges.
	 */
	public HashSet<Availability> availabilityRanges = new HashSet<Availability>();

	// Start of user code (user defined attributes for Category)

	// End of user code

	/**
	 * The constructor.
	 */
	public Category() {
		// Start of user code constructor for Category)
		super();
		// End of user code
	}

	// Start of user code (user defined methods for Category)

	// End of user code
	/**
	 * Returns name.
	 * @return name 
	 */
	public Object getName() {
		return this.name;
	}

	/**
	 * Sets a value to attribute name. 
	 * @param newName 
	 */
	public void setName(Object newName) {
		this.name = newName;
	}

	/**
	 * Returns destination.
	 * @return destination 
	 */
	public Object getDestination() {
		return this.destination;
	}

	/**
	 * Sets a value to attribute destination. 
	 * @param newDestination 
	 */
	public void setDestination(Object newDestination) {
		this.destination = newDestination;
	}

	/**
	 * Returns availabilityRanges.
	 * @return availabilityRanges 
	 */
	public HashSet<Availability> getAvailabilityRanges() {
		return this.availabilityRanges;
	}

}
