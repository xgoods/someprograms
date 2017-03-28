/**
*@author Brian Goodwin
*@version 1.0 Oct 15, 2014
**/
public class Stack<E>
{
	private Node<E> top;
	private int numItems;
	
	/**
	*No - arg constructor
	*sets top to null and numItems to 0
	**/
	public Stack()
	{
		top = null;
		numItems = 0;
	}
	
	/**
	*This method pushes elements into the stack
	*@param element - the arg for element entered
	**/
	public void push(E element)
	{
		top = new Node<E>(element, top);
		numItems++;
	}
	
	/**
	*This method pops the items from the stack LIFO
	*@return returnValue - returns the popped value from the stack
	**/
	public E pop()
	{
		E returnValue;
		
		if(top == null)
		{
			returnValue = null;
		}
		
		else
		{
			returnValue = top.getData();
			top = top.getLink();
			numItems--;
		}
		
		return returnValue;
	}
	
	/**
	*This method returns the size of the stack
	*@return numItems - the number of items in the stack
	**/
	public int size()
	{
		return numItems;
	}
} 	
