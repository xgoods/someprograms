/**
*@author Brian Goodwin
*@version 1.0, Sept. 24, 2014
**/
public class StringNode
{
	private String data; //holds data
	private StringNode link; //holds link
	
	/**
	*This constructor sets data to initialData and link to initialLink
	*@param initialData - the initial data
	*@param initialLink - the initial link
	**/
	public StringNode(String initialData, StringNode initialLink)
	{
		data = initialData;
		link = initialLink;
	}
	
	/**
	*This method sets data equal to initialData
	*@param initialData - the arg for the initial data
	**/
	public void setData(String initialData)
	{
		data = initialData;
	}
	
	/**
	*This method sets link to initialLink
	*@param initialLink - arguement for the initial link
	**/
	public void setLink(StringNode initialLink)
	{
		link = initialLink;
	}
	
	/**
	*This method returns the data
	*@return - the data
	**/
	public String getData()
	{
		return data;
	}
	
	/**
	*This method returns the link
	*@return - the link
	**/
	public StringNode getLink()
	{
		return link;
	}
}
