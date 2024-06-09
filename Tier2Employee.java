package Project3;

/**
 * Class that creates tier 2 employee objects. Extends functionality of the Employee class.
 * Implements the Printable interface to generate Tier2Employe file data.
 */
public class Tier2Employee extends Employee implements Printable
{
	private String certification;
	
	/**
	 * Constructor for Tier2Employee objects, leverages inheritance from the Employee class
	 * @param firstName The first name of the Tier2Employee object
	 * @param lastName The last name of the Tier2Employee object
	 * @param address The address of the Tier2Employee object
	 * @param phoneNumber The phone number of the Tier2Employee object
	 * @param email The email of the Tier2Employee object
	 * @param employeeId The unique employee ID of the Tier2Employee object
	 * @param clockedIn The clock in time of the Tier2Employee object
	 * @param hiredDate The hire date of the Tier2Employee object
	 * @param certification The certification of the Tier2Employee object
	 */
	public Tier2Employee(String firstName, String lastName, String address, String phoneNumber,
		   String email, String employeeId, String clockedIn, String hiredDate, String certification)
	{
		super(firstName, lastName, address, phoneNumber, email, employeeId, clockedIn, hiredDate);
		this.certification = certification; 
	}
	/**
	 * Gets file data of the Tier2Employee object
	 * @return The file data associated with the Tier2Employee object
	 */
	@Override
	public String getFileData()
	{
		return super.getFileData() + "," + certification;
	}

	/**
	 * gets the certification of the Tier2Employe object
	 * @return The certification of the Tier2Employee object
	 */
	public String getCertification() {
		return certification;
	}

	/**
	 * Sets the certification of the Tier2Employee object
	 * @param certification The certification to be associated to the Tier2EMployee object
	 */
	public void setCertification(String certification) {
		this.certification = certification;
	}
	
}