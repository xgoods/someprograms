/**
*@author Brian Goodwin
*@version 1.0.0 Nov. 18, 2014
*@version 1.1.0 Dec. 1, 2014 - added remove method
**/
public class Tree<E extends Comparable<E>>
{
	private BTNode<E> root;
	private int manyNodes;
		
	/**
	*This no arg constructor sets root to null and manyNodes to 0
	**/
	public Tree()
	{
		root = null;
		manyNodes = 0;
	}
		
	/**
	*This method adds a new piece of data to the tree
	*@param element - the new piece of data being added
	**/
	public void add(E element)
	{
		if(root == null)
		{
			root = new BTNode<E>(element, null, null);
		}
		else
		{
			BTNode<E> cursor = root;
			boolean done = false;
			
			while(!done)
			{
				if(element.compareTo(cursor.getData()) < 0)
				{
					if(cursor.getLeft() == null)
					{
						cursor.setLeft(new BTNode<E> (element, null, null));
						done = true;
					}
					else
					{
						cursor = cursor.getLeft();
					}
				}
				else
				{
					if(cursor.getRight() == null)
					{
						cursor.setRight(new BTNode<E> (element, null, null));
						done = true;
					}
					else
					{
						cursor = cursor.getRight();
					}
				}				
			}
		}
		manyNodes++;
	}
	
	/**
	*This method returns the size of the tree
	*@return manyNodes - the number of nodes in the tree
	**/
	public int size()
	{
		return manyNodes;
	}
	
	/**
	*This method returns the root of the tree
	*@return root - the root of the tree
	**/
	public BTNode<E> getRoot()
	{
		return root;
	}
	
	/**
	*This method removes a node from the tree
	*@param element - the node to be removed
	*@return true or false - returns true or false depending on successful removal
	**/
	public boolean remove(E element)
	{
		BTNode<E> cursor = root;
		BTNode<E> parentOfCursor = root;
		boolean isLeftChild = true;
		
		/*
		Tests empty tree
		*/
		if(cursor == null)
		{
			return false;
		}
		
		/*
		Moves cursor through tree until it lands on the element being removed
		Removal condition 1
		*/
		while(!cursor.getData().equals(element))
		{
			parentOfCursor = cursor;
			
			//go to left subtree
			if(element.compareTo(cursor.getData()) < 0)
			{
				isLeftChild = true;
				cursor = cursor.getLeft();
			}
			//go to right subtree
			else
			{
				isLeftChild = false;
				cursor = cursor.getRight();
			}
			//not found
			if(cursor == null)
			{
				return false;
			}
			System.out.println("Test1");
		}
		
		/*
		Tests to see if cursor is at root with no left child
		Also tests to see if cursor is not at root and theres no left child
		Removal condition 2 & 3
		*/
		if(cursor.getLeft() == null)
		{
			//promote right child to root
			if(cursor == root)
			{
				root = cursor.getRight();
				System.out.println("test2");
			}
			//set parent link to right of cursor
			else if(isLeftChild)
			{
				parentOfCursor.setLeft(cursor.getRight());
				System.out.println("test3");
			}
			//set parent link to left of cursor
			else
			{
				parentOfCursor.setRight(cursor.getLeft());
				
			}
			
			
		}
		
		/*
		Tests to see if cursor is not null and has a left child
		Removal condition 4
		*/
		else
		{
			/*
			Find rightmost child and bring that data to cursors data
			Remove rightmost child on the left subtree
			*/	
			if(cursor == root)
			{
				cursor.setData(cursor.getLeft().getRightmostData());
				cursor.setLeft(cursor.getLeft().removeRightmostData());
				System.out.println("test4");
			}
		}
		manyNodes--;
		return true;
	}
}
		
		
