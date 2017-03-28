import java.sql.*;
import javax.swing.JOptionPane;
/**
* @author Brian Goodwin
* @version 1.0 Apr 23, 2014
* The purpose of this program is to insert rows into
* Employee table
**/
public class EmployeeData
{
	public static void main(String[] args)
	{

		final String DB_URL = "jdbc:derby:WorkersDB"; //initialize DB URL
		String sql; //holds SQL values

		try
		{
			Connection conn = DriverManager.getConnection(DB_URL); //connect to URL

			Statement state = conn.createStatement(); //create connection statement
			sql = "INSERT INTO Employee VALUES" +
				  "(112345, 'John Smith', 'Janitor', 10.25)";
			state.executeUpdate(sql);

			sql = "INSERT INTO Employee VALUES" +
				  "(123456, 'Jane Doe', 'Secretary', 15.00)";
			state.executeUpdate(sql);

			sql = "INSERT INTO Employee VALUES" +
				  "(234567, 'Naya Cat', 'Office Kitty', 12.75)";
			state.executeUpdate(sql);

			sql = "INSERT INTO Employee VALUES" +
				  "(987654, 'Lonny McDuff', 'Sales Manager', 45.68)";
			state.executeUpdate(sql);

			sql = "INSERT INTO Employee VALUES" +
				  "(876565, 'Marize Bester', 'Sales Specialist', 67.75)";
			state.executeUpdate(sql);

			state.close(); //close statement
			conn.close(); //close connection

		}
		catch(Exception ex)
		{
			JOptionPane.showMessageDialog(null,"Error: " + ex.getMessage());
		}
	}
}

/*-------------------------------------------------------------------------------------------------------------------------------------

Pseudocode

1.0 import SQL package;

2.0 import JOptionPane;

3.0 initialize DB URL;

4.0 try connect to DB URL;

5.0 create connection statement;

6.0 insert row 1 values into employee table;

6.1 update DB;

7.0 insert row 2 values into employee table;

7.1 update DB;

8.0 insert row 3 values into employee table;

8.1 update DB;

9.0 insert row 4 values into employee table;

9.1 update DB;

10.0 insert row 5 values into employee table;

10.1 update DB;

11.0 close statement;

12.0 close connection;

13.0 catch Exception ex print error message;

14.0 end;

*/