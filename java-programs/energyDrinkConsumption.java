import javax.swing.JOptionPane;
/**
* Brian Goodwin
* This program will calculate total number of customers
* who bought one or more energy drink
* and calculate number of customers who preferred
* citrus flavored energy drink
**/

public class energyDrinkConsumption
{
	public static void main(String[] args)
	{
		final int totalNumCustomers = 12467;
		double moreNumCust;
		double prefCitrusCust;

		moreNumCust = (totalNumCustomers * .14);
		prefCitrusCust = (totalNumCustomers * .64);

		JOptionPane.showMessageDialog(null,"The number of customers who purchased one or more" +
		" energy drink is: " + moreNumCust);

		JOptionPane.showMessageDialog(null,"The number of customers who preferred citrus flavored" +
		" energy drinks is: " + prefCitrusCust);


	}
}

/*----------------------------------------------------------------------------------------------------------------------------------------

Pseudocode

1.0 import JOptionPane;

2.0 initialize total number of customers;

3.0 calculate total num of custs purchased 1 or more drink;

4.0 calculate total num of custs who preferred citrus flavor;

5.0 display total num of custs who purchased 1 or more drink;

6.0 display total num of custs who preferred citrus flavor;

7.0 end

*/