public class calculator
{
	private double num1;
	private double num2;


	public calculator(double num1, double num2)
	{
		this.num1 = num1;
		this.num2 = num2;
	}

	public void setNum1(double num1)
	{
		this.num1 = num1;
	}

	public void setNum2(double num2)
	{
		this.num2 = num2;
	}

	public static double calculateSum(double num1, double num2)
	{
		return (num1 + num2);
	}

	public static double calculateProduct(double num1, double num2)
	{
		return (num1 * num2);
	}

	public static double calculateDifference(double num1, double num2)
	{
		return (num1 - num2);
	}

	public static double calculateQuotient(double num1, double num2)
	{
		return (num1 / num2);
	}
}