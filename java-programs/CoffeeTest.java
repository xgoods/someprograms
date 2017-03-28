import javax.swing.JOptionPane;
public class CoffeeTest
{
	public static void main(String[] args)
	{
		String brand;
		String type;
		double price;
		String str;
		
		brand = JOptionPane.showInputDialog("Enter a brand of coffee.");
		type = JOptionPane.showInputDialog("Enter a type of coffee.");
		str = JOptionPane.showInputDialog("Enter the price of the coffee.");
		price = Double.parseDouble(str);
		
		Coffee subCoffee = new Coffee(brand, type, price);
		
		JOptionPane.showMessageDialog(null,"Coffee Brand: " + subCoffee.getCoffeeBrand() +
																 "\nCoffee Type: " + subCoffee.getCoffeeType() + 
																 "\nCoffee Price: $" + subCoffee.getCoffeePrice());
	}
}
