/*
 * 	Author:		Eduardo G. Jacinto Cerros
 *  Course:		COP3503
 *  Project #: 	3
 *  Title :		Work Order Generator
 *  Due Date:	11/1/2023
 * 
 * 
 * 	Information is loaded into ArrayLists and Queues from three .csv files. Ticket, Person, 
 *  Employee, and Customer objects are created from the information extracted from the .csv files. 
 *  Employees are then assigned tickets according to which tier they fall under (either tier1 or tier 2).
 *  Work order objects are created while assigning tickets to employees. The work orders, along with 
 *  the information that they hold, are then printed to a new .csv file as well as to the log file. 
 *  When printing to new .csv file and log.txt file is complete, the program is complete and exits.
 */
package Project3;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * calls methods to read three separate .csv files, stores the information and subsequent 
 * objects created into ArrayLists and queues. Tickets are assigned to employees and 
 * work orders are created. The work orders are stored in an ArrayList and then
 * printed to a new .csv file as well as to a .txt file which logs the work orders.
 * All while leveraging Inheritance between object classes.
 */
public class Project3 
{
	public static String employeeFileName;
	public static String tier1TicketFileName, tier2TicketFileName, workOrderFileName;
	public static ArrayList<Employee> employeeList = new ArrayList<Employee>();
	public static ArrayList<WorkOrder> workOrderList = new ArrayList<WorkOrder>();
	public static Queue<Ticket> tier1TicketFile = new LinkedList<Ticket>();
	public static Queue<Ticket> tier2TicketFile = new LinkedList<Ticket>();

	public static void main(String args[])
	{	
		System.out.println("Project 3: Work Order Generator");
		
		//assign values to the string variables that hold file names
		employeeFileName = "employee_data.csv";
		tier1TicketFileName = "tier1_ticket_data.csv";
		tier2TicketFileName = "tier2_ticket_data.csv";

		//reads in data from the employee file and creates tier1 and tier2 employee objects
		FileHandler.readEmployeeData(employeeFileName);

		//calls readTicketData from FileHandler class, creates ticket objects and loads them to the ticket queues
		tier1TicketFile = FileHandler.readTicketData(tier1TicketFileName);
		tier2TicketFile = FileHandler.readTicketData(tier2TicketFileName);
		
		//creates work order objects and loads them into the workOrder ArrayList
		createWorkOrders();

		//assign the filename to the variable
		workOrderFileName = "workorder_data.csv";

		//Write work orders to the new csv file and to the log. Passing in destination file name.
		FileHandler.writeData(workOrderFileName);

		System.out.println("Work Orders created. Program exiting");
	}

	/**
	 * creates work order objects and adds them to the workOrderList ArrayList
	 */
	public static void createWorkOrders()
	{
		System.out.println("Creating Work Orders");
		while(!tier2TicketFile.isEmpty() || !tier1TicketFile.isEmpty())
		{
			for(Employee person : employeeList)
			{
				if(!tier2TicketFile.isEmpty() && person instanceof Tier2Employee)
				{
					Ticket ticket = tier2TicketFile.poll();
					WorkOrder workOrder = new WorkOrder(person, ticket, dateFormat());
					workOrderList.add(workOrder);

				}
				else if(!tier1TicketFile.isEmpty() && person instanceof Employee)
				{
					Ticket ticket = tier1TicketFile.poll();
					WorkOrder workOrder = new WorkOrder(person, ticket, dateFormat());
					workOrderList.add(workOrder);
				}


			}
		}

	}//end method

	/**
	 * generates string that contains current date and time
	 * @return string that contains date and time
	 */
	public static String dateFormat() 
	{

		SimpleDateFormat dateFormat = new SimpleDateFormat("MM/dd/yyyy HH:mm:ss");

		Date date = new Date();

		return dateFormat.format(date);
	}

}
