/**
* @author Brian Goodwin
* @version 1.0, Feb. 25, 2014
**/

public class shippingCharges
{
	private double milesShipped; // miles shipped
	private double weightPackageLbs; // package weight in Lbs.
	private double weightPackageKgs; // package weight in Kgs.
	private double totalShippingCharges; // total shipping charges
	private double subMilesShipped; // used to calculate shipping charge

	/**
	* This contructor accepts arguements for
	* the amount of miles shipped and the
	* package weight in Lbs.
	* @param milesShipped miles to be shipped
	* @param weightPackageLbs package weight in Lbs.
	**/

	public shippingCharges(double milesShipped, double weightPackageLbs)
	{
		this.milesShipped = milesShipped;
		this.weightPackageLbs = weightPackageLbs;
	}

	/**
	* @param setMilesShipped accepts argument for
	* miles to be shipped
	**/

	public void setMilesShipped(double milesShipped)
	{
		this.milesShipped = milesShipped;
	}

	/**
	* @param setWeightPackageLbs accepts agruemtns for
	* the weight of the package in Lbs.
	**/

	public void setWeightPackageLbs(double weightPackageLbs)
	{
		this.weightPackageLbs = weightPackageLbs;
	}

	/**
	* @param calculateWeightPackageKgs coverts package weight
	* in Lbs. to kilograms
	**/

	public void calculateWeightPackageKgs()
	{
		weightPackageKgs = (weightPackageLbs * .453592);
	}

	/**
	* @param calculateTotalShippingCharges calculates the
	* total shipping charges
	**/

	public void calculateTotalShippingCharges()
	{
		subMilesShipped = milesShipped;

		if(weightPackageKgs <= 2 && milesShipped <= 500)
		{
			totalShippingCharges = 1.10;
		}

		while(weightPackageKgs <= 2 && milesShipped > 500 && subMilesShipped > 0)
		{
			totalShippingCharges += 1.10;
			subMilesShipped -= 500;
		}

		if(weightPackageKgs > 2 && weightPackageKgs <= 6 && milesShipped <= 500)
		{
			totalShippingCharges = 2.20;
		}

		while(weightPackageKgs > 2 && weightPackageKgs <= 6 && milesShipped > 500 && subMilesShipped > 0)
		{
			totalShippingCharges += 2.20;
			subMilesShipped -= 500;
		}

		if(weightPackageKgs > 6 && weightPackageKgs <= 10 && milesShipped <= 500)
		{
			totalShippingCharges = 3.70;
		}

		while(weightPackageKgs > 6 && weightPackageKgs <= 10 && milesShipped > 500 && subMilesShipped > 0)
		{
			totalShippingCharges += 3.70;
			subMilesShipped -= 500;
		}

		if(weightPackageKgs > 10 && milesShipped <= 500)
		{
			totalShippingCharges = 4.80;
		}

		while(weightPackageKgs > 10 && milesShipped > 500 && subMilesShipped > 0)
		{
			totalShippingCharges += 4.80;
			subMilesShipped -= 500;
		}
	}

	/**
	* @return total shipping charges
	**/

	public double getTotalShippingCharges()
	{
		return totalShippingCharges;
	}

	/**
	* @return the package weight in kilograms
	**/

	public double getWeightPackageKgs()
	{
		return weightPackageKgs;
	}
}








