import java.sql.*;
import javax.swing.JOptionPane;
/**
* @author Brian Goodwin
* @version 1.0 Apr 23, 2014
* The purpose of this program is to create a new
* database called WorkersDB and create new table
* called Employee
**/
public class BuildWorkersDB
{
	public static void main(String[] args) throws Exception
	{
		final String DB_URL = "jdbc:derby:WorkersDB;create=true"; //create new database

		try
		{

			Connection conn = DriverManager.getConnection(DB_URL); //connect to DB URL

			Statement state = conn.createStatement(); //create connection statement

			JOptionPane.showMessageDialog(null,"Creating Employee table...");
			String sql = ("CREATE TABLE Employee (" +
					"EmployeeID INTEGER NOT NULL PRIMARY KEY, " +
					"Name CHAR(25)," +
					"Position CHAR(25)," +
					"HourlyPay DOUBLE " + ")");

			state.execute(sql); // execute statements

			JOptionPane.showMessageDialog(null,"Done.");
		}
		catch(Exception ex)
		{
			JOptionPane.showMessageDialog(null,"Error: " + ex.getMessage());
		}
	}
}

/*-----------------------------------------------------------------------------------------------------------------------------------

Pseudocode

1.0 import SQL package;

2.0 import JOptionPane;

3.0 create new database;

4.0 try connect to database;

5.0 create connection statement;

6.0 create new employee table;

7.0 execute statement;

8.0 catch Exception ex print error message;

9.0 end;

*/
