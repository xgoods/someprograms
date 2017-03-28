/**
* @author Brian Goodwin
* @version 1.0, Mar. 1, 2014
* The PayCheck class represents an employee's paycheck
**/

public class PayCheck
{
	private int employeeID; // employee ID
	private double grossPay; // employee gross pay
	private double stateTax; // state tax withheld
	private double fedTax; // federal tax withheld
	private double FICA;// FICA withheld
	private double netPay;// net pay

	/** The constructor accepts arguments for the employee ID,
	* employee gross pay, the state tax withheld, the federal tax withheld,
	* and the FICA withheld
	* @param employeeID accepts arg for employee's ID
	* @param grossPay accepts arg for employee's gross pay
	* @param stateTax accepts arg for state tax withheld
	* @param fedTax accepts args for federal tax withheld
	* @param FICA accepts arg for FICA withheld
	**/

	public PayCheck(int employeeID, double grossPay, double stateTax, double fedTax, double FICA)
	{
		this.employeeID = employeeID;
		this.grossPay = grossPay;
		this.stateTax = stateTax;
		this.fedTax = fedTax;
		this.FICA = FICA;
	}

	/**
	* @param setEmployeeID accepts arguements for
	* the employee's ID
	**/

	public void setEmployeeID(int employeeID)
	{
		this.employeeID = employeeID;
	}

	/**
	* @param setGrossPay accepts arguements for
	* the employee's gross pay
	**/

	public void setGrossPay(double grossPay)
	{
		this.grossPay = grossPay;
	}

	/**
	* @param setStateTax accepts arguements for
	* the state tax withheld
	**/

	public void setStateTax(double stateTax)
	{
		this.stateTax = stateTax;
	}

	/**
	* @param setFedTax accepts arguements for
	* the federal tax withheld
	**/

	public void setFedTax(double fedTax)
	{
		this.fedTax = fedTax;
	}

	/**
	* @param setFICA accepts arguements for
	* the FICA withheld
	**/

	public void setFICA(double FICA)
	{
		this.FICA = FICA;
	}

	/**
	* @param calculateNetPay calculates the employees
	* net pay
	**/

	public void calculateNetPay()
	{
		netPay = (grossPay - (stateTax + fedTax + FICA));
	}

	/**
	* @return the employee's net pay
	**/

	public double getNetPay()
	{
		return netPay;
	}
}

