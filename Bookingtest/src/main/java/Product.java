/*******************************************************************************
 * 2016, All rights reserved.
 *******************************************************************************/

// Start of user code (user defined imports)

// End of user code

/**
 * Description of Product.
 * 
 * @author A25481
 */
public class Product {
	/**
	 * Description of the property name.
	 */
	public Object name = ;

	/**
	 * Description of the property customers.
	 */
	public HashSet<DiscountCoupon> customers = new HashSet<DiscountCoupon>();

	/**
	 * Description of the property offers.
	 */
	public HashSet<Category> offers = new HashSet<Category>();

	/**
	 * Description of the property reservations.
	 */
	public HashSet<AddToCart> reservations = new HashSet<AddToCart>();

	// Start of user code (user defined attributes for Product)

	// End of user code

	/**
	 * The constructor.
	 */
	public Product() {
		// Start of user code constructor for Product)
		super();
		// End of user code
	}

	// Start of user code (user defined methods for Product)

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
	 * Returns customers.
	 * @return customers 
	 */
	public HashSet<DiscountCoupon> getCustomers() {
		return this.customers;
	}

	/**
	 * Returns offers.
	 * @return offers 
	 */
	public HashSet<Category> getOffers() {
		return this.offers;
	}

	/**
	 * Returns reservations.
	 * @return reservations 
	 */
	public HashSet<AddToCart> getReservations() {
		return this.reservations;
	}

}
