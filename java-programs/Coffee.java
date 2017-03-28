public class Coffee
{
	private String coffeeBrand;
	private String coffeeType;
	private double coffeePrice;
	
	public Coffee(String brand, String type, double price)
	{
		coffeeBrand = brand;
		coffeeType = type;
		coffeePrice = price;
	}
	
	public void setCoffeeBrand(String brand)
	{
		coffeeBrand = brand;
	}
	
	public void setCoffeeType(String type)
	{
		coffeeType = type;
	}
	
	public void setCofffePrice(double price)
	{
		coffeePrice = price;
	}
	
	public String getCoffeeBrand()
	{
		return coffeeBrand;
	}
	
	public String getCoffeeType()
	{
		return coffeeType;
	}
	
	public double getCoffeePrice()
	{
		return coffeePrice;
	}
}
