import javax.swing.JOptionPane;
/**
* @author Brian Goodwin
* @version 1.0 Apr. 15, 2014
* The purpose of this program is to print
* the description, units on hand, and price of an item
**/
public class RetailItemTest
{
	public static void main(String[] args)
	{
		String description; //item description
		int unitsOnHand = 0; //item units on hand
		double price = 0; //item price
		boolean[] flag = new boolean[3]; //flag variables for exceptions
		String str; //used for JOptionPane
		String repeat; //holds user repeat answer

		do
		{
			for(int index = 0; index < flag.length; index++) //initialize all flag variables to true
			{
				flag[index] = true;
			}

			description = JOptionPane.showInputDialog("Enter the description of the retail item.");

			while(flag[0] == true)
			{
				flag[1] = true;
				flag[2] = true;
				while(flag[1] == true) // ensures user enters integer value for units on hand
				{
					str = JOptionPane.showInputDialog("Enter the number of units on hand for that retail item.");

					try
					{
						unitsOnHand = Integer.parseInt(str);
						flag[1] = false;
					}
					catch(NumberFormatException e)
					{
						JOptionPane.showMessageDialog(null,"You've entered an invalid number.");
						flag[1] = true;
					}
				}
				while(flag[2] == true) //ensures user enters double value for price
				{
					str = JOptionPane.showInputDialog("Enter the price for that retail item.");
					try
					{
						price = Double.parseDouble(str);
						flag[2] = false;
					}
					catch(NumberFormatException e)
					{
						JOptionPane.showMessageDialog(null,"You've entered an invalid number.");
						flag[2] = true;
					}
				}

				try //ensures user does not enter negative number for units and hand and/or price
				{
					RetailItem item = new RetailItem(description, unitsOnHand, price); //creates RetailItem object
					flag[0] = false;
				}
				catch(NegativePrice e)
				{
					JOptionPane.showMessageDialog(null,e.getMessage());
					flag[0] = true;
				}
				catch(NegativeUnitsOnHand e)
				{
					JOptionPane.showMessageDialog(null,e.getMessage());
					flag[0] = true;
				}
			}
				JOptionPane.showMessageDialog(null,"Description: " + description +
												   "\nUnits on hand: " + unitsOnHand +
												   "\nPrice: $" + price);

				repeat = JOptionPane.showInputDialog("Would you like to repeat the program?");

		}while(repeat.equalsIgnoreCase("YES"));
		System.exit(0); //exits JOptionPane
	} //exits main method
} //exits public class

/*--------------------------------------------------------------------------------------------------------------------------------------

output:

Description: user entered description
Units on hand: user entered units on hand
Price: user entered price

Would you like to repeat the program?

----------------------------------------------------------------------------------------------------------------------------------------
pseudocode:

1.0 import JOptionPane;

2.0 declare variables;

2.1 String description;

2.2 int unitsOnHand;

2.3 double price;

2.4 boolean flag[] = new boolean[5];

2.5 String str;

2.6 String repeat;

3.0 begin do while loop

4.0 initialize all flag variables to true;

5.0 user enter description of retail item;

6.0 while(flag[0] == true);

7.0 flag[1] = true - used if program repeated;

8.0 flag[2] = true - used if program repeated;

9.0 while (flag[1] == true);

10.0 user enters units on hand;

11.0 try unitsOnHand = Integer.parseInt(str);

11.1 flag[1] = false;

12.0 catch (NumberFormatException e);

12.1 print error message;

13.0 flag[1] = true;

14.0 while(flag[2] = true);

15.0 user entered item price;

16.0 try price = Double.parseDouble(str);

16.1 flag[2] = false;

17.0 catch(NumberFormatException e);

17.1 print error message;

17.2 flag[2] = true;

18.0 try created RetailItem object;

18.1 flag[0] = false;

19.0 catch(NegativePrice e)

19.1 print error message;

19.2 flag[0] = true;

20.0 catch(NegativeUnitsOnHand e)

21.1 print error message;

21.2 flag[0] = true;

22.0 print user entered description, units on hand, and price;

23.0 user enter repeat program;

24.0 while(repeat.equalsIgnoreCase("YES")-part of do while loop;

25.0 close JOptionPane;

26.0 end;

*/