/**
*@author Brian Goodwin
*@version 1.0
**/
public class CoinTest
{
	public static void main(String[] args)
	{
		String sideUp; // holds side up
		Coin subCoin = new Coin(); // creates coin object
		
		System.out.println("Initially, the coin is " + subCoin.getSideUp()); //initial coin side
		
		for(int index = 0; index < 20; index++) //loop calls toss method & prints results
		{
			subCoin.Toss();//calls toss method
			
			System.out.println("\nFlip " + (index + 1)  + ": " + subCoin.getSideUp());
			System.out.println("Total Heads: " + subCoin.getTotalHeads());
			System.out.println("Total Tails: " + subCoin.getTotalTails());
		}
		
		
	}
}
		
				
