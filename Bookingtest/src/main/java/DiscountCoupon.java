/*******************************************************************************
 * 2016, All rights reserved.
 *******************************************************************************/

import java.util.HashSet;
// Start of user code (user defined imports)

// End of user code

/**
 * Description of DiscountCoupon.
 * 
 * @author A25481
 */
public class DiscountCoupon {
	/**
	 * Description of the property reservations.
	 */
	public HashSet<AddToCart> reservations = new HashSet<AddToCart>();

	/**
	 * Description of the property name.
	 */
	public Object name = ;

	/**
	 * Description of the property adress.
	 */
	public Object adress = ;
	
	// Start of user code (user defined attributes for DiscountCoupon)

	// End of user code

	/**
	 * The constructor.
	 */
	public DiscountCoupon() {
		// Start of user code constructor for DiscountCoupon)
		super();
		// End of user code
	}

	// Start of user code (user defined methods for DiscountCoupon)

	// End of user code
	/**
	 * Returns reservations.
	 * @return reservations 
	 */
	public HashSet<AddToCart> getReservations() {
		return this.reservations;
	}

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
	 * Returns adress.
	 * @return adress 
	 */
	public Object getAdress() {
		return this.adress;
	}

}
