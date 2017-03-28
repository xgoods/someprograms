import javax.swing.JOptionPane;
public class employeePayArray
{
	public static void main(String[] args)
	{
		String str;
		int numEmployees;
		String[] employeeNames;
		int[] employeeID;
		double[] employeeHours;
		double[] employeeWage;
		double[] employeeTotalPay;

		str = JOptionPane.showInputDialog("How many employees would you like to enter: ");
		numEmployees = Integer.parseInt(str);

		employeeNames = new String[numEmployees];
		employeeID = new int[numEmployees];
		employeeHours = new double[numEmployees];
		employeeWage = new double[numEmployees];
		employeeTotalPay = new double[numEmployees];

		for(int index = 0; index < numEmployees; index++)
		{
			employeeNames[index] = JOptionPane.showInputDialog("Enter the name of employee " + (index + 1));
		}

		for(int index = 0; index < numEmployees; index++)
		{
			str = JOptionPane.showInputDialog("Enter the 5 digit ID number for employee " + employeeNames[index]);
			employeeID[index] = Integer.parseInt(str);
		}

		for (int index = 0; index < numEmployees; index++)
		{
			str = JOptionPane.showInputDialog("How many hours did " + employeeNames[index] + " work");
			employeeHours[index] = Double.parseDouble(str);
		}

		for(int index = 0; index < numEmployees; index++)
		{
			str = JOptionPane.showInputDialog("What is the wage for employee " + employeeNames[index]);
			employeeWage[index] = Double.parseDouble(str);
		}

		for (int index = 0; index < numEmployees; index++)
		{
			employeeTotalPay[index] = (employeeHours[index] * employeeWage[index]);
		}

		for(int index = 0; index < numEmployees; index++)
		{
			JOptionPane.showMessageDialog(null,"Total pay for employee " + employeeNames[index] +
			" is $" + employeeTotalPay[index]);
		}

		System.exit(0);
	}
}
