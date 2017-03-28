import javax.swing.JOptionPane;
/**
* @author Brian Goodwin
* @version 1.0, Apr. 22, 2014
* The purpose of this program is to use recursion to find
* the sum of the values 0 to the number passed to the argument
**/
public class SumOfNumbersTest
{
	public static void main(String[] args)
	{
		String str; //used for JOptionPane
		int number = 0; //holds number
		int sum = 0; //holds sum

		try
		{
			str = JOptionPane.showInputDialog("Enter a number");
			number = Integer.parseInt(str);
		}
		catch(NumberFormatException e)
		{
			JOptionPane.showMessageDialog(null,"Number must be a whole number");
		}
		SumOfNumbers method = new SumOfNumbers(number); //create SumOfNumbers object

		JOptionPane.showMessageDialog(null,"The sum of the values 0 through " + method.getNumber() + " is " +
		method.getMyMethod(number));

	System.exit(0);
	}
}
/*--------------------------------------------------------------------------------------------------------------------------------------\

Output:

The sum of the values 0 through (user entered number) is (number)

Pseudocode

1.0 import JOptionPane;

2.0 String str;

3.0 int number = 0;

4.0 int sum = 0;

5.0 try user entered integer number;

6.0 catch NumberFormatException e print error message;

7.0 create SumOfNumbers object;

8.0 print sum of values in user entered number using recursion;

9.0 close JOptionPane;

10.0 end;

*/