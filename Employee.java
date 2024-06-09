package Project3;

/**
 * Creates Employee objects and extends the functionality of the Person class. 
 * Implements the Printable interface to generate file data.
 */
public class Employee extends Person implements Printable
{
	private String employeeId;
	private String clockedIn;
	private String hiredDate;
	
	/**
	 * Creates Employee objects by leveraging inheritance from the 
	 * @param firstName The first name of the employee
	 * @param lastName The last name of the employee
	 * @param address The address of the employee
	 * @param phoneNumber The phone number of the employee
	 * @param email The email of the employee
	 * @param employeeId The unique ID of the employee
	 * @param clockedIn The time that the employee clocked in at
	 * @param hiredDate The date that the employee was hired
	 */
	public Employee(String firstName, String lastName, String address, String phoneNumber, 
					String email, String employeeId, String clockedIn, String hiredDate)
	{
		super(firstName, lastName, address, phoneNumber, email);
		this.employeeId = employeeId;
		this.clockedIn = clockedIn;
		this.hiredDate = hiredDate;
	}
	
	/**
	 *generates the file data of the employee object
	 *@return The file data of the employee object
	 */
	@Override
	public String getFileData()
	{
		return super.getFileData() + "," + employeeId + "," + clockedIn + "," + hiredDate;
	}

	/**
	 * gets the employee ID of the employee object
	 * @return The employee ID
	 */
	public String getEmployeeId() 
	{
		return employeeId;
	}

	/**
	 * sets the employee Id of the employee object
	 * @param employeeId The employee ID to be associated with the employee object
	 */
	public void setEmployeeId(String employeeId) 
	{
		this.employeeId = employeeId;
	}

	/**
	 * gets the time that the employee clocked in 
	 * @return The time that the employee clocked in
	 */
	public String getClockedIn() 
	{
		return clockedIn;
	}

	/**
	 * sets the time that the employee clocked in
	 * @param clockedIn The tie that the employee clocked in
	 */
	public void setClockedIn(String clockedIn) 
	{
		this.clockedIn = clockedIn;
	}

	/**
	 * gets the hire date of the employee
	 * @return The hire date of the employee
	 */
	public String getHiredDate() 
	{
		return hiredDate;
	}

	/**
	 * Sets the date that the employee was hired
	 * @param hiredDate The date that the employee was hired
	 */
	public void setHiredDate(String hiredDate) 
	{
		this.hiredDate = hiredDate;
	}
	
}
