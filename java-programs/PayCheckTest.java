import javax.swing.JOptionPane;
import java.text.DecimalFormat;
/**
* @author Brian Goodwin
* @version 1.0, Mar. 1, 2014
* This program demonstrates the PayCheck class
**/

public class PayCheckTest
{
	public static void main(String[] args)
	{
		int employeeID; // hold employee's ID
		double grossPay; // holds employee's gross pays
		double stateTax; // holds state tax withheld
		double fedTax; //holds federal tax withheld
		double FICA; // holds FICA withheld
		String str; // used for JOptionPane
		String repeat; // holds user answer to repeat program
		double netPay; // holds employee's net pay

		do
		{
			str = JOptionPane.showInputDialog("Enter the employee's employee ID#");
			employeeID = Integer.parseInt(str);

			str = JOptionPane.showInputDialog("Enter the gross pay for employee ID# " + employeeID);
			grossPay = Double.parseDouble(str);
				while(grossPay < 0) // ensures user doesn't enter negative number for gross pay
				{
					JOptionPane.showMessageDialog(null,"The gross pay cannot be negative.");
					str = JOptionPane.showInputDialog("Enter the gross pay for employee ID# " + employeeID);
			 		grossPay = Double.parseDouble(str);
				}

			str = JOptionPane.showInputDialog("Enter the state tax withheld for employee ID# " + employeeID);
			stateTax = Double.parseDouble(str);
				while(stateTax < 0) // ensures user doesn't enter negative number for state tax
				{
					JOptionPane.showMessageDialog(null,"The state tax withheld cannot be negative.");
					str = JOptionPane.showInputDialog("Enter the state tax withheld for employee ID# " + employeeID);
					stateTax = Double.parseDouble(str);
				}

			str = JOptionPane.showInputDialog("Enter the federal tax withheld for employee ID# " + employeeID);
			fedTax = Double.parseDouble(str);
				while(fedTax < 0) // ensures user doesn't enter negative number for federal tax
				{
					JOptionPane.showMessageDialog(null,"The federal tax withheld cannot be negative.");
					str = JOptionPane.showInputDialog("Enter the federal tax withheld for employee ID# " + employeeID);
					fedTax = Double.parseDouble(str);
				}

			str = JOptionPane.showInputDialog("Enter the FICA withheld for employee ID# " + employeeID);
			FICA = Double.parseDouble(str);
				while(FICA < 0) // ensures user doesn't enter negative number for FICA
				{
					JOptionPane.showMessageDialog(null,"The FICA withheld cannot be negative.");
					str = JOptionPane.showInputDialog("Enter the FICA withheld for employee ID# " + employeeID);
					FICA = Double.parseDouble(str);
				}

				while((stateTax + fedTax + FICA > grossPay)) // ensures users input is logical
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

			PayCheck check = new PayCheck(employeeID, grossPay, stateTax, fedTax, FICA); // creates paycheck object
			DecimalFormat rounder = new DecimalFormat("#,###.00");// creates decimal formatting object
			check.calculateNetPay(); // calculates net pay using paycheck object

			JOptionPane.showMessageDialog(null,"EmployeeID# " + employeeID +
										  "\n---------------------------------------------------" +
										  "\nGross Pay: $" + rounder.format(grossPay) +
										  "\nState tax withheld: $" + rounder.format(stateTax) +
										  "\nFederal tax withheld: $" + rounder.format(fedTax) +
										  "\nFICA withholding: $" + rounder.format(FICA) +
										  "\nNet pay: $" + rounder.format(check.getNetPay()));


			repeat = JOptionPane.showInputDialog("Would you like to enter another employee's information, yes or no?");

		}while(repeat.equalsIgnoreCase("YES"));

	 System.exit(0); // exit JOptionPane
	}// ends main method
} // ends public class

/*------------------------------------------------------------------------------------------------------------------------------------

1.0 import JOptionPane;

2.0 import DecimalFormat;

3.0 declare employee ID;

4.0 delcare employee's gross pay;

5.0 declare state tax withheld;

6.0 declare federal tax withheld;

7.0 declare FICA withheld;

8.0 declare JOptionpane string;

9.0 declare user repeat;

10.0 declare employee's net pay;

11.0 start do-while loop;

11.1 user enter employee ID number;

11.2 user enter employee's gross pay;

12.0 while gross pay < 0

12.1 print gross pay cannot be negative;

12.2 user re-enter gross pay;

13.0 user enter state tax withheld;

14.0 while state tax < 0;

14.1 print state tax cannot be negative;

14.2 user re-enter state tax;

15.0 user enter federal tax withheld;

16.0 while federal tax < 0;

16.1 print federal tax cannot be negative;

16.2 user re-enter federal tax;

17.0 user enter FICA withheld;

18.0 while FICA < 0

18.1 print FICA cannot be negative;

18.2 user re-enter FICA;

19.0 while state tax + federal tax + FICA > gross pay;

19.1 print employee's total withholding cannot be greater than their gross pay;

19.2 user re-enter employee ID;

19.3 user re-enter state tax withheld;

19.4 user re-enter federal tax withheld;

19.5 user re-enter FICA;

20.0 create paycheck object;

21.0 create decimal formatting object;

22.0 calculate net pay using paycheck object;

23.0 print employee paycheck;

23.1 print employee's ID number rounded to nearest cent;

23.2 print state tax withheld rounded to nearest cent;

23.3 print federal tax withheld rounded to nearest cent;

23.4 print FICA withheld rounded to nearest cent;

23.5 print employee's net pay using getter rounded to nearest cent;

24.0 user enter if he/she wants to repeat program;

25.0 while repeat.equalsIgnoreCase("YES") -(part of do-while loop step 11.0) == yes;

25.1 repeat program;

26.0 close JOptionPane;

27.0 end;

*/