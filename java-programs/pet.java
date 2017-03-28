/**
*@author Brian Goodwin
*@version 1.0
**/
public class pet
{

	private String name; // holds pet name
	private String type; // holds pet type
	private double age; // hold pet age

	/**
	* @param setPetName accepts arguument for
	*        			pets name
	**/

	public void setPetName(String name)
	{
		this.name = name;
	}

	/**
	* @param setPetType accepts argument for
	*					pets type
	**/

	public void setPetType(String type)
	{
		this.type = type;
	}

	/**
	* @param setPetAge accepts argument for
	*				   pets age
	**/

	public void setPetAge(double age)
	{
		this.age = age;
	}

	/**
	* @return pets name
	**/
	public String getPetName()
	{
		return name;
	}

	/**
	* @return pets type
	**/

	public String getPetType()
	{
		return type;
	}

	/**
	* @return pets age
	**/

	public double getPetAge()
	{
		return age;
	}
}