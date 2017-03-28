import javax.swing.JOptionPane;
import java.text.DecimalFormat;
/**
* @author Brian Goodwin
* @version 1.0, Mar. 8, 2014
* The purpose of this program is to test overloaded static methods
* using arrays of different data types
**/
public class arrayOperationsTest
{
	public static void main(String[] args)
	{

		//integer variables
		int[] INTarray; //holds integer array
		int INTtotal = 0; //holds sum of integer values
		int INTaverage = 0; //holds average of integer values
		int INThighest = 0; // holds highest integer value
		int INTlowest = 0; //holds lowest integer value

		//double variables
		double[] DUBarray; //holds double array
		double DUBtotal = 0; //holds sum of double values
		double DUBaverage = 0; //holds average of double values
		double DUBhighest = 0; //holds highest double value
		double DUBlowest = 0; //holds lowest double value

		//float variables
		float[] FLOarray; //holds float array
		float FLOtotal = 0f; //holds sum of float values
		float FLOaverage = 0f; //holds average of float values
		float FLOhighest = 0f; //holds highest float value
		float FLOlowest = 0f; //holds lowest float value

		//long variables
		long[] LONarray; //holds long array
		long LONtotal = 0; //holds sum of long values
		long LONaverage = 0; //holds average of long values
		long LONhighest = 0; //holds highest long value
		long LONlowest = 0; //holds lowest long value

		String str; //used for JOptionPane
		int arrayType = 1; //holds users choice for type of array
		int arraySize = 0; //holds user input size of array
		boolean[] flag = new boolean[5]; //holds flag array

		do
		{
			for(int index = 0; index < flag.length; index++) //initialize flag variables to true
			{
				flag[index] = true;
			}

			while(flag[0] == true && arrayType > 0 && arrayType < 6) //user menu
			{
				str = JOptionPane.showInputDialog("Which data type will your array consist of?" +
											  	  "\n------------------------------------------------------------" +
											      "\n 1: Integer" +
											      "\n 2: Double" +
											      "\n 3: Float" +
											      "\n 4: Long" +
											      "\n 5: Quit");


				try //ensures user enters integer value for menu option
				{
					arrayType = Integer.parseInt(str);
					flag[0] = false;
				}

				catch(NumberFormatException f) //print error message if user enters invalid number
				{
					JOptionPane.showMessageDialog(null,"Your number needs to be an integer 1 through 5.");
					flag[0] = true;
				}
			}
			while(flag[1] = true && arrayType < 1 || arrayType > 5) //ensures user enters valid menu option
			{
				JOptionPane.showMessageDialog(null,"Your number needs to be an integer 1 through 5.");
				str = JOptionPane.showInputDialog("Which data type will your array consist of?" +
												  "\n-------------------------------------------------------------" +
												  "\n 1: Integer" +
												  "\n 2: Double" +
												  "\n 3: Float" +
												  "\n 4: Long" +
												  "\n 5: Quit");
				try //ensures user enters integer value for menu option
				{
					arrayType = Integer.parseInt(str);
					flag[1] = false;
				}
				catch(NumberFormatException i) //prints error message if user enters invalid number
				{
					JOptionPane.showMessageDialog(null,"You've entered an incorrect number.");
					flag[1] = true;
				}
			}

			if(arrayType == 1) // if user select integer option
			{
				while(flag[2] == true)
				{
					str = JOptionPane.showInputDialog("How many values are there in your array?");
					try //ensures user entered integer for array size
					{
						arraySize = Integer.parseInt(str);
						flag[2] = false;
					}
					catch(NumberFormatException g) //print error message if user enters invalid number
					{
						JOptionPane.showMessageDialog(null,"You've entered an incorrect number.");
						flag[2] = true;
					}
				}

				while(flag[3] = true && arraySize <= 0) //ensure user array size is not <= 0
				{
					JOptionPane.showMessageDialog(null,"Your array size must be an integer greater than 0.");
					str = JOptionPane.showInputDialog("How many values are there in your array?");
					try //ensures user enters integer value for array size
					{
						arraySize = Integer.parseInt(str);
						flag[3] = false;
					}
					catch(NumberFormatException l) //print error message if user enters invalid number
					{
						JOptionPane.showMessageDialog(null,"You've entered an incorrect number.");
						flag[3] = true;
					}
				}
				INTarray = new int[arraySize]; //create integer array object

				while(flag[4] == true)
				{
					for(int index = 0; index < INTarray.length; index++) //user enters integer values for array
					{
						str = JOptionPane.showInputDialog("Enter value #" + (index + 1));
						try //ensures user enters integer values for array
						{
							INTarray[index] = Integer.parseInt(str);
							flag[4] = false;
						}
						catch(NumberFormatException e) //print error message if user enters invalid number
						{
							JOptionPane.showMessageDialog(null,"Your value must be an integer data type.");
							flag[4] = true;
							index--;
						}
					}
				}


				INTtotal = arrayOperations.getTotal(INTarray, INTtotal); //calculates int total
				INTaverage = arrayOperations.getAverage(INTarray, INTtotal, INTaverage); //calculates int average
				INThighest = arrayOperations.getHighest(INTarray, INThighest); //calculate highest int value
				INTlowest = arrayOperations.getLowest(INTarray, INTlowest); //calculates lowest int value

				DecimalFormat rounder = new DecimalFormat("#,###"); //create decimal format object

				JOptionPane.showMessageDialog(null,"Sum of array values: " + rounder.format(INTtotal) +
												   "\nAverage of array values: " + rounder.format(INTaverage) +
												   "\nHighest value: " + rounder.format(INThighest) +
												   "\nLowest value: " + rounder.format(INTlowest));

			}

			if(arrayType == 2) //if user selects double option
			{
				while(flag[2] == true)
				{
					str = JOptionPane.showInputDialog("How many values are there in your array?");
					try //ensures user entered double value for array size
					{
						arraySize = Integer.parseInt(str);
						flag[2] = false;
					}
					catch(NumberFormatException g) //print error message if user enters invalid number
					{
						JOptionPane.showMessageDialog(null,"You've entered an incorrect number.");
						flag[2] = true;
					}
				}

				while(flag[3] = true && arraySize <= 0) //ensures user array size is not <= 0
				{
					JOptionPane.showMessageDialog(null,"Your array size must be an integer greater than 0.");
					str = JOptionPane.showInputDialog("How many values are there in your array?");
					try //ensures user enters integer value for array size
					{
						arraySize = Integer.parseInt(str);
						flag[3] = false;
					}
					catch(NumberFormatException l) //print error message if user enters invalid number
					{
						JOptionPane.showMessageDialog(null,"You've entered an incorrect number.");
						flag[3] = true;
					}
				}
				DUBarray = new double[arraySize]; // creates double array object

				while(flag[4] == true)
				{
					for(int index = 0; index < DUBarray.length; index++) //user enters double values for array
					{
						str = JOptionPane.showInputDialog("Enter value #" + (index + 1));
						try //ensures user enters double values for array
						{
							DUBarray[index] = Double.parseDouble(str);
							flag[4] = false;
						}
						catch(NumberFormatException e)// print error message if user enters invalid number
						{
							JOptionPane.showMessageDialog(null,"Your value must be a double data type.");
							flag[4] = true;
							index--;
						}
					}
				}


				DUBtotal = arrayOperations.getTotal(DUBarray, DUBtotal); //calculates double total
				DUBaverage = arrayOperations.getAverage(DUBarray, DUBtotal, DUBaverage); //calculates double average
				DUBhighest = arrayOperations.getHighest(DUBarray, DUBhighest); //calculates highest double value
				DUBlowest = arrayOperations.getLowest(DUBarray, DUBlowest); //calculates lowest double value

				DecimalFormat rounder = new DecimalFormat("#,###.####"); //creates decimal format object

				JOptionPane.showMessageDialog(null,"Sum of array values: " + rounder.format(DUBtotal) +
												   "\nAverage of array values: " + rounder.format(DUBaverage) +
												   "\nHighest value: " + rounder.format(DUBhighest) +
												   "\nLowest value: " + rounder.format(DUBlowest));

			}


		if(arrayType == 3) //if user enters float option
		{
			while(flag[2] == true)
			{
				str = JOptionPane.showInputDialog("How many values are there in your array?");
				try //ensures user enters integer value for array size
				{
					arraySize = Integer.parseInt(str);
					flag[2] = false;
				}
				catch(NumberFormatException g) //print error message if user enters invalid number
				{
					JOptionPane.showMessageDialog(null,"You've entered an incorrect number.");
					flag[2] = true;
				}
			}

			while(flag[3] = true && arraySize <= 0) //ensure user array size is not <= 0
			{
				JOptionPane.showMessageDialog(null,"Your array size must be an integer greater than 0.");
				str = JOptionPane.showInputDialog("How many values are there in your array?");
				try //ensures user enters integer value for array size
				{
					arraySize = Integer.parseInt(str);
					flag[3] = false;
				}
				catch(NumberFormatException l) //print error message if user enters invalid number
				{
					JOptionPane.showMessageDialog(null,"You've entered an incorrect number.");
					flag[3] = true;
				}
			}
			FLOarray = new float[arraySize]; //creates float array object

			while(flag[4] == true)
			{
				for(int index = 0; index < FLOarray.length; index++) //user enters float values for array
				{
					str = JOptionPane.showInputDialog("Enter value #" + (index + 1));
					try //ensures user enters float values for array
					{
						FLOarray[index] = Float.parseFloat(str);
						flag[4] = false;
					}
					catch(NumberFormatException e) //print error message if user enters incorrect number
					{
						JOptionPane.showMessageDialog(null,"Your value must be a float data type.");
						flag[4] = true;
						index--;
					}
				}
			}


			FLOtotal = arrayOperations.getTotal(FLOarray, FLOtotal); //calculates float total
			FLOaverage = arrayOperations.getAverage(FLOarray, FLOtotal, FLOaverage); //calculates float average
			FLOhighest = arrayOperations.getHighest(FLOarray, FLOhighest); //calculates highest float value
			FLOlowest = arrayOperations.getLowest(FLOarray, FLOlowest); //calculates lowest float value

			DecimalFormat rounder = new DecimalFormat("#,###.####"); //creates decimal format object

			JOptionPane.showMessageDialog(null,"Sum of array values: " + rounder.format(FLOtotal) +
											   "\nAverage of array values: " + rounder.format(FLOaverage) +
											   "\nHighest value: " + rounder.format(FLOhighest) +
											   "\nLowest value: " + rounder.format(FLOlowest));

		}

		if(arrayType == 4) //if user enters long menu option
		{
			while(flag[2] == true)
			{
				str = JOptionPane.showInputDialog("How many values are there in your array?");
				try //ensures user enters integer value for array size
				{
					arraySize = Integer.parseInt(str);
					flag[2] = false;
				}
				catch(NumberFormatException g) //print error message if user enters invalid number
				{
					JOptionPane.showMessageDialog(null,"You've entered an incorrect number.");
					flag[2] = true;
				}
			}

			while(flag[3] = true && arraySize <= 0) //ensure user array size is not <= 0
			{
				JOptionPane.showMessageDialog(null,"Your array size must be an integer greater than 0.");
				str = JOptionPane.showInputDialog("How many values are there in your array?");
				try //ensures user enters integer value for array size
				{
					arraySize = Integer.parseInt(str);
					flag[3] = false;
				}
				catch(NumberFormatException l) //print error message if user enters invalid number
				{
					JOptionPane.showMessageDialog(null,"You've entered an incorrect number.");
					flag[3] = true;
				}
			}
			LONarray = new long[arraySize]; //creates long array object

			while(flag[4] == true)
			{
				for(int index = 0; index < LONarray.length; index++) //user enters long values for array
				{
					str = JOptionPane.showInputDialog("Enter value #" + (index + 1));
					try //ensures user enters long values for array
					{
						LONarray[index] = Long.parseLong(str);
						flag[4] = false;
					}
					catch(NumberFormatException e) //print error message if user enters invalid number
					{
						JOptionPane.showMessageDialog(null,"Your value must be a long data type.");
						flag[4] = true;
						index--;
					}
				}
			}


			LONtotal = arrayOperations.getTotal(LONarray, LONtotal); //calculates long total
			LONaverage = arrayOperations.getAverage(LONarray, LONtotal, LONaverage); //calculates long average
			LONhighest = arrayOperations.getHighest(LONarray, LONhighest); //calculates highest long value
			LONlowest = arrayOperations.getLowest(LONarray, LONlowest); //calculates lowest long value

			DecimalFormat rounder = new DecimalFormat("#,###.####"); //create decimal format object

			JOptionPane.showMessageDialog(null,"Sum of array values: " + rounder.format(LONtotal) +
											   "\nAverage of array values: " + rounder.format(LONaverage) +
											   "\nHighest value: " + rounder.format(LONhighest) +
											   "\nLowest value: " + rounder.format(LONlowest));

		}

		}while(arrayType >= 1 && arrayType <= 4); //repeat program unless user enters 5
	System.exit(0); //exit JOptionPane
	} //exit main method
} //exit public class

