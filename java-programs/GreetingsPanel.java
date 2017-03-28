import javax.swing.*;
/**
* @author Brian Goodwin
* @version 1.0 Apr. 15, 2014
* The purpose of this program is to apply a greetings panel
**/
public class GreetingsPanel extends JPanel
{
	/**
	* constructor
	**/

	public GreetingsPanel()
	{
		JLabel greeting = new JLabel("Welcome to Joe's Garage!");

		add(greeting); //add greeting label
	}
}