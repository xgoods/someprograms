/**
* @author Brian Goodwin
* @version 1.0 Apr. 15, 2014
* This program throws an exception is a negative price
* is entered
**/

public class NegativePrice extends Exception
{

	/**
	* No arg constructor
	**/

	public NegativePrice()
	{
		super("You cannot have a negative retail price");
	}

	/**
	* @param price accepts args for item price
	**/

	public NegativePrice(double price)
	{
		super("Error: Negative price: " + price);
	}
}