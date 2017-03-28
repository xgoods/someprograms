import javax.swing.*;
/**
* @author Brian Goodwin
* @version 1.0 Apr. 30 2014
* The purpose of this program is to create a greeting label
* for the registration panel
**/

public class GreetingPanel extends JPanel
{
	public GreetingPanel()
	{
		JLabel greeting = new JLabel("Welcome to the Registration System"); //creates greeting

		add(greeting);
	}
}
