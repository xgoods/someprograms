/**
* @author Brian Goodwin
* @version 1.0 Apr. 15, 2014
* This program demonstrates a retail item's inventory
**/
public class RetailItem
{
	private String description; //holds item description
	private int unitsOnHand; //holds units on hand
	private double price; //holds price

	/**
	* constructor
	* @param description accepts args for item description
	* @param unitsOnHand accepts args for item units on hand
	* @param price accepts args for item price
	**/
	public RetailItem(String description, int unitsOnHand, double price)throws NegativeUnitsOnHand, NegativePrice
	{
		this.description = description;
		this.unitsOnHand = unitsOnHand;
		this.price = price;

		if(unitsOnHand < 0) //ensures unitsOnHand is positive
		{
			throw new NegativeUnitsOnHand(unitsOnHand);
		}
		if(price < 0) //ensures price is positive
		{
			throw new NegativePrice(price);
		}
    }

    /**
    * @param setDescription accepts args for item description
    **/

    public void setDescription(String description)
    {
		this.description = description;
    }

    /**
    * @param setUnitsOnHand accepts args for units on hand
    **/

    public void setUnitsOnHand(int unitsOnHand)
    {
		this.unitsOnHand = unitsOnHand;
    }

    /**
    * @param setPrice accepts args for price
    **/

    public void setPrice(double price)
    {
		this.price = price;
    }

	/**
	* @return item description
	**/

    public String getDescription()
    {
		return description;
    }

    /**
    * @return item units on hand
    **/

    public int getUnitsOnHand()
    {
		return unitsOnHand;
    }

	/**
	* @return item price
	**/

    public double getPrice()
    {
		return price;
    }
}