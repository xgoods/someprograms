/**
*@Brian Goodwin
*@version 1.0 Sept. 17 2014
**/
import java.util.Arrays;
public class StringBag
{
	private String[] data;
	private int numElements;
	
	/**
	* no-arg constructor
	**/
	
	public StringBag()
	{
		data = new String[10];
		numElements = 0;
	}
	
	/**
	*@param initCapacity - holds initial capacity
	**/
	
	public StringBag(int initCapacity)
	{
		numElements = 0;
		data = new String[initCapacity];
	}
	
	/**
	*@param englareArray - enlarges array to new capacity if needed
	**/
	
	private void enlargeArray(int newCapacity)
	{
		String[] largerArray = new String[newCapacity];
		
		if(data.length < newCapacity)
		{
			System.arraycopy(data, 0, largerArray, 0, numElements);
			data = largerArray;
		}
	}
	
	/**
	*@return data.length - returns capactiy of array
	**/
	
	public int getCapacity()
	{
		return data.length;
	}
	
	/**
	*@return numElements - returns size of the array
	**/
	
	public int getSize()
	{
		return numElements;
	}
	
	/**
	*@param add - adds elements to array
	**/
	
	public void add(String newElement)
	{
		if(numElements == data.length)
		{
			enlargeArray(numElements * 2 + 1);
		}
		
		data[numElements] = newElement;
		numElements++;
	}
	/**
	*@param remove - removes elements of the array
	*@return true - if elements was removed successfully
	*@return false- if elements was not removed successfully
	**/
	
	public boolean remove(String target)
	{
		int i = 0;
		
		while(i < numElements && !target.equalsIgnoreCase(data[i]))
		{
			i++;
		}
		
		if(i == numElements)
		{
			return false;
		}
		
		else
		{
			numElements--;
			data[i] = data[numElements];
			return true;
		}
	}
	
	/**
	*@param exists - checks to see if element in an array exists
	*@return true - if element exists
	*@return false - if element does not exist
	**/
	
	public boolean exists(String target)
	{
		for(int i = 0; i < numElements; i++)
		{
			if(target.equalsIgnoreCase(data[i]))
			{
				return true;
			}
		}
		
		return false;
	}
	
	/**
	*@param countOccurrences - checks the amount of times a certain element is in array
	*@return feedBack - number of certain elements in array
	**/
	public int countOccurrences(String target)
	{
		int feedBack = 0;
		
		for(int i = 0; i < numElements; i++)
		{
			if(target.equalsIgnoreCase(data[i]))
			{
				feedBack++;
			}
		}
		
		return feedBack;
	}
	/**
	*@param toString - method of returning string elements in array
	*@return str - returns string elements in array
	**/
	public String toString()
	{
		
		String str;
		str = "";
		String alphabet;
        
        for (int j = 0;  j < numElements - 1; j++ )
        {
  	       if (data [ j ].compareToIgnoreCase( data [ j+1 ] ) > 0 )
           {                                             
              alphabet = data [ j ];
              data [ j ] = data [ j+1];
              data [ j+1] = alphabet;
         	}
           
       }
		
		for(int i =0; i < numElements; i++)
		{
			if(data[i] != null)
			{
				str += data[i] + "\n";
			}
		}
		
		return str;
	} 
}
	
	
