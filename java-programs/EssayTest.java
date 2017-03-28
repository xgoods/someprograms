import javax.swing.JOptionPane;
import java.text.DecimalFormat;
/**
* @author Brian Goodwin
* @version 1.0 Apr. 8, 2014
* The purpose of this program is to have the user input
* essay rubric point values than print final grade
**/

public class EssayTest
{
	public static void main(String[] args)
	{
		double grammar = 0; //holds grammar points
		double spelling = 0; //holds spelling points
		double correctLength = 0; //holds correct length points
		double content = 0; //holds content points
		double numericScore = 0; //holds numeric score
		boolean[] flag = new boolean[8]; //holds flag variables
		String str; //holds JOptionPane string
		String repeat; //holds repeat answer

		do
		{

			for(int index = 0; index < flag.length; index++) //sets all flag variables to true
			{
				flag[index] = true;
			}

			while(flag[0] == true) //ensures user enters a double number
			{
				str = JOptionPane.showInputDialog("Enter the amount of points the student received for grammar.");
				try
				{
					grammar = Double.parseDouble(str);
					flag[0] = false;
				}
				catch(NumberFormatException a)
				{
					JOptionPane.showMessageDialog(null,"You've entered an incorrect number.");
					flag[0] = true;
				}
			}

			while(flag[1] = true && grammar < 0 || grammar > 30) ///ensures user enters point value within parameters
			{
				JOptionPane.showMessageDialog(null,"Point values for grammar can only be between 0 and 30.");
				str = JOptionPane.showInputDialog("Enter the amount of points the student received for grammar.");
				try
				{
					grammar = Double.parseDouble(str);
					flag[1] = false;
				}
				catch(NumberFormatException b)
				{
					JOptionPane.showMessageDialog(null,"You've entered an incorrect number.");
					flag[1] = true;
				}
			}

			while(flag[2] == true) //ensures user enterers double number
			{
				str = JOptionPane.showInputDialog("Enter the amount of points the student received for spelling.");
				try
				{
					spelling = Double.parseDouble(str);
					flag[2] = false;
				}
				catch(NumberFormatException c)
				{
					JOptionPane.showMessageDialog(null,"You've entered an incorrect number.");
					flag[2] = true;
				}
			}

			while(flag[3] = true && spelling < 0 || spelling > 20) //ensures user enters value within parameters
			{
				JOptionPane.showMessageDialog(null,"Point values for spelling can only be between 0 and 20.");
				str = JOptionPane.showInputDialog("Enter the amount of points the student received for spelling.");
				try
				{
					spelling = Double.parseDouble(str);
					flag[3] = false;
				}
				catch(NumberFormatException d)
				{
					JOptionPane.showMessageDialog(null,"You've entered an incorrect number.");
					flag[3] = true;
				}
			}

			while(flag[4] == true) //ensures user enters double number
			{
				str = JOptionPane.showInputDialog("Enter the amount of points the student received for correct length.");
				try
				{
					correctLength = Double.parseDouble(str);
					flag[4] = false;
				}
				catch(NumberFormatException e)
				{
					JOptionPane.showMessageDialog(null,"You've entered an incorrect number.");
					flag[4] = true;
				}
			}

			while(flag[5] = true && correctLength < 0 || correctLength > 20) //ensures user enters value within parameters
			{
				JOptionPane.showMessageDialog(null,"Point values for correct length can only be between 0 and 20.");
				str = JOptionPane.showInputDialog("Enter the amount of points the student received for correct length.");
				try
				{
					correctLength = Double.parseDouble(str);
					flag[5] = false;
				}
				catch(NumberFormatException f)
				{
					JOptionPane.showMessageDialog(null,"You've entered an incorrect number.");
					flag[5] = true;
				}
			}

			while(flag[6] == true) //ensures user enters double number
			{
				str = JOptionPane.showInputDialog("Enter the amount of points the student received for content.");
				try
				{
					content = Double.parseDouble(str);
					flag[6] = false;
				}
				catch(NumberFormatException g)
				{
					JOptionPane.showMessageDialog(null,"You've entered an incorrect number.");
					flag[6] = true;
				}
			}

			while(flag[7] = true && content < 0 || content > 30) //ensures user enters value within parameters
			{
				JOptionPane.showMessageDialog(null,"Point values for content can only be between 0 and 30.");
				str = JOptionPane.showInputDialog("Enter the amount of points the student received for content.");
				try
				{
					content = Double.parseDouble(str);
					flag[7] = false;
				}
				catch(NumberFormatException h)
				{
					JOptionPane.showMessageDialog(null,"You've entered an incorrect number.");
					flag[7] = true;
				}
			}

			Essay points = new Essay(grammar, spelling, correctLength, content, numericScore); //creates Essay object
			DecimalFormat rounder = new DecimalFormat("##"); //creates DecimalFormat object

			JOptionPane.showMessageDialog(null,"Student Grade" +
										  "\n---------------------------------------" +
										  "\n Grammar points: " + points.getGrammar() +
										  "\n Spelling points: " + points.getSpelling() +
										  "\n Correct length points: " + points.getCorrectLength() +
										  "\n Content points: " + points.getContent() +
										  "\n Numeric score: " + rounder.format(points.getScore()) + "%" +
										  "\n Letter grade: " + points.getGrade());

			repeat = JOptionPane.showInputDialog(null,"Would you like to repeat the program?"); //user repeat program

		}while (repeat.equalsIgnoreCase("YES")|| repeat.equalsIgnoreCase("Y"));
	System.exit(0); //exits JOptionPane
	} //exit main method
} //exit public class

