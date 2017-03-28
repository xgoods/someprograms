/**
* @author Brian Goodwin
* @version 1.0, Feb. 25, 2014
**/

public class bankCharges
{
	private double startingBal; // starting balance
	private double currentBal; // current balance
	private double numMonths; // number of months
	private int numChecksWritten; // number of checks written
	private double checkCharges; // check charges
	private double totalMonthlyFees; // total monthly fees
	private final int monthlyFee = 10; // set monthly fee
	private final int extraFee = 15; // set extra fee

	/** The constructor accepts arguments for
	* the starting balance, number of months, and
	* number of checks written
	* @param startingBal starting balance
	* @param numMonthsumber of months using account
	* @param numChecksWritten number of checks written
	**/

	public bankCharges(double startingBal, double numMonths, int numChecksWritten)
	{
		this.startingBal = startingBal;
		this.numMonths = numMonths;
		this.numChecksWritten = numChecksWritten;
	}

	/**
	* @param setStartingBal  accepts arugments for
	* the users starting balance
	**/

	public void setStartingBal(double startingBal)
	{
		this.startingBal = startingBal;
	}

	/**
	* @param setNumMonths accepts arguments for
	* the number of months the user is using the account
	**/

	public void setNumMonths(double numMonths)
	{
		this.numMonths = numMonths;
	}

	/**
	* @param setNumChecksWritten accepts argument for
	* the number of checks written
	**/

	public void setNumChecksWritten(int numChecksWritten)
	{
		this.numChecksWritten = numChecksWritten;
	}

	/**
	* @param totalCheckCharges calculates the total
	* check charges
	**/

	public void totalCheckCharges()
	{
		if(numChecksWritten < 20)
		{
			checkCharges = (numChecksWritten * .10);
		}
		if(numChecksWritten >= 20 && numChecksWritten < 40)
		{
			checkCharges = (numChecksWritten * .08);
		}
		if(numChecksWritten >= 40 && numChecksWritten < 60)
		{
			checkCharges = (numChecksWritten * .06);
		}
		if(numChecksWritten >= 60)
		{
			checkCharges = (numChecksWritten * .04);
		}

	}

	/**
	* @param calculateCurrentBal calculates the current
	* balance
	**/

	public void calculateCurrentBal()
	{

		currentBal = startingBal - (numMonths * monthlyFee);

		if(currentBal < 400)
		{
			currentBal -= 15;
		}
		else
		{
			currentBal = startingBal - (numMonths * monthlyFee + checkCharges);
		}

	}

	/**
	* @param calculateMonthlyFees calculates the
	* total monthly fees
	**/

	public void calculateMonthlyFees()
	{
		totalMonthlyFees = (numMonths * monthlyFee);
	}

	/**
	* @return current balance
	**/

	public double getCurrentBal()
	{
		return currentBal;
	}

	/**
	* @return total of monthly fees
	**/

	public double getMonthlyFees()
	{
		return totalMonthlyFees;
	}
}




