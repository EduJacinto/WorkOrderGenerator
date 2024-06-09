package Project3;
/**
 * Class that creates ticket objects. The object includes customer object information, the ticket ID, and the time
 * that the ticket was created at. Implements the Printable interface to generate file data.
 */
public class Ticket implements Printable
{
	private Customer customer;
	private String createdAt;
	private String ticketId;
	
	/**
	 * Constructor that creates a new ticket object
	 * @param customer The customer object that is associate with the ticket
	 * @param createdAt The time that the ticket was created
	 * @param ticketId The ticket identification code
	 */
	public Ticket(Customer customer, String createdAt, String ticketId)
	{
		this.customer = customer;
		this.createdAt = createdAt;
		this.ticketId = ticketId;
	}
	
	/**
	 * Gets the ticket object file data
	 * @return the customer object file data, the time the ticket was created at and the ticket ID.
	 */
	@Override
	public String getFileData()
	{
		return customer.getFileData() + "," + createdAt + "," + ticketId;
	}

	/**
	 * Gets the customer object
	 * @return The customer object
	 */
	public Customer getCustomer() 
	{
		return customer;
	}

	/**
	 * Sets the customer object to be associated with the ticket
	 * @param customer The customer object to be associated to the ticket
	 */
	public void setCustomer(Customer customer) 
	{
		this.customer = customer;
	}

	/**
	 * gets the ticket ID
	 * @return The ticket ID
	 */
	public String getTicketId() 
	{
		return ticketId;
	}

	/**
	 * Sets the ticket ID to be associated to the new ticket
	 * @param ticketId The ticket ID that will be associated to the new ticket object
	 */
	public void setTicketId(String ticketId) 
	{
		this.ticketId = ticketId;
	}
	
	/**
	 * Sets the time stamp that the ticket was created at
	 * @param createdAt String containing the time stamp of creation of the ticket
	 */
	public void setCreatedAt(String createdAt) 
	{
		this.createdAt = createdAt;
	}
	
	/**
	 * Gets the time stamp of the creation of the ticket object
	 * @return The time stamp of the creation of the ticket object
	 */
	public String getCreatedAt() 
	{
		return createdAt;
	}

}
