/*******************************************************************************
 * 2016, All rights reserved.
 *******************************************************************************/

import java.util.Date;
// Start of user code (user defined imports)

// End of user code

/**
 * Description of Price.
 * 
 * @author A25481
 */
public class Price {
	/**
	 * Description of the property emission.
	 */
	public Date emission = new Date();

	/**
	 * Description of the property reservation.
	 */
	public AddToCart reservation = null;

	/**
	 * Description of the property id.
	 */
	public Object id = ;
	
	// Start of user code (user defined attributes for Price)

	// End of user code

	/**
	 * The constructor.
	 */
	public Price() {
		// Start of user code constructor for Price)
		super();
		// End of user code
	}

	// Start of user code (user defined methods for Price)

	// End of user code
	/**
	 * Returns emission.
	 * @return emission 
	 */
	public Date getEmission() {
		return this.emission;
	}

	/**
	 * Sets a value to attribute emission. 
	 * @param newEmission 
	 */
	public void setEmission(Date newEmission) {
		this.emission = newEmission;
	}

	/**
	 * Returns reservation.
	 * @return reservation 
	 */
	public AddToCart getReservation() {
		return this.reservation;
	}

	/**
	 * Sets a value to attribute reservation. 
	 * @param newReservation 
	 */
	public void setReservation(AddToCart newReservation) {
		if (this.reservation != null) {
			this.reservation.set(null);
		}
		this.reservation.set(this);
	}

	/**
	 * Returns id.
	 * @return id 
	 */
	public Object getId() {
		return this.id;
	}

	/**
	 * Sets a value to attribute id. 
	 * @param newId 
	 */
	public void setId(Object newId) {
		this.id = newId;
	}

}
