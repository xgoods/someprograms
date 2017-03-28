/**
* @author Brian Goodwin
* @version 1.0 Apr. 15, 2014
* This program throws an exception is units on hand
* is negative
**/

public class NegativeUnitsOnHand extends Exception
{

	/**
	* No arg constructor
	**/
	public NegativeUnitsOnHand()
	{
		super("You cannot have negative units on hand");
	}

	/**
	* @param unitsOnHand accepts args for item units on hand
	**/

	public NegativeUnitsOnHand(int unitsOnHand)
	{
		super("Error: Negative units on hand: " + unitsOnHand);
	}
}