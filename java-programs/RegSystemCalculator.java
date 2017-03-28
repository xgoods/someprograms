import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import java.text.DecimalFormat;
/**
* @author Brian Goodwin
* @version 1.0 Apr 30. 2014
* The purpose of this program is to create the registration
* system calculator panel
**/

public class RegSystemCalculator extends JFrame
{
	private RegistrationSystem registration; //holds RegistrationSystem object
	private GreetingPanel greeting; //holds GreetingPanel object
	private JButton calcButton; //calculate button
	private JButton exitButton; //exit button
	private JPanel buttonPanel; //button panel

	/**
	* Constructor
	**/

	public RegSystemCalculator()
	{
		super("Registration System Calculator"); //menu bar display

		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //exit on close

		setLayout(new BorderLayout()); //border layout

		registration = new RegistrationSystem(); //creates RegistrationSystem object
		greeting = new GreetingPanel(); //creates GreetingPanel object

		buildButtonPanel(); //call buildButtonPanel method

		add(greeting, BorderLayout.NORTH); //greeting north quad
		add(registration, BorderLayout.CENTER); //registration center quad
		add(buttonPanel, BorderLayout.SOUTH); //button panel south quad

		pack();
		setVisible(true); //makes window visible
	}

	/**
	* @param buildButtonPanel builds button panel
	**/

	private void buildButtonPanel()
	{
		buttonPanel = new JPanel(); //create button panel object

		calcButton = new JButton("Calculate");
		exitButton = new JButton("Exit");

		calcButton.addActionListener(new CalcButtonListener()); //call calculate action listener

		exitButton.addActionListener(new ExitButtonListener()); //call exit action listener

		buttonPanel.add(calcButton); //add calculate button
		buttonPanel.add(exitButton); //add exit button
	}

	private class CalcButtonListener implements ActionListener
	{
		/**
		* @param actionPerformed calculates user total when
		* user clicks calculate button
		**/

		public void actionPerformed(ActionEvent e)
		{
			double total; //holds user total

			total = registration.getTotalCost();

			DecimalFormat rounder = new DecimalFormat("#,###.00"); //create decimal format object

			JOptionPane.showMessageDialog(null,"Total: $" + rounder.format(total));
		}
	}

	private class ExitButtonListener implements ActionListener
	{
		/**
		* @param actionPerformed exits program when user
		* hits exit button
		**/

		public void actionPerformed(ActionEvent e)
		{
			System.exit(0); //exit JOptionPane
		}
	}
}// close class







