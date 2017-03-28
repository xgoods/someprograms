import javax.swing.JOptionPane;
import java.util.Random;
/**
* @author Brian Goodwin
* @version 1.0, Mar. 1, 2014
* This program creates a random number
* and prompts user to try and guess that number
**/
public class guessingGame
{
	public static void main(String[] args)
	{
		int compNum; // holds computer's number
		int userNum; // holds user's number
		String str; // holds string for JOptionPane
		String repeat; // holds user answer to repeat program

		Random randomNum = new Random(); // creates random numbers object

		do
		{
			compNum = randomNum.nextInt(20); // sets random number parameters between 0 and 20

			JOptionPane.showMessageDialog(null,"See if you can guess the number.");
			str = JOptionPane.showInputDialog("Enter a whole number 0 - 20.");
			userNum = Integer.parseInt(str);

			while(userNum < 0 || userNum > 20) // ensures user'ss guess is within parameters
			{
				JOptionPane.showMessageDialog(null,"The number cannot be negative or greater than 20.");
				str = JOptionPane.showInputDialog("Enter a whole number 0 - 20.");
				userNum = Integer.parseInt(str);
			}
			while(userNum > compNum) // user's guess is too high
			{
				JOptionPane.showMessageDialog(null,"You've guess too high, try again.");
				str = JOptionPane.showInputDialog("Enter a whole number 0 - 20.");
				userNum = Integer.parseInt(str);

				while(userNum < 0 || userNum > 20) // ensures user's guess is within parameters
					{
						JOptionPane.showMessageDialog(null,"The number cannot be negative or greater than 20.");
						str = JOptionPane.showInputDialog("Enter a whole number 0 - 20.");
						userNum = Integer.parseInt(str);
					}
			if(userNum == compNum) // user's guess is correct
				{
					JOptionPane.showMessageDialog(null,"You've guessed correctly!");
				}
			}

			while(userNum < compNum) // user's guess is too low
			{
				JOptionPane.showMessageDialog(null,"You've guessed too low, try again.");
				str = JOptionPane.showInputDialog("Enter a whole number 0 - 20.");
				userNum = Integer.parseInt(str);

				while(userNum < 0 || userNum > 20) // ensures user's guess is within parameters
					{
						JOptionPane.showMessageDialog(null,"The number cannot be negative or greater than 20.");
						str = JOptionPane.showInputDialog("Enter a whole number 0 - 20.");
						userNum = Integer.parseInt(str);
					}

				if(userNum == compNum) // user's guess is correct
				{
					JOptionPane.showMessageDialog(null,"You've guessed correctly!");
				}
			}

			repeat = JOptionPane.showInputDialog("Would you like to try again, yes or no?");

		}while(repeat.equalsIgnoreCase("YES"));
	System.exit(0); // exit JOptionPane
	} // exit main method
} // exit public class

/*----------------------------------------------------------------------------------------------------------------------------------------

1.0 import JOptionPane;

2.0 import Random number generator;

3.0 declare computer's number;

4.0 declare user's number;

5.0 declare string for JOptionPane;

6.0 declare user repeat;

7.0 start do-while loop;

8.0 initialize computer number between 0 and 20;

9.0 user input number;

10.0 while user's number < 0 or user's number > 20;

10.1 print number cannot be negative or greater than 20;

10.2 user re-enter number;

11.0 while user's number > computer's number;

11.1 user's guess is too high;

11.2 user re-enter number;

12.0 while user's number < 0 or user's number > 20;

12.1 print number cannot be negative or greater than 20;

12.2 user re-enter number;

13.0 if user's number == computer's number;

13.1 user guessed number correctly;

14.0 while user's number < computer's number;

14.1 user's guess is too low;

14.2 user re-enter number;

15.0 while user's number < 0 or user's number > 20;

15.1 print number cannot be negative or greater than 20;

15.2 user re-enter number;

16.0 if user's number == computer's number;

16.1 user guessed correctly;

17.0 user enter if he/she would like to try again;

18.0 while repeat.equalsIgnoreCase("YES") - (part of do-while loop step 7.0) == yes;

18.1 repeat program;

19.0 close JOptionPane;

20.0 end;

*/




