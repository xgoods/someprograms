/**
* @author Brian Goodwin
* @version 1.0 Apr. 15, 2014
* The purpose of this program is to create a panel for
* Joe's service calculator
**/

import java.awt.*;
import javax.swing.*;

public class ServicePanel extends JPanel
{
	public final double OIL_CHANGE = 26.00; //holds and initializes oil change
	public final double LUBE_JOB = 18.00; //holds and initializes lube job
	public final double RAD_FLUSH = 30.00; //holds and initializes radiator flush
	public final double TRAN_FLUSH = 80.00; //holds and initializes transmission flush
	public final double INSPECT = 15.00; //holds and initializes inspection
	public final double MUFF_REPLACE = 100.00; //holds and initializes muffler replacement
	public final double TIRE_ROTATE = 20.00; //holds and initializes tire rotation
	public final double HOURLY_RATE = 20.00; //holds and initializes hourly rate

	private JCheckBox oilChange; //holds oil change checkbox
	private JCheckBox lubeJob; //holds lube job checkbox
	private JCheckBox radFlush; //holds radiator flush checkbox
	private JCheckBox tranFlush; //holds transmission flush checkbox
	private JCheckBox inspect; //holds inspection checkbox
	private JCheckBox muffReplace; //holds muffler replacement checkbox
	private JCheckBox tireRotate; //holds tire rotation checkbox
	private JLabel hoursLabel; //holds hours label
	private JTextField hoursTextField; //holds hours text field

	/**
	* constructor
	**/

	public ServicePanel()
	{
		setLayout(new GridLayout(9,1)); // sets grid layout

		oilChange = new JCheckBox("Oil Change");
		lubeJob = new JCheckBox("Lube Job");
		radFlush = new JCheckBox("Radiator Flush");
		tranFlush = new JCheckBox("Transmission Flush");
		inspect = new JCheckBox("Inspection");
		muffReplace = new JCheckBox("Muffler Replacement");
		tireRotate = new JCheckBox("Tire Rotation");
		hoursLabel = new JLabel("Hours required for job:");
		hoursTextField = new JTextField(5);

		setBorder(BorderFactory.createTitledBorder("Services")); // set border

		add(oilChange); //add oil change checkbox to panel
		add(lubeJob); //add lube job checkbox to panel
		add(radFlush); //add radiator flush checkbox to panel
		add(tranFlush); //add transmission flush checkbox to panel
		add(inspect); //add inspection checkbox to panel
		add(muffReplace); //add muffler replacement checkbox to panel
		add(tireRotate); //add tire rotation checkbox to panel
		add(hoursLabel); //add hours label to panel
		add(hoursTextField); //add hours text field to panel


	}
	/**
	* @return getTotalCost total cost
	**/
	public double getTotalCost()
	{
		double repairCost = 0.0; //holds and initializes repair cost
		String str; //holds user input
		double hoursWorked = 0; //holds and initializes hours worked
		double totalCost; //holds total cost
		try //throws exception if nothing entered
		{
		str = hoursTextField.getText();
		hoursWorked = Double.parseDouble(str) * HOURLY_RATE;
		}
		catch(NumberFormatException e)
		{
			JOptionPane.showMessageDialog(null,e.getMessage());
		}
		if(oilChange.isSelected())
			repairCost += OIL_CHANGE;
		if(lubeJob.isSelected())
			repairCost += LUBE_JOB;
		if(radFlush.isSelected())
			repairCost += RAD_FLUSH;
		if(tranFlush.isSelected())
			repairCost += TRAN_FLUSH;
		if(inspect.isSelected())
			repairCost += INSPECT;
		if(muffReplace.isSelected())
			repairCost += MUFF_REPLACE;
		if(tireRotate.isSelected())
			repairCost += TIRE_ROTATE;

		totalCost = (repairCost + hoursWorked);

		return totalCost;
	}
}
