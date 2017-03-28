import java.util.Scanner;
import java.io.*;
public class EmployeePayCheckTest
{
	public static void main(String[] args)throws IOException
	{
		int numEmployees;
		String[] employeeNames;
		double[] grossPay;
		double[] stateTax;
		double[] fedTax;
		double[] FICA;
		double[] netPay;
		double employeeNetPay = 0;
		String repeat;
		int numberOfLines = 100;
		Process exitCode;

		Scanner input = new Scanner(System.in);

		do
		{
			System.out.print("How many employees would you like to enter?: ");
			numEmployees = input.nextInt();

			employeeNames = new String[numEmployees];
			grossPay = new double[numEmployees];
			stateTax = new double[numEmployees];
			fedTax = new double[numEmployees];
			FICA = new double[numEmployees];
			netPay = new double[numEmployees];

			input.nextLine();
			for(int index = 0; index < numEmployees; index++)
			{

				System.out.print("\nEnter the name of employee " + (index) + ":");
				employeeNames[index] = input.nextLine();
			}


			for(int index = 0; index < employeeNames.length; index++)
			{
				System.out.print("\nEnter the gross pay for " + employeeNames[index] + ":");
				grossPay[index] = input.nextDouble();

				System.out.print("\nEnter the state tax withheld for " + employeeNames[index] + ":");
				stateTax[index] = input.nextDouble();

				System.out.print("\nEnter the federal tax withheld for " + employeeNames[index] + ":");
				fedTax[index] = input.nextDouble();

				System.out.print("\nEnter the FICA withhedl for " + employeeNames[index] + ":");
				FICA[index] = input.nextDouble();
			}

			for(int index = 0; index < employeeNames.length; index++)
			{
				employeeNetPay = EmployeePaycheck.calculateNetPay(grossPay, stateTax, fedTax, FICA, netPay,employeeNetPay);
			}

			System.out.println("Employee name\tgross pay\tstate tax\tfed tax\t FICA\tnet pay");
			System.out.print("------------------------------------------------------------------------");
			for(int index = 0; index < employeeNames.length; index++)
			{
				System.out.print("\n" + employeeNames[index] + "\t\t$" + grossPay[index] + "\t\t$" + stateTax[index] + "\t\t$" +
								fedTax[index] + "\t\t$" + FICA[index] + "\t\t$" + netPay[index]);
			}

			System.out.print("\nWould you like to repeat the program?: ");
			repeat = input.nextLine();


		}while(repeat.equalsIgnoreCase("YES"));
	}
}