/*------------------------------------------------------------------------------------------------------------------------------------------------------
1.0 import JOptionPane;

2.0 import DecimalFormat;

3.0 declare integer variables;

3.1 int[] INTarray;

3.2 int INTtotal = 0;

3.3 int INTaverage = 0;

3.4 int INThighest = 0;

3.5 int INTlowest = 0;

4.0 declare double variables;

4.1 double[] DUBarray;

4.2 double DUBtotal = 0;

4.3 double DUBaverage = 0;

4.4 double DUBhighest = 0;

4.5 double DUBlowest = 0;

5.0 declare float variables;

5.1 float[] FLOarray;

5.2 float FLOtotal = 0f;

5.3 float FLOaverage = 0f;

5.4 float FLOhighest = 0f;

5.5 float FLOlowest = 0f;

6.0 declare long variables;

6.1 long[] LONarray;

6.2 long LONtotal = 0;

6.3 long LONaverage = 0;

6.4 long LONhighest = 0;

6.5 long LONlowest = 0;

7.0 declare other variables;

7.1 String str;

7.2 int arrayType = 1;

7.3 int arraySize = 0;

7.4 boolean[] flag = new boolean[5];

8.0 begin do-while loop;

9.0 initialize all flag variables to true using for loop;

10.0 while(flag[0] == true && arrayType > 0 && arrayType < 6)

10.1 print menu options / user input menu option;

10.2 try arrayType = Integer.parseInt(str);

10.3 flag[0] = false;

10.4 catch(NumberFormatException f) print error message;

10.5 flag[0] = true;

11.0 while(flag[1] = true && arrayType < 1 || arrayType > 5)

11.1 print error message;

11.2 redisplay menu options / user re-enter menu option;

11.3 try arrayType = Integer.parseInt(str);

11.4 flag[1] = false;

11.5 catch(NumberFormatException i) print error message;

11.6 flag[1] = true;

12.0 if(arrayType == 1)

12.1 while(flag[2] == true)

12.2.1 user input the amount of values in their array;

12.2.2 try arraySize = Integer.parseInt(str);

12.2.3 flag[2] = false;

12.2.4 catch(NumberFormatException g) print error message;

12.2.5 flag[2] = true;

12.3 while(flag[3] = true && arraySize <= 0)

12.3.1 print error message;

12.3.2 user re-input the amount of values in their array;

12.3.3 try arraySize = Integer.parseInt(str);

12.3.4 flag[3] = false;

12.3.5 catch(NumberFormatException  l) print error message;

12.3.6 flag[3] = true;

12.4 create integer array object INTarray = new int[arraySize];

12.5 while(flag[4] == true);

12.5.1 user input value(s) of array using for loop;

12.5.2 try INTarray[index] = Integer.parseInt(str);

12.5.3 flag[4] = false;

12.5.4 catch(NumberFormatException e) print error message;

12.5.5 flag[4] = true;

12.5.6 index--;

12.6 initialize INTtotal using static method getTotal;

12.7 initialize INTaverage using static method getAverage;

12.8 initialize INThighest using static method getHighest;

12.9 initialize INTlowest using static method getLowest;

12.10 create decimal format object;

12.11 print sum of  array values rounded to 3 decimal places;

12.11.1 print average of array values rounded to 3 decimal places;

12.11.2 print highest array value rounded to 3 decimal places;

12.11.3 print lowest array value rounded to 3 decimal places;

13.0 if(arrayType == 2)

13.1 while(flag[2] == true)

13.2.1 user input the amount of values in their array;

13.2.2 try arraySize = Integer.parseInt(str);

13.2.3 flag[2] = false;

13.2.4 catch(NumberFormatException g) print error message;

13.2.5 flag[2] = true;

13.3 while(flag[3] = true && arraySize <= 0)

13.3.1 print error message;

13.3.2 user re-input the amount of values in their array;

13.3.3 try arraySize = Integer.parseInt(str);

13.3.4 flag[3] = false;

13.3.5 catch(NumberFormatException  l) print error message;

13.3.6 flag[3] = true;

13.4 create double array object DUBarray = new double[arraySize];

13.5 while(flag[4] == true);

13.5.1 user input value(s) of array using for loop;

13.5.2 try DUBarray[index] = Double.parseDouble(str);

13.5.3 flag[4] = false;

13.5.4 catch(NumberFormatException e) print error message;

13.5.5 flag[4] = true;

13.5.6 index--;

13.6 initialize DUBtotal using static method getTotal;

13.7 initialize DUBaverage using static method getAverage;

13.8 initialize DUBhighest using static method getHighest;

13.9 initialize DUBlowest using static method getLowest;

13.10 create decimal format object;

13.11 print sum of array values rounded to 3 decimal places;

13.11.1 print average of array values rounded to 3 decimal places;

13.11.2 print highest array value rounded to 3 decimal places;

13.11.3 print lowest array value rounded to 3 decimal places;

14.0 if(arrayType == 3)

14.1 while(flag[2] == true)

14.2.1 user input the amount of values in their array;

14.2.2 try arraySize = Integer.parseInt(str);

14.2.3 flag[2] = false;

14.2.4 catch(NumberFormatException g) print error message;

14.2.5 flag[2] = true;

14.3 while(flag[3] = true && arraySize <= 0)

14.3.1 print error message;

14.3.2 user re-input the amount of values in their array;

14.3.3 try arraySize = Integer.parseInt(str);

14.3.4 flag[3] = false;

14.3.5 catch(NumberFormatException  l) print error message;

14.3.6 flag[3] = true;

14.4 create float array object FLOarray = new float[arraySize];

14.5 while(flag[4] == true);

14.5.1 user input value(s) of array using for loop;

14.5.2 try FLOarray[index] = Float.parseFloat(str);

14.5.3 flag[4] = false;

14.5.4 catch(NumberFormatException e) print error message;

14.5.5 flag[4] = true;

14.5.6 index--;

14.6 initialize FLOtotal using static method getTotal;

14.7 initialize FLOaverage using static method getAverage;

14.8 initialize FLOhighest using static method getHighest;

14.9 initialize FLOlowest using static method getLowest;

14.10 create decimal format object;

14.11 print sum of  array values rounded to 3 decimal places;

14.11.1 print average of array values rounded to 3 decimal places;

14.11.2 print highest array value rounded to 3 decimal places;

14.11.3 print lowest array value rounded to 3 decimal places;

15.0 if(arrayType == 4)

15.1 while(flag[2] == true)

15.2.1 user input the amount of values in their array;

15.2.2 try arraySize = Integer.parseInt(str);

15.2.3 flag[2] = false;

15.2.4 catch(NumberFormatException g) print error message;

15.2.5 flag[2] = true;

15.3 while(flag[3] = true && arraySize <= 0)

15.3.1 print error message;

15.3.2 user re-input the amount of values in their array;

15.3.3 try arraySize = Integer.parseInt(str);

15.3.4 flag[3] = false;

15.3.5 catch(NumberFormatException  l) print error message;

15.3.6 flag[3] = true;

15.4 create long array object LONarray = new long[arraySize];

15.5 while(flag[4] == true);

15.5.1 user input value(s) of array using for loop;

15.5.2 try LONarray[index] = Long.parseLong(str);

15.5.3 flag[4] = false;

15.5.4 catch(NumberFormatException e) print error message;

15.5.5 flag[4] = true;

15.5.6 index--;

15.6 initialize LONtotal using static method getTotal;

15.7 initialize LONaverage using static method getAverage;

15.8 initialize LONhighest using static method getHighest;

15.9 initialize LONlowest using static method getLowest;

15.10 create decimal format object;

15.11 print sum of  array values rounded to 3 decimal places;

15.11.1 print average of array values rounded to 3 decimal places;

15.11.2 print highest array value rounded to 3 decimal places;

15.11.3 print lowest array value rounded to 3 decimal places;

16.0 end do-while loop while(arrayType <= 1 && arrayType <= 4);

17.0 close JOptionPane;

18.0 end;
*/




