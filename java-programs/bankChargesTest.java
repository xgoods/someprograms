/**
* @author Brian Goodwin
* @version 1.0, Feb. 25, 2014
**/

import javax.swing.JOptionPane;
import java.text.DecimalFormat;
public class bankChargesTest
{
	public static void main(String[] args)
	{
		String str; // used for JOptionPane
		double startingBal; // starting balance
		double currentBal; // current balance
		double numMonths; // number of months
		int numChecksWritten; // number of checks written

		str = JOptionPane.showInputDialog("What is your starting balance?");
		startingBal = Double.parseDouble(str);

		str = JOptionPane.showInputDialog("How many months will you be using this account?");
		numMonths = Double.parseDouble(str);

		while(numMonths <= 0) // ensure user cannot enter num <= 0 for number of months
		{
			JOptionPane.showMessageDialog(null,"You cannot have this account for 0 or less months.");
			str = JOptionPane.showInputDialog("How many months will you be using this account?");
			numMonths = Double.parseDouble(str);
		}

		str = JOptionPane.showInputDialog("How many checks will you be writing?");
		numChecksWritten = Integer.parseInt(str);

		while(numChecksWritten <=0) // ensures user cannot enter num <= 0 for number of checks written
		{
			JOptionPane.showMessageDialog(null,"You cannot write 0 or less checks.");
			str = JOptionPane.showInputDialog("How many checks will you be writing?");
			numChecksWritten = Integer.parseInt(str);
		}

		bankCharges bankAccount = new bankCharges(startingBal,numMonths,numChecksWritten); // create bank account object
		DecimalFormat rounder = new DecimalFormat("#,###.00"); // create decimal formatting object

		bankAccount.calculateCurrentBal(); // calculate current balance
		bankAccount.calculateMonthlyFees();// calculate monthly fees

		JOptionPane.showMessageDialog(null,"Your ending balance is $" + rounder.format(bankAccount.getCurrentBal()));

		JOptionPane.showMessageDialog(null,"Your monthly charges are $" + rounder.format(bankAccount.getMonthlyFees()));

		System.exit(0);
	}
}

/*----------------------------------------------------------------------------------------------------------------------------------

1.0 import JOptionPane;

2.0 import Decimal formatter;

3.0 declare string for JOptionPane;

4.0 declare starting balance;

5.0 declare current balance;

6.0 declare number of months;

7.0 declare number of checks written;

8.0 user input starting balance;

9.0 user input num months using account;

9.1 while user input <= 0 print incorrect input;

9.2 user re enter num months if needed;

10.0 user input how many checks written;

10.1 while number of checks written <= 0 print incorrect input;

10.2 user re enter number of checks written if needed;

11.0 create bank account object;

12.0 create decimal format object;

13.0 calculate current balance using bankaccount object;

13.1 currentBal = startingBal - (numMonths * monthlyFees)

13.2 if currentBal < 400 currentBal -= 15;

13.3 else currentBal = startingBal - (numMonths * monthlyFees + checkCharges);

14.0 calculate monthly fees using bank account object;

14.1 totalMonthlyFees = (numMonths * monthlyFee);

15.0 print current balance using getter;

15.1 round value to 2 decimal places;

16.0 print monthly fees using getter;

16.1 round value to 2 decimal places;

17.0 end;

*/

