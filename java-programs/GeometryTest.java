import javax.swing.JOptionPane;
import java.text.DecimalFormat;
/**
* @author Brian Goodwin
* @version 1.0, Mar. 4,2014
* The purpose of the program is to allow a user
* to input the radius of a circle and then calculate the area
* of the cirlce, enter the length and width of a rectangle and the calculate
* the area of the rectangle, or enter the base and height of a triangle
* and the calculate the area of the triangle
**/

public class GeometryTest
{
	public static void main(String[] args)
	{
		double radius; //holds radius of circle
		double length; //hold length of rectangle
		double width; //holds width of rectangle
		double base; //holds base of triangle
		double height; //holds height of triangle
		int answer; //holds answer to menu option
		String str; //used for JOptionPane input
		double areaCircle; //holds area of cirlce
		double areaRectangle; //holds area of rectangle
		double areaTriangle; //holds area of triangle

		DecimalFormat rounder = new DecimalFormat(".###"); //creates decimal formatting object

		do
		{

			str = JOptionPane.showInputDialog("Geometry Calculator " +
											  "\n--------------------------------------" +
											  "\n 1: Calculate the area of a circle" +
											  "\n 2: Calculate the area of a rectangle" +
											  "\n 3: Calculate the area of a triangle" +
											  "\n 4: Quit");
			answer = Integer.parseInt(str);

			while(answer <= 0 || answer > 4) //ensures user enters correct menu option
			{

				JOptionPane.showMessageDialog(null,"You've entered an incorrect number.");
				str = JOptionPane.showInputDialog("Geometry Calculator " +
												  "\n-------------------------------------" +
												  "\n 1: Calculate the area of a circle" +
												  "\n 2: Calculate the area of a rectangle" +
												  "\n 3: Calculate the area of a triangle" +
											      "\n 4: Quit");
				answer = Integer.parseInt(str);
			}
			if(answer == 1) //statement to ask user for radius and show area of circle
				{
					str = JOptionPane.showInputDialog("Enter the radius of the circle.");
					radius = Double.parseDouble(str);

					areaCircle = Geometry.calcAreaCircle(radius);
					JOptionPane.showMessageDialog(null,"The area of the circle is " + rounder.format(areaCircle));
				}

				if(answer == 2) //statement to ask user for width and length and show area of rectangle
				{
					str = JOptionPane.showInputDialog("Enter the length of the rectangle.");
					length = Double.parseDouble(str);

					str = JOptionPane.showInputDialog("Enter the width of the rectangle.");
					width = Double.parseDouble(str);

					areaRectangle = Geometry.calcAreaRectangle(length,width);
					JOptionPane.showMessageDialog(null,"The area of the rectangle is " + rounder.format(areaRectangle));
				}

				if(answer == 3) //statement to ask user for base and height and show area of triangle
				{
					str = JOptionPane.showInputDialog("Enter the base of the triangle.");
					base = Double.parseDouble(str);

					str = JOptionPane.showInputDialog("Enter the height of the triangle.");
					height = Double.parseDouble(str);

					areaTriangle = Geometry.calcAreaTriangle(base,height);
					JOptionPane.showMessageDialog(null,"The area of the triangle is " + rounder.format(areaTriangle));
				}

		}while(answer == 1 || answer == 2 || answer ==3);

		System.exit(0); //exit JOptionPane
	}//close main method
}//close public class

/**--------------------------------------------------------------------------------------------------------------------------------------

1.0 import JOptionPane;

2.0 import DecimalFormat;

3.0 declare variables

3.1 double length;

3.2 double width;

3.3 double base;

3.4 double height;

3.5 double answer;

3.6 String str;

3.7 double areaCirlce;

3.8 double areaRectangle;

3.9 double areaTriangle;

4.0 create decimal formatting object;

5.0 start do-while loop;

6.0 print menu options;

6.1 user input menu option;

7.0 while (answer <= 0 || answer > 4);

7.1 print menu options;

7.2 user re-enter menu option;

8.0 if(answer == 1)

8.1 user input radius;

8.2 variable areaCirlce initialized to Geometry.calcAreaCircle(area);

8.3 print area of the circle rounded to 3 decimal places;

9.0 if(answer == 2)

9.1 user input length;

9.2 user input width;

9.3 variale areaRectangle initialized to Geometry.calcAreaRectangle(length,width);

9.4 print area of the rectangle rounded to 3 decimal places;

10.0 if(answer == 3)

10.1 user input base;

10.2 user input height;

10.3 variable areaTriangle initialized to Geometry.calcAreaTriangle(base,height);

10.4 print area of the triangle rounded to 3 decimal places;

11.0 repeat do-while loop while (answer == 1 || answer == 2 || answer == 3);

12.0 close JOptionPane;

13.0 end;

*/

