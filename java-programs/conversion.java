import java.util.Scanner;

public class conversion
{
public static void main (String[] args)
{

double miles;
double kilometers;

int months = 2, years = 3, days;


Scanner keyboard = new Scanner(System.in);

System.out.print("Enter the number of miles: ");
miles = keyboard.nextDouble();

kilometers = (miles*1);

System.out.print("The number of miles is: " + miles);
System.out.println("\nThe number of kilometers is: " + kilometers);
}
}
