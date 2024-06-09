package Project3;

/**
 * Creates a customer object that extends the functionality of the Person class and 
 * implements the Printable interface to generate file data.
 */
public class Customer extends Person implements Printable
{
	private String customerId, accountNumber;
	
	/**
	 * Constructor of new Customer objects and leverages inheritance from the Person class
	 * @param firstName The first name of the customer object
	 * @param lastName The last name of the customer object
	 * @param address The address of the customer object
	 * @param phoneNumber The phone number of the customer object
	 * @param email The email of the customer object
	 * @param customerId The unique customer ID of the customer object
	 * @param accountNumber The account number of the customer object
	 */
	public Customer(String firstName, String lastName, String address, String phoneNumber, String email,
					String customerId, String accountNumber)
	{
		super(firstName, lastName, address, phoneNumber, email);
		this.customerId = customerId;
		this.accountNumber = accountNumber;
	}
	
	/**
	 * Gets the file data associated with the Customer object
	 *@return The customer object file data
	 */
	@Override
	public String getFileData()
	{
		return customerId + "," + super.getFileData() + "," + accountNumber;
		
	}

	/**
	 * Gets the account number of the Customer object
	 * @return The account number
	 */
	public String getAccountNumber() {
		return accountNumber;
	}

	/**
	 *  Sets the account number to be associated to the Customer object
	 * @param accountNumber The account number of the Customer object
	 */
	public void setAccountNumber(String accountNumber) {
		this.accountNumber = accountNumber;
	}

	/**
	 * Gets the customer ID of the customer ID
	 * @return The customer ID of the Customer object
	 */
	public String getCustomerId() {
		return customerId;
	}

	/**
	 *  Sets the customer ID to be associated to the Customer object
	 * @param customerId The customer ID of the customer object
	 */
	public void setCustomerId(String customerId) {
		this.customerId = customerId;
	}

}
