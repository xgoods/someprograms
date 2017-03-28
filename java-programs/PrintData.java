import java.sql.*;
import javax.swing.JOptionPane;
/**
* @author Brian Goodwin
* @version 1.0 Apr. 23, 2014
* The purpose of this program is to print the data
* of employees making more than $10 per hour
**/
public class PrintData
{
	public static void main(String[] args)
	{
		final String DB_URL = "jdbc:derby:WorkersDB"; // holds db URL

		try //ensures data is in database
		{
			Connection conn = DriverManager.getConnection(DB_URL); //connect to db URL

			Statement state = conn.createStatement(); //create  connection statement

			String sqlStatement = "SElECT * FROM Employee WHERE HourlyPay > 10.00"; //select where hourly pay > $10

			ResultSet result = state.executeQuery(sqlStatement); //query results

			System.out.println("Employees making more than $10.00 per hour");
			System.out.println("---------------------------------------------------------------------------");
			System.out.println("EmployeeID\t Name\t\t\t Position\t\t Hourly Pay");
			System.out.println("---------------------------------------------------------------------------");

			while(result.next()) //get results
			{
				System.out.println(result.getString("EmployeeID") + "\t\t" +
								   result.getString("Name") +
								   result.getString("Position") + "$" +
								   result.getString("HourlyPay"));
			}

			conn.close(); //close connection

		}
		catch(Exception ex)
		{
			System.out.println("Error: " + ex.getMessage());
		}
	}
}

/*-------------------------------------------------------------------------------------------------------------------------------------

Output:

Employees making more than $10.00 per hour
-----------------------------------------------------------
Employee ID			Name		Position		Hourly Pay
-----------------------------------------------------------
123456			Jane Doe		Secretary			$15.00
234567			Naya Cat		Office Kitty		$12.75
987654			Lonny McDuff	Sales Manager		$45.68
876565			Marize Bester	Sales Specialist	$67.75
112345			John Smith		Janitor				$10.25

Pseudocode

1.0 import SQL package;

2.0 import JOptionPane;

3.0 try initialize DB URL;

4.0 connect to DB URL;

5.0 create connection statement;

6.0 select from DB where hourly pay > $10;

7.0 query results;

8.0 print table structure;

9.0 while (result.next());

9.1 print getString EmployeeID, Name, Position, HourlyPay;

10.0 catch Exception ex print error message;

11.0 end;

*/