package Project3;

/**
 * Represents a work order object that includes information about the assigned employee, 
 * the customer, the ticket, and the time that the work order was created at. Implements the 
 * Printable interface to generate file data.
 */
public class WorkOrder implements Printable
{
	private Employee employee;
	private Ticket ticket;
	private String createdAt;
	
	/**
	 * constructs new WorkOrder object
	 * @param employee employee object associated with the work order
	 * @param ticket ticket object associated with the work order
	 * @param createdAt time stamp when the WorkOrder object was created
	 */
	public WorkOrder(Employee employee, Ticket ticket, String createdAt)
	{
		this.employee = employee;
		this.ticket = ticket;
		this.createdAt = createdAt;
	}
	
	/**
	 * Generates file data for the work order including the customer, ticket, and employee data.
	 *@return a comma separated string containing ticket, employee, and customer information.
	 */
	@Override
	public String getFileData()
	{
		return ticket.getCustomer().getCustomerId() + "," + 
			   ticket.getCustomer().getFirstName() + "," + 
			   ticket.getCustomer().getLastName() + "," + 
			   ticket.getTicketId() + "," + 
			   ticket.getCreatedAt() + "," + 
			   createdAt + "," + 
			   employee.getEmployeeId() + "," +
			   employee.getFirstName() + "," + 
			   employee.getLastName() + "," + 
			   employee.getClockedIn() +
			   ((employee instanceof Tier2Employee) ? "," + ((Tier2Employee) employee).getCertification() : "");
	}

	/**
	 * Gets employee object associated to the work order
	 * @return employee The employee object associated to the work order
	 */
	public Employee getEmployee() {
		return employee;
	}

	/**
	 * Sets employee assigned to the work order
	 * @param employee The employee object to be assigned to the work order
	 */
	public void setEmployee(Employee employee) {
		this.employee = employee;
	}

	/**
	 * Gets ticket object assigned to the work order
	 * @return ticket The ticket object associated to the work order
	 */
	public Ticket getTicket() {
		return ticket;
	}

	/**
	 * Sets ticket object assigned to the work order
	 * @param ticket The ticket to be assigned to the work order
	 */
	public void setTicket(Ticket ticket) {
		this.ticket = ticket;
	}

	/**
	 * Gets time stamp when the work order was created
	 * @return The time stamp of the work order creation time
	 */
	public String getCreatedAt() {
		return createdAt;
	}

	/**
	 * Sets the work order creation time stamp
	 * @param createdAt A string that represents the creation time stamp of the work order
	 */
	public void setCreatedAt(String createdAt) {
		this.createdAt = createdAt;
	}

}
