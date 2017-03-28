//Brian Goodwin

//This program will convert feet to inches using Scanner
// lab 1 question B
import java.util.Scanner;

public class feetToInchesV2
{
	public static void main(String[] args)// main method
	{
		Scanner user = new Scanner(System.in);

		float feet;
		float inches;

		System.out.print("Enter the amount in feet you would like to convert: ");
		feet = user.nextFloat();

		if (feet <0)// Ensures user enters positive number
		{
			System.out.println("You've entered an incorrect number");
			System.out.println("Enter the amount in feet you would like to convert: ");
			feet = user.nextFloat();
		}

		inches = feet * 12; // converts feet to inches

		System.out.println("The amount of feet you entered is " + feet);

		System.out.println("The amount of inches is " + inches);
	}
}

/*
-------------------------------------------------------------------------------------
pseudocode;

1.0 import scanner;

2.0 declare feet;

3.0 declare inches;

4.0 user input feet;

5.0 ensure user doesn't enter num < 0

6.0 convert feet to inches;

7.0 display feet;

8.0 display inches;

9.0 end;

*/