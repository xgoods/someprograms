public class payRoll
{
	private int numEmployees;
	private int[] employeeID = new int [numEmployees];
	private double[] grossPay = new double[numEmployees];
	private double[] stateTax = new double[numEmployees];
	private double[] fedTax = new double[numEmployees];
	private double[] FICA = new double[numEmployees];
	private double[] netPay = new double[numEmployees];
	private String str;

	public payRoll(int numEmployees, int employeeID[], double grossPay[], double stateTax[], double fedTax[], double FICA[],
				   double netPay[])
	{

		this.numEmployees = numEmployees;
		this.employeeID[numEmployees] = employeeID[numEmployees];
		this.grossPay[numEmployees] = grossPay[numEmployees];
		this.stateTax[numEmployees] = stateTax[numEmployees];
		this.fedTax[numEmployees] = fedTax[numEmployees];
		this.FICA[numEmployees] = FICA[numEmployees];
		this.netPay[numEmployees] = netPay[numEmployees];
	}

	public void setEmployeeID(int employeeID[])
	{
		this.employeeID[numEmployees] = employeeID[numEmployees];
	}

	public void setGrossPay(double grossPay[])
	{
		this.grossPay[numEmployees] = grossPay[numEmployees];
	}

	public void setStateTax(double stateTax[])
	{
		this.stateTax[numEmployees] = stateTax[numEmployees];
	}

	public void setFedTax(double fedTax[])
	{
		this.fedTax[numEmployees] = fedTax[numEmployees];
	}

	public void setFICA(double FICA[])
	{
		this.FICA[numEmployees] = FICA[numEmployees];
	}

}





