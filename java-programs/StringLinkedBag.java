/**
*@Brian Goodwin
*@version 1.1 Sept. 24, 2014
**/
public class StringLinkedBag
{
	private StringNode head; //holds head of nodes
	private int numElements; //holds number of elements
	
	/**
	*no- args constructor - sets head to null and num elements to 0
	**/
	public StringLinkedBag()
	{
		head = null;
		numElements = 0;
	}
	
	/**
	*This method adds a new node to the linked list
	*@param element - the arg for element entered
	**/
	public void add(String element)
	{
		head = new StringNode(element,head);
		numElements++;
	}
	
	/**
 	*This method tests to see if a certain element in the linked list exists
 	*@param target - the arg for the element that is being looked for
 	*@return found - returns boolean found either true or false
 	**/
 	public boolean exists(String target)
	{
		boolean found = false;
		StringNode cursor = head;
		
		while(cursor != null && !found)
		{
			if(cursor.getData().equalsIgnoreCase(target))
			{
				found = true;
			}
			
			else
			{
				cursor = cursor.getLink();
			}
		}
			
		return found;
	}
	
	/**
	*This method returns the string represtentation of the object
	*@return stringToReturn - returns data as string
	**/
	public String toString()
	{
		String stringToReturn = "";
		StringNode cursor;
		
		if(numElements == 0)
		{
			stringToReturn = "empty";
		}
		
		else
		{
			for(cursor = head; cursor != null; cursor = cursor.getLink())
			{
				stringToReturn += cursor.getData();
				if(cursor.getLink() != null)
				{
					stringToReturn += ", ";
				}
			}
		}
		return stringToReturn;
	}
	
	/**
	*This method gets the size of the linked list
	*@return - number of elements
	**/
	public int getSize()
	{
		return numElements;
	}
	
	/**
	*This method removes a certain piece of data if it is found
	*@param target - the arg for the data being removed
	*@return true or false - returns true or false if data is removed or not removed
	**/
	public boolean remove(String target)
	{
		StringNode targetNode = null;
		StringNode cursor;
		
		for(cursor = head; cursor != null; cursor = cursor.getLink())
		{
			if(target.equalsIgnoreCase(cursor.getData()))
			{
				targetNode = cursor;
			}
		}
		
		if(targetNode == null)
		{
			return false;
		}
		else
		{
			targetNode.setData(head.getData());
			head = head.getLink();
			numElements--;
			return true;
		}
	
	}
	
	/**
	*This method counts the number of times a certain element appears in the list
	*@param target - the arg for the piece of data being counted
	*@return numOccur - the number of occurences
	**/
	public int countOccurences(String target)
	{
		int numOccur = 0;
		StringNode cursor;
		
		for(cursor = head; cursor != null; cursor = cursor.getLink())
		{
			if(cursor.getData().equalsIgnoreCase(target))
			{
				numOccur++;
			}
		}
		
		return numOccur;
	}
}	
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
