/**
*@author Brian Goodwin
*@version 1.0 Sept. 25, 2014
**/
import javax.swing.JOptionPane;
public class BeerTest
{
	public static void main (String[] args)
	{
		String brand = null; //holds beer brand
		String type = null; //holds beer type
		double price = 0; //holds beer price
		String str; //holds string for JOptionPane
		boolean[] flag = new boolean[3]; //holds flag
		Beer coldOne;
		
		for(int i =0; i < flag.length; i++)
		{
			flag[i] = false;
		}
		
		while(flag[0] == false)
		{
			brand = JOptionPane.showInputDialog("Enter the brand of beer.");
			
			if(brand.equals(""))
			{
				JOptionPane.showMessageDialog(null,"You cannot leave this field blank.");
			}
			else
			{
				flag[0] = true;
			}
		}
		
		while(flag[1] == false)
		{
			type = JOptionPane.showInputDialog("Enter the type of beer.");
			
			if(type.equals(""))
			{
				JOptionPane.showMessageDialog(null,"You cannot leave this field empty.");
			}
			else
			{
				flag[1] = true;
			}
		}
		
		while(flag[2] == false) //ensures user enters valid price
		{
			str = JOptionPane.showInputDialog("Enter the price of the beer.");
			try
			{
				price = Double.parseDouble(str);
				flag[2] = true;
				while(price < 0 && flag[2] == true) //ensures user enters positive price
				{
					JOptionPane.showMessageDialog(null,"Invalid Price");
					str = JOptionPane.showInputDialog("Enter the price of the beer");
					
					try
					{
						price = Double.parseDouble(str);
						flag[2] = true;
					}
					catch(NumberFormatException e)
					{
						JOptionPane.showMessageDialog(null,"Invalid Price");
						flag[2] = false;
					}
				}
			}
			catch(NumberFormatException e)
			{
				JOptionPane.showMessageDialog(null,"Invalid Price.");
				flag[2] = false;
			}
		}	
		
		coldOne = new Beer(brand, type, price);
		JOptionPane.showMessageDialog(null,"Beer Brand: " + coldOne.getBeerBrand() +
																 "\nBeer Type: " + coldOne.getBeerType() +
																 "\nBeer Price: $" + coldOne.getBeerPrice());
	System.exit(0); //exits JOptionPane
	}
}
