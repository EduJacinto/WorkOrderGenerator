package Project3;

/**
 * Creates Person objects that contain first name, last name, address, phone number, and email information.
 * Implements the Printable interface to generate file data.
 */
public class Person implements Printable
{
	
	private String firstName, lastName, address, phoneNumber, email;
	
	
	/**]/**
	 * Person object constructor 
	 * @param firstName The first name to be passed to the object
	 * @param lastName The last name to be passed to the object
	 * @param address The address to be passed to the object
	 * @param phoneNumber The phone number to be passed to the object
	 * @param email The email to be passed to the object
	 */
	public Person(String firstName, String lastName, String address, String phoneNumber, String email)
	{
		this.firstName= firstName;
		this.lastName = lastName;
		this.address =address;
		this.phoneNumber = phoneNumber;
		this.email = email;
	}

	/**
	 * Gets first name of the person object
	 * @return The first name of the person object
	 */
	public String getFirstName() 
	{
		return firstName;
	}

	/**
	 * sets the first name of the person object
	 * @param firstName The string containing the first name 
	 */
	public void setFirstName(String firstName) 
	{
		this.firstName = firstName;
	}

	/**
	 * Gets the last name of the person object
	 * @return The last name of the person object
	 */
	public String getLastName() 
	{
		return lastName;
	}

	/**
	 * sets the last name of the person object
	 * @param lastName The last name of the person object
	 */
	public void setLastName(String lastName) 
	{
		this.lastName = lastName;
	}

	/**
	 * gets the address associated with the person object
	 * @return The address of the person object
	 */
	public String getAddress() 
	{
		return address;
	}

	/**
	 * sets the address to be associated with the person object
	 * @param address The address to be given to the person object
	 */
	public void setAddress(String address) 
	{
		this.address = address;
	}

	/**
	 * gets the phone number of the person object
	 * @return The phone number associated with the person object
	 */
	public String getPhoneNumber() {
		return phoneNumber;
	}

	/**
	 * sets the phone number to be associated with the phone number
	 * @param phoneNumber The phone number to be associated with the person object
	 */
	public void setPhoneNumber(String phoneNumber) 
	{
		this.phoneNumber = phoneNumber;
	}

	/**
	 * Gets the email of the person object
	 * @return The email associated to the person object
	 */
	public String getEmail() 
	{
		return email;
	}

	/**
	 * Sets the email to be associated with the person object
	 * @param email The email to be associated with the person object
	 */
	public void setEmail(String email) 
	{
		this.email = email;
	}
	
	/**
	 * gets the File Data of the person object
	 *@return A string containing the first name, last name, phone number, address, and email of the person object.
	 */
	@Override
	public String getFileData()
	{
		return firstName + "," + lastName + "," + address + "," + phoneNumber + "," +email;
	}

	
	
}