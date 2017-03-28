/**
*@author Brian Goodwin
*@version 1.0.0 Sept. 25, 2014
*@version 1.1.0 Oct. 8, 2014 - added equals method and toString method
*@version 1.2.0 Dec. 6, 2014- added compareTo method 
**/
public class Beer implements Comparable<Beer>
{
	private String beerBrand; //holds beer brand
	private String beerType; //holds beer type
	private double beerPrice; //holds beer price
	
	/**
	* This constructor accepts args for beer brand, beer type, beer price
	*@param brand - beer brand
	*@param type - beer type
	*@param price - beer price
	**/
	public Beer(String brand, String type, double price)
	{
		beerBrand = brand;
		beerType = type;
		beerPrice = price;
	}
	
	/**
	*This method accepts args for beer brand
	*@param brand - accepts args for beer brand
	**/
	public void setBeerBrand(String brand)
	{
		beerBrand = brand;
	}
	
	/**
	*This method accepts args for beer type
	*@param type - accepts args for beer type
	**/
	public void setBeerType(String type)
	{
		beerType = type;
	}
	
	/**
	*This method accepts args for beer price
	*@param price - accepts args for beer price
	**/
	public void setBeerPrice(double price)
	{
		beerPrice = price;
	}
	
	/**
	*This method returns beer brand
	*@return - returns beer brand
	**/
	public String getBeerBrand()
	{
		return beerBrand;
	}
	
	/**
	*This method returns beer type
	*@return - returns beer type
	**/
	public String getBeerType()
	{
		return beerType;
	}
	
	/**
	*This method returns beer price
	*@return - returns beer price
	**/
	public double getBeerPrice()
	{
		return beerPrice;
	}
	
	/**
	*This method tests to see if the objects being 
	* added, removed, or searched for are equal to each other
	*@param obj - accepts args for beer object
	*@return true - the objects are equal
	*@return false - the objects are not equal
	**/
	public boolean equals(Object obj)
	{
		if(!(obj instanceof Beer))
		{
			throw new ClassCastException("Beer object expected.");
		}
		
		Beer otherBeer = (Beer) obj;
		
		if(beerBrand.equalsIgnoreCase(otherBeer.getBeerBrand()) && beerType.equalsIgnoreCase			(otherBeer.getBeerType()) && beerPrice == otherBeer.getBeerPrice())
		{
			return true;
		}
		else
		{
			return false;
		}
	}
	
	/**
	*This method compares the beer brands alphabetically to maintain
	alphabetical order
	*@param anotherBeer - aceepts args for beer object
	*@return -1,1, beerBrand.compareToIgnoreCase(anotherBeer.getBeerBrand()) - depending 
	on where the object falls alphabetically
	**/	
	public int compareTo(Beer anotherBeer) throws ClassCastException
    {
        if(!(anotherBeer instanceof Beer))
            throw new ClassCastException("A Beer object expected.");

        if(getBeerBrand().compareToIgnoreCase(anotherBeer.getBeerBrand()) < 0)
            return -1;
        else if(getBeerBrand().compareToIgnoreCase(anotherBeer.getBeerBrand()) > 0)
            return 1;
        else
            return beerType.compareToIgnoreCase(anotherBeer.getBeerType());
    }
	
	/**
	*This method returns the string representation of the object
	*@return str - returns the string
	**/
	public String toString()
	{
		String str;
		str = "[Beer:  " + beerBrand + " " + beerType + " " + "$" + beerPrice + "]";
		
		return str;
	}
}
