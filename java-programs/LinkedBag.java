/**
*@Brian Goodwin
*@version 1.1 Sept. 24, 2014
*@version 2.0 Oct. 8, 2014 - modified to generic class
**/
public class LinkedBag<E>
{
	private Node<E> head; //holds head of nodes
	private int numElements; //holds number of elements
	
	/**
	*no- args constructor - sets head to null and num elements to 0
	**/
	public LinkedBag()
	{
		head = null;
		numElements = 0;
	}
	
	/**
	*This method adds a new node to the linked list
	*@param element - the arg for element entered
	**/
	public void add(E element)
	{
		head = new Node<E>(element,head);
		numElements++;
	}
	
	/**
 	*This method tests to see if a certain element in the linked list exists
 	*@param target - the arg for the element that is being looked for
 	*@return found - returns boolean found either true or false
 	**/
 	public boolean exists(E target)
	{
		boolean found = false;
		Node<E> cursor = head;
		
		while(cursor != null && !found)
		{
			if(cursor.getData().equals(target))
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
	*This method returns the string representation of the object
	*@return stringToReturn - returns data as string
	**/
	public String toString()
	{
		String stringToReturn = "";
		Node<E> cursor;
		
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
	public boolean remove(E target)
	{
		Node<E> targetNode = null;
		Node<E> cursor;
		
		for(cursor = head; cursor != null; cursor = cursor.getLink())
		{
			if(target.equals(cursor.getData()))
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
	*@return numOccur - the number of occurrences
	**/
	public int countOccurrences(E target)
	{
		int numOccur = 0;
		Node<E> cursor;
		
		for(cursor = head; cursor != null; cursor = cursor.getLink())
		{
			if(cursor.getData().equals(target))
			{
				numOccur++;
			}
		}
		
		return numOccur;
	}
}	
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
