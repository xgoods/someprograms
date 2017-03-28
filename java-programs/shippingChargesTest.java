/**
* @author Brian Goodwin
* @version 1.0, Feb. 25, 2014
**/

import javax.swing.JOptionPane;
import java.text.DecimalFormat;
public class shippingChargesTest
{
	public static void main(String[] args)
	{
		double milesShipped; // miles shipped
		double weightPackageLbs; // weight of package in Lbs.
		String str; // used for JOptionPane

		str = JOptionPane.showInputDialog("What is the weight of your package in Lbs.?");
		weightPackageLbs = Double.parseDouble(str);

		while(weightPackageLbs <= 0)// ensures user cannot enter num <= 0 for package weight
		{
			JOptionPane.showMessageDialog(null,"The weight of your package cannot be less than " +
										  "or equal to 0.");

			str = JOptionPane.showInputDialog("What is the weight of your package in Lbs.?");
			weightPackageLbs = Double.parseDouble(str);
		}

		str = JOptionPane.showInputDialog("How many miles will you be shipping the package?");
		milesShipped = Double.parseDouble(str);

		while(milesShipped <= 0)// ensures user cannot enter num <= 0 for miles shipped
		{
			JOptionPane.showMessageDialog(null,"You cannot ship an item less than or equal to 0 miles.");

			str = JOptionPane.showInputDialog("How many miles will you be shipping the package?");
			milesShipped = Double.parseDouble(str);
		}

		shippingCharges Shipment = new shippingCharges(milesShipped,weightPackageLbs); // creates shipment object
		DecimalFormat rounder = new DecimalFormat("#,###.00"); // rounds package weight & total shipping charges

		Shipment.calculateWeightPackageKgs();
		Shipment.calculateTotalShippingCharges();

		JOptionPane.showMessageDialog(null,"The weight of your package in Kgs is " +
									 rounder.format(Shipment.getWeightPackageKgs()));

		JOptionPane.showMessageDialog(null,"Your total shipping charges are $" +
									 rounder.format(Shipment.getTotalShippingCharges()));
		System.exit(0);
	}
}

/*------------------------------------------------------------------------------------------------------------------------------------
------

1.0 import JOptionPane;

2.0 Import Decimal Formatter;

3.0 declare miles shipped;

4.0 declare package weight in Lbs;

5.0 user input weight of package;

6.0 loop to ensure user enters num > 0 for weight of package;

6.1 print message user entered incorrect number;

6.2 re enter weight of package if needed;

7.0 user input miles shipped;

8.0 loop to ensure user enters num > 0 for miles shipped;

8.1 print message user entered incorrect number;

8.2 re enter miles shipped if needed;

9.0 create object called shipment;

10.0 create decimal format object;

11.0 convert package weight to Kg using shipment object;

11.1 package weight Lbs * .453592;

12.0 calculate total shipping charges using shipment object;

12.1 if package weight in Kgs <= 2 && miles shipped <=500
	 total shipping charges = $1.10;

12.2 while package weight in Kgs <= 2 && mile shipped > 500
	 total shipping charges = $1.10 per 500 miles;

12.3 if package weight in Kgs > 2 && package weight in Kgs <= 6 &&
	 miles shipped <= 500 total shipping charges = $2.20;

12.4 while package weight in Kgs > 2 && package weight in Kgs <= 6 &&
     miles shipped > 500 total shipping charges = $2.20 per 500 miles;

12.5 if package weight in Kgs > 6 && package weight in Kgs <= 10 &&
	 miles shipped <= 500 total shipping charges = $3.70;

12.6 while package weight in Kgs > 6 && package weight in Kgs <= 10 &&
	 miles shipped > 500 total shipping charges = $3.70 per 500 miles;

12.7 if package weight in Kgs > 10 && miles shipped <= 500
	 total shipping charges = $4.80;

12.8 while package weight in Kgs > 10 && miles shipped > 500
	 total shipping charges = $4.80 per 500 miles;

13.0 print total weight of package in Kgs using getter;

13.1 rounder total weight of package in Kgs to 2 decimal places using decimal formatter;

14.0 print total shipping charges using getter;

14.1 round total shipping charges to 2 decimal places using decimal formatter;

15.0 end

*/

