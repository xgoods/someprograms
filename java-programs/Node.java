/**
*@author Brian Goodwin
*@version 1.0, Sept. 24, 2014
*@version 2.0 Oct. 8, 2014 - modified to generic class
**/
public class Node<E>
{
	private E data; //holds data
	private Node<E> link; //holds link
	
	/**
	*This constructor sets data to initialData and link to initialLink
	*@param initialData - the initial data
	*@param initialLink - the initial link
	**/
	public Node(E initialData, Node<E> initialLink)
	{
		data = initialData;
		link = initialLink;
	}
	
	/**
	*This method sets data equal to initialData
	*@param initialData - the arg for the initial data
	**/
	public void setData(E initialData)
	{
		data = initialData;
	}
	
	/**
	*This method sets link to initialLink
	*@param initialLink - argument for the initial link
	**/
	public void setLink(Node<E> initialLink)
	{
		link = initialLink;
	}
	
	/**
	*This method returns the data
	*@return - the data
	**/
	public E getData()
	{
		return data;
	}
	
	/**
	*This method returns the link
	*@return - the link
	**/
	public Node<E> getLink()
	{
		return link;
	}
}
