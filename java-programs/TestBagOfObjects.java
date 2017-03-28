/**
*@author Brian Goodwin
*@version 1.0, Oct. 22, 2014
**/
import javax.swing.JOptionPane;
public class TestBagOfObjects
{
	public static void main(String[] args)
	{
		String userOptionChoice; //hold user menu choice
		LinkedBag<Beer> beerBag = new LinkedBag<Beer>(); //creates linked list
		String userBrand = null; //holds beer brand
		String userType = null; //holds beer type
		double userPrice = 0.0; //holds beer price
		String str; //string for JOptionPane
		
		do
		{
				//menu
			userOptionChoice = JOptionPane.showInputDialog("Bag O' Beer" +
																					   "\n-------------------------------" +
																	 				   "\nA - add 'beer' to bag" +
																					   "\nR - remove 'beer' from bag" +
																					   "\nF - find 'beer' in bag" +
																					   "\nC - count 'beer' in bag" +
																					   "\nD - display all 'beer' in bag" +
																					   "\nS - display size of bag" +
																					   "\nX - exit the bag" +
																					   "\nEnter your option:");
		
				//add option
			if(userOptionChoice.equalsIgnoreCase("A"))
			{
				userBrand = JOptionPane.showInputDialog("Enter the beer brand:");
				while(userBrand.equals(""))
				{
					JOptionPane.showMessageDialog(null,"This field cannot be blank.");
					userBrand = JOptionPane.showInputDialog("Enter the beer brand:");
				}
					
				userType = JOptionPane.showInputDialog("Enter the beer type:");
				while(userType.equals(""))
				{
					JOptionPane.showMessageDialog(null,"This field cannot be blank.");
					userType = JOptionPane.showInputDialog("Enter the beer type:");
				}
				str = JOptionPane.showInputDialog("Enter the price:");
				userPrice = Double.parseDouble(str);
				while(userPrice < 0)
				{
					JOptionPane.showMessageDialog(null,"This field cannot be negative.");
					str = JOptionPane.showInputDialog("Enter the price:");
					userPrice = Double.parseDouble(str);
				}
				
				Beer beerToAdd = new Beer(userBrand, userType, userPrice);
				beerBag.add(beerToAdd);
				
				JOptionPane.showMessageDialog(null,beerToAdd + " added to bag");
				
			}
			
				//remove option
			else if(userOptionChoice.equalsIgnoreCase("R"))
			{
				userBrand = JOptionPane.showInputDialog("Enter the beer brand:");
				while(userBrand.equals(""))
				{
					JOptionPane.showMessageDialog(null,"This field cannot be blank.");
					userBrand = JOptionPane.showInputDialog("Enter the beer brand:");
				}
					
				userType = JOptionPane.showInputDialog("Enter the beer type:");
				while(userType.equals(""))
				{
					JOptionPane.showMessageDialog(null,"This field cannot be blank.");
					userType = JOptionPane.showInputDialog("Enter the beer type:");
				}
				str = JOptionPane.showInputDialog("Enter the price:");
				userPrice = Double.parseDouble(str);
				while(userPrice < 0)
				{
					JOptionPane.showMessageDialog(null,"This field cannot be negative.");
					str = JOptionPane.showInputDialog("Enter the price:");
					userPrice = Double.parseDouble(str);
				}
				
				Beer beerToRemove = new Beer(userBrand, userType, userPrice);
				removeBeer(beerToRemove, beerBag);
			}
			
				//find option
			else if(userOptionChoice.equalsIgnoreCase("F"))
			{
				userBrand = JOptionPane.showInputDialog("Enter the beer brand:");
				while(userBrand.equals(""))
				{
					JOptionPane.showMessageDialog(null,"This field cannot be blank.");
					userBrand = JOptionPane.showInputDialog("Enter the beer brand:");
				}
					
				userType = JOptionPane.showInputDialog("Enter the beer type:");
				while(userType.equals(""))
				{
					JOptionPane.showMessageDialog(null,"This field cannot be blank.");
					userType = JOptionPane.showInputDialog("Enter the beer type:");
				}
				str = JOptionPane.showInputDialog("Enter the price:");
				userPrice = Double.parseDouble(str);
				while(userPrice < 0)
				{
					JOptionPane.showMessageDialog(null,"This field cannot be negative.");
					str = JOptionPane.showInputDialog("Enter the price:");
					userPrice = Double.parseDouble(str);
				} 
				
				Beer beerToFind = new Beer(userBrand, userType, userPrice);
				displayBeerExists(beerToFind, beerBag);
			}
			
				//count option
			else if(userOptionChoice.equalsIgnoreCase("C"))
			{
				userBrand = JOptionPane.showInputDialog("Enter the beer brand:");
				while(userBrand.equals(""))
				{
					JOptionPane.showMessageDialog(null,"This field cannot be blank.");
					userBrand = JOptionPane.showInputDialog("Enter the beer brand:");
				}
					
				userType = JOptionPane.showInputDialog("Enter the beer type:");
				while(userType.equals(""))
				{
					JOptionPane.showMessageDialog(null,"This field cannot be blank.");
					userType = JOptionPane.showInputDialog("Enter the beer type:");
				}
				str = JOptionPane.showInputDialog("Enter the price:");
				userPrice = Double.parseDouble(str);
				while(userPrice < 0)
				{
					JOptionPane.showMessageDialog(null,"This field cannot be negative.");
					str = JOptionPane.showInputDialog("Enter the price:");
					userPrice = Double.parseDouble(str);
				}
				
				Beer beerToCount = new Beer(userBrand, userType, userPrice);
				displayBeerCount(beerToCount, beerBag);
			} 
				
				//display option
			else if(userOptionChoice.equalsIgnoreCase("D"))
			{
				displayBag(beerBag);
			}
			
				//size option
			else if(userOptionChoice.equalsIgnoreCase("S"))
			{
				JOptionPane.showMessageDialog(null,"Size of beer bag: " + beerBag.getSize());
			}
			
				//exits option
			else if(userOptionChoice.equalsIgnoreCase("X"))
			{
				JOptionPane.showMessageDialog(null,"Goodbye");
			}
			
			else
			{
				JOptionPane.showMessageDialog(null,"You've entered an incorrect option");
			}
		}while(!(userOptionChoice.equalsIgnoreCase("X")));
		
		System.exit(0);
	}
	
