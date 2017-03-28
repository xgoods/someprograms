/**
* @author Brian Goodwin
* @version 1.0 Apr. 22, 2014
* The purpose of this program is to demonstrate
* the sum of the values in the numbers variable
* using recursion
**/
public class SumOfNumbers
{
	private int number; //holds number
	private int sum; //holds sum

	/**
	* The constructor accepts args for number
	* @param number accepts args for the number
	* @param sum accepts args for the sum
	**/

	public SumOfNumbers(int number)
	{
		this.number = number;
	}

	/**
	* @param setNumber accepts args for the number
	**/

	public void setNumber(int number)
	{
		this.number = number;
	}

	/**
	* @return the number
	**/

	public int getNumber()
	{
		return number;
	}

	/**
	* @param getMyMethod calculates the sum
	* @return the sum of the number
	**/

	public int getMyMethod(int number)
	{
		if(number > 0)
		{
			sum += number;
			getMyMethod(number - 1);
		}

		return sum;
	}
}