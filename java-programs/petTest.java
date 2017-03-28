import javax.swing.JOptionPane;
/**
*@author Brian Goodwin
*@version 1.0
**/
public class petTest
{
	public static void main(String[] args) // main method
	{
		String str;// JOptionPane string
		String name; // pet name
		String type; // pet type
		double age; // pet age

		pet petName = new pet(); // pet name object
		pet petType = new pet(); // pet type object
		pet petAge = new pet(); // pet age object

		type = JOptionPane.showInputDialog("What type of pet do you have?");
		petType.setPetType(type);

		name = JOptionPane.showInputDialog("What is the name of your " + type + "?");
		petName.setPetName(name);

		str = JOptionPane.showInputDialog("How old is your " + type + "?");
		age = Double.parseDouble(str);
		petAge.setPetAge(age);

		JOptionPane.showMessageDialog(null,"You have a " + petType.getPetType()  + " named " + petName.getPetName() + " that is " +
		petAge.getPetAge() + " years old!");

		System.exit(0);
	}
}

/*------------------------------------------------------------------------------------

Pseudocode

1.0 import JOptionPane;

2.0 declare string for JOptionPane;

3.0 declare name;

4.0 declare type;

5.0 declare age;

6.0 create object pet name;

7.0 create object pet type;

8.0 create object pet age;

9.0 user enter pet type;

9.1 store pet type in setter;

10.0 user enter pet name;

10.1 store pet name in setter;

11.0 user enter pet age;

11.1 store pet age in setter;

12.0 display entered user info using getters;

12.1 display pet type using getter;

12.2 display pet name using getter;

12.3 display pet age using getter;

13.0 end;

*/





