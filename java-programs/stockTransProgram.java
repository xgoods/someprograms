import javax.swing.JOptionPane;
import java.text.DecimalFormat;
/**
* Brian Goodwin
* This program will take stock information and
* calculate the profit made
**/

public class stockTransProgram
{
	public static void main(String[] args)// main method
	{

		final int numStockPurch = 1000;
		final double amountPerShare = 32.87;
		final double paidStockCommiss = .02;
		final int numStockSold = 1000;
		final double amountSoldPerShare = 33.92;

		double totalStockPaid = (numStockPurch * amountPerShare);
		double brokerCommiss = (totalStockPaid * paidStockCommiss);
		double totalStockSold = (numStockSold * amountSoldPerShare);
		double brokerCommissSold = (totalStockSold * paidStockCommiss);
		double profitMade = (totalStockSold - totalStockPaid - (brokerCommiss + brokerCommissSold));

		DecimalFormat round = new DecimalFormat("#0.00");// rounds number to nearest hundreth

		JOptionPane.showMessageDialog(null,"The amount of profit Joe made is: $" + round.format(profitMade));

	}
}

/*----------------------------------------------------------------------------------------------------------------------------------------

Pseudocode

1.0 import JOptionPane;

2.0 import decimal formatter;

3.0 initialize number of shares purchsed;

4.0 initialize price per stock bought;

5.0 initialize brokers commission rate;

6.0 initialize number of shares sold;

7.0 initialize price per stock sold;

8.0 calculate total price paid for stocks;

9.0 calculate brokers commission for bought stocks;

10.0 calculate total price from stocks sold;

11.0 calculate brokers commission for stocks sold;

12.0 calculate profit made;

13.0 format total profit to round to nearest hundreth;

14.0 display profit made;

15.0 end

*/


