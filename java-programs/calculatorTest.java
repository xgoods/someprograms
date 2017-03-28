import javax.swing.JOptionPane;
import java.text.DecimalFormat;
public class calculatorTest
{
	public static void main(String[] args)
	{
		double num1;
		double num2;
		String str;
		int answer;
		String repeat;
		double sum;
		double product;
		double difference;
		double quotient;


		do
		{
			str = JOptionPane.showInputDialog("Calculator" +
											  "--------------------------" +
											  "\n 1: Sum" +
											  "\n 2: Product" +
											  "\n 3: Difference" +
											  "\n 4: Quotient" +
											  "\n Choose an option 1-4");
			answer = Integer.parseInt(str);

			while(answer < 0 || answer > 4)
			{
				JOptionPane.showMessageDialog(null,"You've entered an incorrect number.");
				str = JOptionPane.showInputDialog("Calculator " +
												  "\n--------------------------" +
												  "\n 1: Sum" +
												  "\n 2: Product" +
												  "\n 3: Difference" +
												  "\n Quotient" +
											      "\n Choose an option 1-4");
				answer = Integer.parseInt(str);
			}

			str = JOptionPane.showInputDialog("Enter your first number.");
			num1 = Double.parseDouble(str);

			str = JOptionPane.showInputDialog("Enter your second number.");
			num2 = Double.parseDouble(str);

			DecimalFormat rounder = new DecimalFormat("#,###.###");


			if(answer == 1)
			{
				sum = calculator.calculateSum(num1,num2);
				JOptionPane.showMessageDialog(null,"The sum of " + num1 + " and " + num2 + " is " + sum);

			}

			if(answer == 2)
			{
				product = calculator.calculateProduct(num1,num2);
				JOptionPane.showMessageDialog(null,"The product of " + num1 + " and " + num2 + " is " + product);

			}

			if(answer == 3)
			{
				difference = calculator.calculateDifference(num1,num2);
				JOptionPane.showMessageDialog(null,"The difference of " + num1 + " and " + num2 + " is " + difference);

			}

			if(answer == 4)
			{
				quotient = calculator.calculateQuotient(num1,num2);
				JOptionPane.showMessageDialog(null,"The quotient of " + num1 + " and " + num2 + " is " +rounder.format(quotient));

			}

			repeat = JOptionPane.showInputDialog("Would you like to calculator 2 different numbers?");
		}

		while(repeat.equalsIgnoreCase("YES"));

		System.exit(0);
	}
}
