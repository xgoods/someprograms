public class payMe
{
	private int employeeID;
	private double grossPay;
	private double stateTax;
	private double fedTax;
	private double FICA;
	private double netPay;
	private String str;

	public payMe(int employeeID, double grossPay, double stateTax, double fedTax, double FICA)
	{
		this.employeeID = employeeID;
		this.grossPay = grossPay;
		this.stateTax = stateTax;
		this.fedTax = fedTax;
		this.FICA = FICA;
	}

	public void setEmployeeID(int employeeID)
	{
		this.employeeID = employeeID;
	}

	public void setGrossPay(double grossPay)
	{
		this.grossPay = grossPay;
	}

	public void setStateTax(double stateTax)
	{
		this.stateTax = stateTax;
	}

	public void setFedTax(double fedTax)
	(
		this.fedTax = fedTax;
	}

	public void setFICA(double FICA)
	{
		this.FICA = FICA;
	}

	private double getNetPay()
	{
		return netPay;
	}
}