/**
* @author Brian Goodwin
* @version 1.0, Apr. 8,2014
* This class holds the test score and
* returns the letter grade according to that
* test score
**/
public class GradedActivity
{
	private double score; //holds test score

	/**
	* @param setScore accepts args for
	* the test score
	**/

	public void setScore(double score)
	{
		this.score = score;
	}

	/**
	* @return the test score
	**/

	public double getScore()
	{
		return score;
	}

	/**
	* @return the letter grade
	**/

	public char getGrade()
	{
		char letterGrade;

		if(score >= 90)
		{
			letterGrade = 'A';
		}
		else if(score >= 80)
		{
			letterGrade = 'B';
		}
		else if(score >= 70)
		{
			letterGrade = 'C';
		}
		else if(score >= 60)
		{
			letterGrade = 'D';
		}
		else
		{
			letterGrade = 'F';
		}

		return letterGrade;
	}
}