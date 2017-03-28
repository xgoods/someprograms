import javax.swing.JOptionPane;
import java.text.DecimalFormat;
public class payRollTestArray
{
	public static void main(String[] args)
	{
		int numEmployees = 1;
		String str;
		//str = JOptionPane.showInputDialog("Enter the number of employees you would like to enter.");
		//numEmployees = Integer.parseInt(str);

		int[] employeeID = new int[numEmployees];
		double[] grossPay = new double[numEmployees];
		double[] stateTax = new double[numEmployees];
		double[] fedTax = new double[numEmployees];
		double[] FICA = new double[numEmployees];
		double[] errorCheck = new double[numEmployees];
		double[] netPay = new double[numEmployees];



		for(int index = 0; index < numEmployees; index++)
			{
				str = JOptionPane.showInputDialog("Enter the ID number for employee " + (index + 1));
				employeeID[index] = Integer.parseInt(str);

				str = JOptionPane.showInputDialog("Enter the gross pay for Employee ID# " + employeeID[index]);
				grossPay[index] = Double.parseDouble(str);

					while(grossPay[index] < 0)
						{
							JOptionPane.showMessageDialog(null,"You cannot have a negative number for your gross pay");
							str = JOptionPane.showInputDialog("Enter the gross pay for Employee ID# " + employeeID[index]);
							grossPay[index] = Double.parseDouble(str);
						}

				str = JOptionPane.showInputDialog("Enter the state tax withholdings for Employee ID# " + employeeID[index]);
				stateTax[index] = Double.parseDouble(str);

					while(stateTax[index] < 0)
						{
							JOptionPane.showMessageDialog(null,"You cannot have a negative number for your gross pay");
							str = JOptionPane.showInputDialog("Enter the state tax withholdings for EmployeeID# " +
															  employeeID[index]);
							stateTax[index] = Double.parseDouble(str);
						}

				str = JOptionPane.showInputDialog("Enter the federal tax withholding for Employee ID# " +
															  employeeID[index]);
				fedTax[index] = Double.parseDouble(str);

					while(fedTax[index] < 0)
						{
							JOptionPane.showMessageDialog(null,"You cannot have a negative number for your federal tax withholdings.");
							str = JOptionPane.showInputDialog("Enter the federal tax withholdings for Employee ID# " +
															   employeeID[index]);
							fedTax[index] = Double.parseDouble(str);
						}

				str = JOptionPane.showInputDialog("Enter the FICA withholdings for EmployeeID# " + employeeID[index]);
				FICA[index] = Double.parseDouble(str);

					while(FICA[index] < 0)
						{
							JOptionPane.showMessageDialog(null,"You cannot have a negative number for your FICA withholdings.");
							str = JOptionPane.showInputDialog("Enter the FICA withholdings for EmployeeID# " +employeeID[index]);
							FICA[index] = Double.parseDouble(str);
						}


					while(stateTax[index] + fedTax[index] + FICA[index] > grossPay[index])
						{
							JOptionPane.showMessageDialog(null,"Your total withholdings cannot be greater than your gross pay.");
							str = JOptionPane.showInputDialog("Enter the state tax withholdings for EmployeeID# " +
															   employeeID[index]);
							stateTax[index] = Double.parseDouble(str);

							str = JOptionPane.showInputDialog("Enter the federal tax withholdings for Employee ID# " +
															   employeeID[index]);
							fedTax[index] = Double.parseDouble(str);

							str = JOptionPane.showInputDialog("Enter the FICA withholdings for EmployeeID# " +employeeID[index]);
							FICA[index] = Double.parseDouble(str);
						}
			netPay[index] = grossPay[index] - stateTax[index] - fedTax[index] - FICA[index];
			}

		for(int index = 0; index < numEmployees; index++)
			JOptionPane.showMessageDialog(null, employeeID[index] + "\t\t" + netPay[index]);
		System.exit(0);
		}
	}








