//Brian Goodwin

//This program will convert feet to inches using JOptionPane
// lab 1 question b
import javax.swing.JOptionPane;
public class feetToInches
{
	public static void main(String[] args)// main method
	{
		String inputFeet;
		float feet;
		float inches;

		inputFeet = JOptionPane.showInputDialog("Enter the amount in feet");
		feet = Float.parseFloat(inputFeet);

		if(feet < 0)// ensure user enters amount greater than 0
		{
			JOptionPane.showMessageDialog(null, "You've entered an incorrect number");
			inputFeet = JOptionPane.showInputDialog("Enter the amount in feet");
			feet = Float.parseFloat(inputFeet);
		}

		inches = feet * 12; //converts feet to inches

		JOptionPane.showMessageDialog(null, "The amount of feet you entered is " + feet);
		JOptionPane.showMessageDialog(null, "The amount of inches that converts to is " + inches);

	System.exit(0);
}
}

/*
-----------------------------------------------------------------------------------------------------
pseudocode

1.0 import JOptionPane;

2.0 declare String;

3.0 declare feet;

4.0 declare inches;

5.0 get feet;

6.0 ensure user doesn't enter num < 0

7.0 convert feet to inches;

8.0 display feet;

9.0 display inches;

10.0 end;

*/