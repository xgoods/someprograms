import java.util.Scanner;
public class BagOfObjects<E>
{
	 LinkedBag<E> beerBag = new LinkedBag<E>();
	
	public void addBeer(E beerToAdd)
	{
		beerBag.add(beerToAdd);
	}
	
	public void removeBeer(E aValue, LinkedBag<E> aBag)
	{
		if(aBag.remove(aValue))
		{
			System.out.println("\n" + aValue + " removed from the bag");
		}
		else
		{
			System.out.println("\n" + aValue + " is not in the bag - removed failed");
		}
		displayBeerBag("Display bag after trying to remove: " + aValue, aBag);
	}
	
	public void beerExists(E aValue, LinkedBag<E> aBag)
	{
		 if(aBag.exists(aValue))
		 {
            System.out.println("\n" + aValue + " is in the bag");
         }
        else
        {    
        	System.out.println("\n" + aValue + " is not in the bag");
		}
	}
	
	public void beerCount(E aValue, LinkedBag<E> aBag)
	{
		 System.out.println("\nnumber of "+aValue+" in bag? " +
            aBag.countOccurrences(aValue));
    }
    
    public void displayBeerBag(String str, LinkedBag<E> aBag)
    {
        System.out.println("\n" + str);

        if (aBag.getSize() == 0)
        {
           System.out.println("\nBag is empty");
        }
        else
        {
            System.out.println(aBag);
           
        }

    }
    
    public void displayBagSize(LinkedBag<E> aBag)
    {
    	 System.out.println("Size: " + aBag.getSize());
    }
}
		
