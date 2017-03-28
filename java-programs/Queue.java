/**
*@author Brian Goodwin
*@version 1.0 Oct. 26, 2014
**/
public class Queue<E>
{
	private Node<E> front; //holds front element of queue
	private Node<E> rear; //holds rear element of queue
	private int numItems; //holds number of items in queue
	
	public Queue()
	{
		front = null;
		rear = null;
		numItems = 0;
	}
	
	/**
	*This method add an element to the queue
	*@param element - the element being added
	**/
	public void add(E element)
	{
		if(rear == null)
		{
			front = new Node<E>(element,null);
			rear = front;
		}
		
		else
		{
			rear.setLink(new Node<E>(element,null));
			rear = rear.getLink();
		}
		
		numItems++;
	}
	
	/**
	*This method removes an element from the queue
	*@return element - the element being in removed
	**/
	public E remove()
	{
		E element; //holds element of any type being removed
		
		if(front == null)
		{
			element = null;
		}
		
		else
		{
			element = front.getData();
			if(front != rear)
			{
				front = front.getLink();
			}
			
			else
			{
				front = null;
				rear = null;
			}
		
			numItems--;
		}
		
		return element;
	}
	/**
	*This method returns the size of the queue
	*@return numItems - the number of items in the queue
	**/
	public int size()
	{
		return numItems;
	}
}		
