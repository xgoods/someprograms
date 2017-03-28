/**
*@author Brian Goodwin
*@version 1.0
**/
import java.util.Random;
public class Coin
{
	private String sideUp; //holds side up
	private int ranNum; //holds random number
	private int totalHeads; //holds total heads
	private int totalTails; //holds total tails
	
	/**
	* No - arg Constructor
	**/
	
	public Coin()
	{
		Math.random() * 100;
		if((int) Math.random * 100 % 2 == 0)
		{
			sideUp = "Heads";
		}
		
		else
		{
			sideUp = "Tails";
		}
		
	}
	/**
	*@param sideup decides whether coin is side up or down
	*@param totalHeads adds 1 to total of heads
	*@param totalTails adds 1 to total of tails
	**/
	
	public void Toss()
	{
		Math.random()*10;
		if((int) Math.random() * 100 % 2 == 0)
		{
			sideUp = "Heads";
			totalHeads++;
		}
		
		else
		{
			sideUp = "Tails";
			totalTails++;
		}
		
	}
	
	/**
	*@return side up
	**/
	
	public String getSideUp()
	{
		return sideUp;
	}
	
	/**
	*@return totalHeads
	**/
	public int getTotalHeads()
	{
		return totalHeads;
	}
	
	/**
	*@return totalTails
	**/
	
	public int getTotalTails()
	{
		return totalTails;
	}
	
}
