import java.sql.*;
import javax.swing.JOptionPane;
public class BuildPersonnelDB
{
	public static void main(String[] args) throws Exception
	{
		final String DB_URL = "jdbc:derby:WorkersDB;create=true";

		try
		{

			Connection conn = DriverManager.getConnection(DB_URL);

			Statement state = conn.createStatement();

			JOptionPane.showMessageDialog(null,"Creating Employee table...");
			String sql = ("CREATE TABLE Employee (" +
					"EmployeeID INTEGER NOT NULL PRIMARY KEY, " +
					"Name CHAR(25)," +
					"Position CHAR(25)," +
					"HourlyPay DOUBLE " + ")");

			state.execute(sql);

			JOptionPane.showMessageDialog(null,"Done.");
		}
		catch(Exception ex)
		{
			JOptionPane.showMessageDialog(null,"Error: " + ex.getMessage());
		}
	}
}
