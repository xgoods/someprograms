/**
* @author Brian Goodwin
* @version 1.0 Apr. 8, 2014
* This class represents an essay rubric
**/
public class Essay extends GradedActivity
{
	private double grammar; //holds grammar points
	private double spelling; //holds spelling points
	private double correctLength; //holds correct length points
	private double content; //holds content points
	private double numericScore; //holds numeric score

	/**
	* Constructor
	* @param grammar accepts args for grammar points
	* @param spelling accepts arg for spelling points
	* @param correctLength accepts args for correct length points
	* @param content accepts args for content points
	* @param numericScore equals sum of point values
	* @param setScore(numericScore) sets score in superclass
	**/
	public Essay(double grammar, double spelling, double correctLength, double content, double numericScore)
	{
		this.grammar = grammar;
		this.spelling = spelling;
		this.correctLength = correctLength;
		this.content = content;
		numericScore = (grammar + spelling + correctLength + content);

		setScore(numericScore);
	}

	/**
	* @param setGrammar accepts args for grammar points
	**/

	public void setGrammar(double grammar)
	{
		this.grammar = grammar;
	}

	/**
	* @param setSpelling accepts args for spelling points
	**/

	public void setSpelling(double spelling)
	{
		this.spelling = spelling;
	}

	/**
	* @param setCorrectLength accepts args for correct length points
	**/

	public void setCorrectLength(double correctLength)
	{
		this.correctLength = correctLength;
	}

	/**
	* @param setContent accepts args for content points
	**/
	public void setContent(double content)
	{
		this.content = content;
	}

	/**
	* @return grammar points
	**/

	public double getGrammar()
	{
		return grammar;
	}

	/**
	* @return spelling points
	**/

	public double getSpelling()
	{
		return spelling;
	}

	/**
	* @return correct length points
	**/

	public double getCorrectLength()
	{
		return correctLength;
	}

	/**
	* @return content points
	**/

	public double getContent()
	{
		return content;
	}
}



