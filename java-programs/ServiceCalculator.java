import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import java.text.DecimalFormat;
/**
* @author Brian Goodwin
* @version 1.0 Apr.15, 2014
* the purpose of this program is to create layout for service panel
**/

public class ServiceCalculator extends JFrame
{
	private final double TAX_RATE = .07; //holds and initializes tax rate

	private ServicePanel service; //holds service panel object
	private GreetingsPanel greeting; //holds greetings panel object

	private JButton calcButton; // holds calculate button Jbutton
	private JButton exitButton; //holds exit button Jbutton
	private JPanel buttonPanel; //holds button panel Jpanel

	/**
	* constructor
	**/

	public ServiceCalculator()
	{
		super("Repair Calculator"); //dialog box header

		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		setLayout(new BorderLayout()); //creates border layout

		service = new ServicePanel(); //create service panel object
		greeting = new GreetingsPanel(); //create greeting panel object

		buildButtonPanel(); //build button panel

		add(greeting, BorderLayout.NORTH); //set greeting message to north quadrant
		add(service, BorderLayout.CENTER); //set service panel to west quadrant
		add(buttonPanel, BorderLayout.SOUTH); //set button panel to south quadrant
		pack(); //pack quadrants
		setVisible(true); //make program visible
	}
		/**
		* @param buildButtonPanel builds button panel
		**/

		private void buildButtonPanel()
		{
			buttonPanel = new JPanel(); //create button panel object

			calcButton = new JButton("Calculate");
			exitButton = new JButton("Exit");

			calcButton.addActionListener(new CalcButtonListener());
			exitButton.addActionListener(new ExitButtonListener());

			buttonPanel.add(calcButton); //add calc button button panel
			buttonPanel.add(exitButton); //add exit button button panel
		}


		private class CalcButtonListener implements ActionListener
		{
			/**
			* @param actionPerformed performs calculation when user
			* hits calculate button
			**/
			public void actionPerformed(ActionEvent e)
			{
				double subTotal; //holds sub total
				double tax; // holds tax
				double total; //holds total


				subTotal = service.getTotalCost();

				tax = (subTotal * TAX_RATE);

				total = (subTotal + tax);

			DecimalFormat rounder = new DecimalFormat("#,###.00"); //create decimal format object

			JOptionPane.showMessageDialog(null, "SubTotal: $" + rounder.format(subTotal) +
												"\n Tax: $" + rounder.format(tax) +
												"\n Total: $" + rounder.format(total));
			}
		}

		private class ExitButtonListener implements ActionListener
		{
			/**
			* @param actionPerformed exits program when exit button is hit
			**/
			public void actionPerformed(ActionEvent e)
			{
				System.exit(0); //exit JOptionPane
			}
		}
}