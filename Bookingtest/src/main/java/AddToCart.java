/*******************************************************************************
 * 2016, All rights reserved.
 *******************************************************************************/

import java.util.Date;
// Start of user code (user defined imports)

// End of user code

/**
 * Description of AddToCart.
 * 
 * @author A25481
 */
public class AddToCart {
	/**
	 * Description of the property status.
	 */
	public ReservationStatus status = null;

	/**
	 * Description of the property issuedOn.
	 */
	public Date issuedOn = new Date();

	/**
	 * Description of the property agency.
	 */
	public Product agency = null;

	// Start of user code (user defined attributes for AddToCart)

	// End of user code

	/**
	 * The constructor.
	 */
	public AddToCart() {
		// Start of user code constructor for AddToCart)
		super();
		// End of user code
	}

	// Start of user code (user defined methods for AddToCart)

	// End of user code
	/**
	 * Returns status.
	 * @return status 
	 */
	public ReservationStatus getStatus() {
		return this.status;
	}

	/**
	 * Sets a value to attribute status. 
	 * @param newStatus 
	 */
	public void setStatus(ReservationStatus newStatus) {
		this.status = newStatus;
	}

	/**
	 * Returns issuedOn.
	 * @return issuedOn 
	 */
	public Date getIssuedOn() {
		return this.issuedOn;
	}

	/**
	 * Sets a value to attribute issuedOn. 
	 * @param newIssuedOn 
	 */
	public void setIssuedOn(Date newIssuedOn) {
		this.issuedOn = newIssuedOn;
	}

	/**
	 * Returns agency.
	 * @return agency 
	 */
	public Product getAgency() {
		return this.agency;
	}

	/**
	 * Sets a value to attribute agency. 
	 * @param newAgency 
	 */
	public void setAgency(Product newAgency) {
		this.agency = newAgency;
	}

}