	/**
	*This method makes a call to the remove method in order to try and 
	*remove a beer from the beer bag
	*@param theBeer - the beer being removed
	*@param theBag - the linked bag of beer
	**/
	public static void removeBeer(Beer theBeer, LinkedBag<Beer> theBag)
    {
       
        if(theBag.remove(theBeer))
        {
            JOptionPane.showMessageDialog(null,theBeer +" removed from bag");
        }
        else
        { 
            JOptionPane.showMessageDialog(null,theBeer + " is not in the bag - remove failed");
		}
	}
	
	/**
	*This method makes a call to the exists method to try and see if a certain
	*beer exists in the bag
	*@param theBeer - the beer being searched for
	*@param theBag - the linked bag of beer
	**/
	public static void displayBeerExists(Beer theBeer, LinkedBag<Beer> theBag)
    {
        if(theBag.exists(theBeer))
        {
            JOptionPane.showMessageDialog(null,theBeer + " is in the bag");
        }
        else
        {
            JOptionPane.showMessageDialog(null,theBeer + " is not in the bag");
 		}   
    }
	
	/**
	*This method makes a call to the countOccurrences method in order to find out
	*how many times a certain beer appears in the bag
	*@param theBeer - the beer being counted
	*@param theBag - the linked bag of beer
	**/
	public static void displayBeerCount(Beer theBeer, LinkedBag<Beer> theBag)
    {
        JOptionPane.showMessageDialog(null,theBeer+" Count: " +
            theBag.countOccurrences(theBeer));
    }
	
	/**
	*This method displays the contents of the linked bag
	*@param theBag - the linked bag of beer
	**/
	public static void displayBag(LinkedBag<Beer> theBag)
	{
		if(theBag.getSize() == 0)
		{
            JOptionPane.showMessageDialog(null,"Bag is empty");
        }
        else
        {
            JOptionPane.showMessageDialog(null,theBag);
        }
     } 
}

