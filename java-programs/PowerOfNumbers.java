/**
* @author Brian Goodwin
* @version 1.0, Apr. 22, 2014
* The purpose of this program is to demonstrate a number
* raised to a power using recursion
**/
public class PowerOfNumbers
{
	private int number; //holds number
	private int exponent; //holds exponent

	/**
	* The constructor accepts args for number and exponent
	* @param number accepts args for number
	* @param exponent accepts args for exponent
	**/

	public PowerOfNumbers(int number, int exponent)
	{
		this.number = number;
		this.exponent = exponent;
	}

	/**
	* @param setNumber accepts args for number
	**/

	public void setNumber(int number)
	{
		this.number = number;
	}

	/**
	* @param setExponent accepts args for the exponent
	**/

	public void setExponent(int exponent)
	{
		this.exponent = exponent;
	}

	/**
	* @return the number
	**/

	public int getNumber()
	{
		return number;
	}

	/**
	* @return the exponent
	**/

	public int getExponent()
	{
		return exponent;
	}

	/**
	* @param calcAnswer calculates the number raised to the power
	* @return the number raised to the power
	**/

	public static int calcAnswer(int number, int exponent)
	{
		if(exponent == 0)
		{
			return 1;
		}
		else

		return number * calcAnswer(number, exponent - 1);
	}
}