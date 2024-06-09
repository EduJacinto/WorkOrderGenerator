package Project3;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.LinkedList;
import java.util.Scanner;

/**
 * FileHandler class contains methods that read data from files and write data to files.
 */
public class FileHandler {

	/**
	 * Writes work order data to a file.
	 * @param workOrderFileName The name of the file that data should be written to.
	 */
	public static void writeData(String workOrderFileName)
	{	
		try 
		{
			File file = new File(workOrderFileName);
			PrintWriter out = new PrintWriter(new FileWriter(file));
			
			System.out.println("Writing Work Order Data to File");
			logger("Writing Work Order Data to File");

			out.write("customer_id,"
					+ "customer_first_name,"
					+ "customer_last_name,"
					+ "ticket_id,"
					+ "ticket_createdAt,"
					+ "workorder_createdAt,"
					+ "employee_id,"
					+ "employee_first_name,"
					+ "employee_last_name,"
					+ "clocked_in,"
					+ "certification");
			out.println();


			for(int i = 0; i < Project3.workOrderList.size(); i++)
			{
				out.print(Project3.workOrderList.get(i).getFileData());
				logger(Project3.workOrderList.get(i).getFileData());

				if(i < Project3.workOrderList.size()-1)
				{
					out.println();
				}



			}//end for
			out.close();
		}
		catch(IOException e) 
		{
			System.out.println("file error: " + e.getMessage());
		}
		logger("Work Orders created. Program Exiting");
	}
	
	/**
	 * Reads in employee data from the file passed in and populates the Employee list.
	 * @param employeeFileName The file that contains employee data.
	 */
	public static void readEmployeeData(String employeeFileName)
	{
		String line = "";
		
		try {
		Scanner reader = new Scanner(new FileReader(employeeFileName));
		
		
		reader.nextLine();
		
		System.out.println("Loading Employee data");
		logger("Loading Employee Data");
		
		while(reader.hasNextLine())
		{		
			line = reader.nextLine();
			String[] empInfo = line.split(",");
			
			if(empInfo[8].equalsIgnoreCase("tier2"))
			{
				Tier2Employee tier2Employee = new Tier2Employee(empInfo[1], empInfo[2], empInfo[4], empInfo[5], 
																empInfo[3], empInfo[0], empInfo[6], empInfo[7], empInfo[9]);
				Project3.employeeList.add(tier2Employee);
			}
			else if(empInfo[8].equalsIgnoreCase("tier1"))
			{
				Employee regEmployee = new Employee(empInfo[1], empInfo[2], empInfo[4], empInfo[5], 
													empInfo[3], empInfo[0], empInfo[6], empInfo[7]);
				Project3.employeeList.add(regEmployee);
			}
			
		}
		
		reader.close();
		}
		catch(FileNotFoundException e) 
		{
			System.out.println("file error: " + e.getMessage());
		}
	}
		
	
	/**
	 * Reads ticket data from a file and returns a list of ticket objects.
	 * @param ticketFileName The file that contains ticket data.
	 * @return A LinkedList of Ticket objects.
	 */
	public static LinkedList<Ticket> readTicketData(String ticketFileName)
	{
		LinkedList<Ticket> ticketStubs = new LinkedList<Ticket>();

		String line = "";
		try 
		{
			Scanner reader = new Scanner(new FileReader(ticketFileName));

			reader.nextLine();
			
			System.out.println("Loading Ticket Data");
			logger("Loading Ticket Data");

			while(reader.hasNextLine())
			{
				if(ticketFileName.equals("tier1_ticket_data.csv"))
				{
					line = reader.nextLine();
					String[] ticketInfo = line.split(",");
					Customer customer = new Customer(ticketInfo[1], ticketInfo[2], ticketInfo[4], ticketInfo[5], ticketInfo[3], ticketInfo[0], ticketInfo[6]);
					Ticket ticket = new Ticket(customer, ticketInfo[8], ticketInfo[7]);
					ticketStubs.add(ticket);

				}
				else if(ticketFileName.equals("tier2_ticket_data.csv"))
				{
					line = reader.nextLine();
					String[] ticketInfo = line.split(",");
					Customer customer = new Customer(ticketInfo[1], ticketInfo[2], ticketInfo[4], ticketInfo[5], ticketInfo[3], ticketInfo[0], ticketInfo[6]);
					Ticket ticket = new Ticket(customer, ticketInfo[8], ticketInfo[7]);
					ticketStubs.add(ticket);
				}



			}
		}
		catch(FileNotFoundException e) 
		{
			System.out.println("file error: " + e.getMessage());
		}

		return ticketStubs;
	}
	
	/**
	 * Writes text to the log file.
	 * @param log The text to be logged.
	 */
	private static void logger(String log)
	{
		
		try
		{
			File file = new File("log.txt");
			PrintWriter print = new PrintWriter(new FileWriter(file, true));
			print.print("log:" + Project3.dateFormat() + " : " + log);
			print.println();
			print.close();
		}
		catch (IOException e) 
		{
			
			System.out.println("file error: " + e.getMessage());
		}
	}

}
