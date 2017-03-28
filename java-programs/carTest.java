import javax.swing.JOptionPane;
import java.util.Random;
/**
*@author Brian Goodwin
*@version 1.0
**/
public class carTest
{
	public static void main(String[] args) // main method
	{
		int yearModel; // year model
		String make; // make
		int speed; // speed
		String str; // string JOptionPane
		int number; // number for random num generator

		str = JOptionPane.showInputDialog("What is the year model of your car?");
		yearModel = Integer.parseInt(str);

		make = JOptionPane.showInputDialog("What is the make of your car?");

		str = JOptionPane.showInputDialog("What is your current speed?");
		speed = Integer.parseInt(str);

		car subCar = new car(yearModel,make,speed); // new car object

		Random randomNum = new Random();// new random number object

		JOptionPane.showMessageDialog(null,"We are currently testing the brakes for a(n) " +
		subCar.getYearModel() + " " + subCar.getMake());


		JOptionPane.showMessageDialog(null,"Your current speed is " + subCar.getSpeed() + "mph");

		for(int index = 0; index < 10; index++)// loop to brake or accelerate car 10 times
		{

			number = randomNum.nextInt(20);
			if(number >= 10) // accelerates car
				{
				subCar.accelerate();
				JOptionPane.showMessageDialog(null,"Your speed after acceleration is " + subCar.getAccelerate() + " mph");
				}
			if(number < 10) // brakes car
				{
				subCar.brake();
				JOptionPane.showMessageDialog(null,"Your speed after braking is " + subCar.getBrake() + " mph");
				}

		}

	System.exit(0);
	}
}

/*------------------------------------------------------------------------------------------------------------------------------

pseudocode

1.0 import JOptionPane;

2.0 import Random;

3.0 declare year model;

4.0 declare make;

5.0 declare speed;

6.0 declare JOptionPane string;

7.0 declare number for random generator;

8.0 user input year model;

9.0 user input make;

10.0 user input current speed;

11.0 create new car object;

12.0 create new random numbers object;

12.1 random numbers generate 0-20;

13.0 display current speed using getter;

14.0 intitialize loop to randomly accelerate or brake car;

14.1 loop iterates 10 times;

15.0 if statement to accelerate;

15.1 if number >= 10 accelerate;

15.2 display current speed after acceleration using getter;

16.0 if statement to brake;

16.1 if number < 10 brake

16.2 display current speed after braking using getter;

17.0 end;

*/