/*----------------------------------------------------------------------------------------------------------------------------------------------------------

1.0 import JOptionPane;

2.0 import DecimalFormat;

3.0 declare and/or initialize variables

3.1 double grammar = 0;

3.2 double spelling = 0;

3.3 double correctLength = 0;

3.4 double content = 0;

3.5 double numericScore = 0;

3.6 boolean[] flag = new boolean[5];

3.7 String str;

3.8 String repeat;

4.0 begin do while loop;

5.0 initialize all flag variables to true;

6.0 while flag[0] == true;

6.1 user enter grammar points;

6.2 try grammar = Double.parseDouble(str);

6.3 flag[0] = false;

6.4 catch(NumberFormatException a) print error message;

6.5 flag[0] = true;

7.0 while flag[1] = true && grammar < 0 || grammar > 30;

7.1 print error message;

7.2 user input grammar points

7.3 try grammar = Double.parseDouble(str);

7.4 flag[1] = false;

7.5 catch(NumberFormatException b) print error message;

7.6 flag[1] = true;

8.0 while flag[2] == true;

8.1 user enter spelling points;

8.2 try spelling = Double.parseDouble(str);

8.3 flag[2] = false;

8.4 catch(NumberFormatException c) print error message;

8.5 flag[2] = true;

9.0 while flag[3] = true && spelling < 0 || spelling > 20;

9.1 print error message;

9.2 user input spelling points

9.3 try spelling = Double.parseDouble(str);

9.4 flag[3] = false;

9.5 catch(NumberFormatException d) print error message;

9.6 flag[3] = true;

10.0 while flag[4] == true;

10.1 user enter correct length points;

10.2 try correctLength = Double.parseDouble(str);

10.3 flag[4] = false;

10.4 catch(NumberFormatException e) print error message;

10.5 flag[4] = true;

11.0 while flag[5] = true && correctLength < 0 || correctLength > 20;

11.1 print error message;

11.2 user input correct length points

11.3 try correctLength = Double.parseDouble(str);

11.4 flag[5] = false;

11.5 catch(NumberFormatException f) print error message;

11.6 flag[5] = true;

12.0 while flag[6] == true;

12.1 user enter content points;

12.2 try content = Double.parseDouble(str);

12.3 flag[6] = false;

12.4 catch(NumberFormatException g) print error message;

12.5 flag[6] = true;

13.0 while flag[7] = true && content < 0 || content > 30;

13.1 print error message;

13.2 user input content points

13.3 try content = Double.parseDouble(str);

13.4 flag[7] = false;

13.5 catch(NumberFormatException h) print error message;

13.6 flag[7] = true;

14.0 create Essay object;

15.0 create DecimalFormat object;

16.0 print student grade;

17.0 user input repeat program;

18.0 while repeat.equalsIgnoreCase("YES")- part of do-while loop;

19.0 exit JOptionPane;

20.0 end;

*/
