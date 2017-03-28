/**
*@author Brian Goodwin
*@version 1.0.0 Nov. 18, 2014
*@version 1.1.0 Dec. 1, 2014 - added methods: getLeftmostData, getRightmostData
*removeLeftmostData, removeRightmostData
**/
public class BTNode<E>
{
	private E data;
	private BTNode<E> left;
	private BTNode<E> right;
	
	/**
	*This constructor accepts args for data, left, and right
	*@param newData - accepts args for data
	*@param newLeft - accepts args for left link
	*@param newRight - accepts args for right link
	**/
	public BTNode(E newData, BTNode<E> newLeft, BTNode<E> newRight)
	{
		data = newData;
		left = newLeft;
		right = newRight;
	}
	
	/**
	*This method accepts args for data
	*@param newData - accepts args for data
	**/
	public void setData(E newData)
	{
		data = newData;
	}
	
	/**
	*This method accepts args for left link
	*@param newLeft - accepts args for left link
	**/
	public void setLeft(BTNode<E> newLeft)
	{
		left = newLeft;
	}
	
	/**
	*This method accepts args for right link
	*@param newRight - accepts args for right link
	**/
	public void setRight(BTNode<E> newRight)
	{
		right = newRight;
	}
	
	/**
	*This method returns data of type E
	*@return data - the data in the tree
	**/
	public E getData()
	{
		return data;
	}
	
	/**
	*This method return the left link
	*@return left - the left link
	**/
	public BTNode<E> getLeft()
	{
		return left;
	}
	
	/**
	*This method returns the right link
	*@return right - the right link
	**/
	public BTNode<E> getRight()
	{
		return right;
	}
	
	/**
	*This method prints the data in the tree
	**/
	public void inorderPrint()
	{
		if(left != null)
		{
			left.inorderPrint();
		}
		
		System.out.println(data);
		
		if(right != null)
		{
			right.inorderPrint();
		}
	}
	
	/**
	*This method gets the leftmost data
	*@return left.getLeftmostData() - recursive
	**/
	public E getLeftmostData()
	{
		if(left == null)
		{
			return data;
		}
		else
		{
			return left.getLeftmostData();
		}
	}
	
	/**
	*This method gets the rightmost data
	*@return right.getRightmostData() - recursive
	**/
	public E getRightmostData()
	{
		if(right == null)
		{
			return data;
		}
		else
		{
			return right.getRightmostData();
		}
	}
	
	/**
	*This method removes the leftmost data
	*@return this - recursive - left.removeLeftmostData()
	**/
	public BTNode<E> removeLeftmostData()
	{
		if(left == null)
		{
			return right;
		}
		else
		{
			left = left.removeLeftmostData();
			return this;
		}
	}
	
	/**
	*This method removes the rightmost data
	*@return this - recursive - right.removeRightmostData()
	**/
	public BTNode<E> removeRightmostData()
	{
		if(right == null)
		{
			return left;
		}
		else
		{
			right = right.removeRightmostData();
			return this;
		}
	}
}
		
		 
