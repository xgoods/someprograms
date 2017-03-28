public class EmployeePaycheck
{
	private int numEmployees;
	private String[] employeeName = new String[numEmployees];
	private double[] grossPay = new double[numEmployees];
	private double[] stateTax = new double[numEmployees];
	private double[] fedTax = new double[numEmployees];
	private double[] FICA = new double[numEmployees];
	private double[] netPay = new double[numEmployees];
	private double employeeNetPay;

	public static double calculateNetPay(double[] grossPay, double[] stateTax, double[] fedTax, double[] FICA, double[] netPay, double employeeNetPay)
	{


		for(int index = 0; index < netPay.length; index++)
		{
			netPay[index] = (grossPay[index] - (stateTax[index] + fedTax[index] + FICA[index]));
			employeeNetPay = netPay[index];
		}

		return employeeNetPay;
	}
}