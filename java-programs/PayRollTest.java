import javax.swing.JOptionPane;
public class PayRollTest
{
	public static void main(String[] args)
	{
		int employeeID;
		double grossPay;
		double stateTax;
		double fedTax;
		double FICA;
		String str;
		String repeat;

		do
		{
			str = JOptionPane.showInputDialog("Enter the employee's employee ID#");
			employeeID = Integer.parseInt(str);

			str = JOptionPane.showInputDialog("Enter the gross pay for employee ID# " + employeeID);
			grossPay = Double.parseDouble(str);
				while(grossPay < 0)
				{
					JOptionPane.showMessageDialog(null,"The gross pay cannot be negative.");
					str = JOptionPane.showInputDialog("Enter the gross pay for employee ID# " + employeeID);
			 		grossPay = Double.parseDouble(str);
				}

			str = JOptionPane.showInputDialog("Enter the state tax withheld for employee ID# " + employeeID);
			stateTax = Double.parseDouble(str);
				while(stateTax < 0)
				{
					JOptionPane.showMessageDialog(null,"The state tax withheld cannot be negative.");
					str = JOptionPane.showInputDialog("Enter the state tax withheld for employee ID# " + employeeID);
					stateTax = Double.parseDouble(str);
				}

			str = JOptionPane.showInputDialog("Enter the federal tax withheld for employee ID# " + employeeID);
			fedTax = Double.parseDouble(str);
				while(fedTax < 0)
				{
					JOptionPane.showMessageDialog(null,"The federal tax withheld cannot be negative.");
					str = JOptionPane.showInputDialog("Enter the federal tax withheld for employee ID# " + employeeID);
					fedTax = Double.parseDouble(str);
				}

			str = JOptionPane.showInputDialog("Enter the FICA withheld for employee ID# " + employeeID);
			FICA = Double.parseDouble(str);
				while(FICA < 0)
				{
					JOptionPane.showMessageDialog(null,"The FICA withheld cannot be negative.");
					str = JOptionPane.showInputDialog("Enter the FICA withheld for employee ID# " + employeeID);
					FICA = Double.parseDouble(str);
				}

				while((stateTax + fedTax + FICA > grossPay))
					{
						JOptionPane.showMessageDialog(null,"Employees total withholding cannot be greater than their gross pay.");

						str = JOptionPane.showInputDialog("Enter the gross pay for employee ID# " + employeeID);
						grossPay = Double.parseDouble(str);

						str = JOptionPane.showInputDialog("Enter the state tax withheld for employee ID# " + employeeID);
						stateTax = Double.parseDouble(str);

						str = JOptionPane.showInputDialog("Enter the federal tax withheld for employee ID# " + employeeID);
						fedTax = Double.parseDouble(str);

						str = JOptionPane.showInputDialog("Enter the FICA withheld for employee ID# " + employeeID);
						FICA = Double.parseDouble(str);
					}

			PayRoll payCheck = new PayRoll(employeeID, grossPay, stateTax, fedTax, FICA);

			JOptionPane.showMessageDialog(null,"Employee ID# " + employeeID + "gross pay $" + grossPay);
			JOptionPane.showMessageDialog(null,"Employee ID# " + employeeID + "state tax withheld $" + stateTax);
			JOptionPane.showMessageDialog(null,"Employee ID# " + employeeID + "federal tax withheld $" + fedTax);
			JOptionPane.showMessageDialog(null,"Employee ID# " + employeeID + "FICA withheld $" + FICA);
			JOptionPane.showMessageDialog(null,"Employee ID# " + employeeID + "ney pay $" + payCheck.getNetPay);

			str = JOptionPane.showInputDialog("Would you like to enter another employee's information?");
				while(repeat != "yes" || repeat != "Yes" || repeat != 'y' || repeat != 'Y')
				{
					str = JOptionPane.showInputDialog("Would you like to enter another employee's information?");
				}

		}while (repeat == "yes" || repeat == "Yes" || repeat == 'y' || repeat == 'Y');
	}
}