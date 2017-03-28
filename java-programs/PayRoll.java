public class PayRoll
{
	private int employeeID;
	private double grossPay;
	private double stateTax;
	private double fedTax;
	private double FICA;
	private double netPay;
	private String str;

	public PayRoll(int employeeID, double grossPay, double stateTax, double fedTax, double FICA)
	{
		this.employeeID = employeeID;
		this.grossPay = grossPay;
		this.stateTax = stateTax;
		this.fedTax = fedTax;
		this.FICA = FICA;
	}

	private void setEmployeeID(int employeeID)
	{
		this.employeeID = employeeID;
	}

	private void setGrossPay(double grossPay)
	{
		this.grossPay = grossPay;
	}

	private void setStateTax(double stateTax)
	{
		this.stateTax = stateTax;
	}

	private void setFedTax(double fedTax)
	(
		this.fedTax = fedTax;
	}

	private void setFICA(double FICA)
	{
		this.FICA = FICA;
	}

	private double getNetPay()
	{
		netPay = (grossPay - (stateTax + fedTax + FICA));

		return netPay;
	}
}