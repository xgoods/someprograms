import javax.swing.JOptionPane;
/**
* @author Brian Goodwin
* @version 1.0 Apr.22, 2014
* The purpose of this program is to use recursion to
* raise a number to a power
**/
public class PowerOfNumbersTest
{
	public static void main(String[] args)
	{
		int number = 0; //holds number
		int exponent = 0; //holds exponent
		int answer; //holds answer
		String str; //used for JOptionPane

		try //ensure user enters integer for number
		{
		str = JOptionPane.showInputDialog("Enter a positive whole number");
		number = Integer.parseInt(str);
		}
		catch(NumberFormatException e)
		{
			JOptionPane.showMessageDialog(null,"Number must be an integer");
		}
		try //ensures user enters integer for exponent
		{
		str = JOptionPane.showInputDialog("Enter a positive whole number for the exponent");
		exponent = Integer.parseInt(str);
		}
		catch(NumberFormatException e)
		{
			JOptionPane.showMessageDialog(null,"Number must be an integer");
		}

		while(number < 0 || exponent < 0) //ensures user enters positive number for number and exponent
		{
			try //ensures user enters integer for number
			{
			str = JOptionPane.showInputDialog("Enter a positive whole number");
			number = Integer.parseInt(str);
			}
			catch(NumberFormatException e)
			{
				JOptionPane.showMessageDialog(null,e.getMessage());
			}
			try //ensures user enters integer for exponent
			{
			str = JOptionPane.showInputDialog("Enter a positive whole number for the exponent");
			exponent = Integer.parseInt(str);
			}
			catch(NumberFormatException e)
			{
				JOptionPane.showMessageDialog(null,e.getMessage());
			}
		}

		PowerOfNumbers powers = new PowerOfNumbers(number, exponent); //create PowerOfNumbers object
		answer = PowerOfNumbers.calcAnswer(number, exponent); //initialize answer using static method

		JOptionPane.showMessageDialog(null,powers.getNumber() + " to the power of " + powers.getExponent() + " is " + answer);
	System.exit(0);
	}
}

/*------------------------------------------------------------------------------------------------------------------------------------\

Output:

(user entered number) to the power of (user entered exponent) is answer

Pseudocode

1.0 import JOptionPane;

2.0 int number = 0;

3.0 int exponent = 0;

4.0 int answer;

5.0 String str;

6.0 try user enter integer number

7.0 catch NumberFormatException print error message;

8.0 try user enter integer exponent

9.0 catch NumberFormatException print error message;

10.0 while number < 0 || exponent < 0;

10.1 try user enter positive integer number;

10.2 catch NumberFormatException e print error message;

10.3 try user enter positive exponent number;

10.4 catch NumberFormatException e print error message;

11.0 create PowerOfNumbers object;

12.0 initialize answer using static method calcAnswer;

13.0 print answer;

14.0 close JOptionPane;

15.0 end;

*/