import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

/**
* @author Brian Goodwin
* @version 1.0 Apr 30. 2014
* The purpose of this program is to creates the options
* panel for the registration system
**/

public class RegistrationSystem extends JPanel
{
	public final double GEN_FEE = 895.00; //holds general fee
	public final double STUDENT_FEE = 495.00; //holds student fee
	public final double OPT_DINNER = 30.00; //holds optional dinner
	public final double INTRO_COMMERCE = 295.00; //holds intro to commerce
	public final double FUTURE_WEB = 295.00; //holds future of web
	public final double JAVA_PROG = 395.00; //holds java programming
	public final double NET_SECURE = 395.00; //holds network security

	private JCheckBox genFee; //holds general fee checkbox
	private JCheckBox studentFee; //holds student fee checkbox
	private JCheckBox optDinner; //holds option dinner checkbox
	private JCheckBox introCommerce; //holds intro to commerce checkbox
	private JCheckBox futureWeb; //holds future of web checkbox
	private JCheckBox javaProg; //holds java programming checkbox
	private JCheckBox netSecure; //holds network security checkbox

	private JLabel numGenFeeLB; //holds general fee ticket label
	private JLabel numStudentFeeLB; //holds student fee ticket label
	private JLabel numOptDinnerLB; //holds optional dinner ticket label
	private JLabel numIntroCommerceLB; //holds intro to commerce ticket label
	private JLabel numFutureWebLB; //holds future of web ticket label
	private JLabel numJavaProgLB; //holds java programming ticket label
	private JLabel numNetSecureLB; //holds network security ticket label

	private JTextField numGenFeeTF; //holds general fee ticket text field
	private JTextField numStudentFeeTF; //holds student fee ticket text field
	private JTextField numOptDinnerTF; //holds optional dinner ticket text field
	private JTextField numIntroCommerceTF; //holds intro to commerce ticket text field
	private JTextField numFutureWebTF; //holds future of web ticket text field
	private JTextField numJavaProgTF; //holds java programming ticket text field
	private JTextField numNetSecureTF; //holds network security ticket text field

	/**
	* Constructor
	**/

	public RegistrationSystem()
	{
		setLayout(new GridLayout(22,1)); //creates grid layout for options panel

		genFee = new JCheckBox("General Fee");
		numGenFeeLB = new JLabel("Number of general tickets");
		numGenFeeLB.setForeground(Color.blue);
		numGenFeeTF = new JTextField(10);
		studentFee = new JCheckBox("Student Fee");
		numStudentFeeLB = new JLabel("Number of student tickets");
		numStudentFeeLB.setForeground(Color.blue);
		numStudentFeeTF = new JTextField(10);
		optDinner = new JCheckBox("Optional Dinner");
		numOptDinnerLB = new JLabel("Number of dinner tickets");
		numOptDinnerLB.setForeground(Color.blue);
		numOptDinnerTF = new JTextField(10);
		introCommerce = new JCheckBox("Intro to E-Commerce class");
		numIntroCommerceLB = new JLabel("Number of E-Commerce class tickets");
		numIntroCommerceLB.setForeground(Color.blue);
		numIntroCommerceTF = new JTextField(10);
		futureWeb = new JCheckBox("Future of Web class");
		numFutureWebLB = new JLabel("Number of Future of Web class tickets");
		numFutureWebLB.setForeground(Color.blue);
		numFutureWebTF = new JTextField(10);
		javaProg = new JCheckBox("Java Programming class");
		numJavaProgLB = new JLabel("Number of Java Programming class tickets");
		numJavaProgLB.setForeground(Color.blue);
		numJavaProgTF = new JTextField(10);
		netSecure = new JCheckBox("Network Security class");
		numNetSecureLB = new JLabel("Number of Network Security class tickets");
		numNetSecureLB.setForeground(Color.blue);
		numNetSecureTF = new JTextField(10);

		setBorder(BorderFactory.createTitledBorder("Options")); //creates options border

		add(genFee);
		add(numGenFeeLB);
		add(numGenFeeTF);
		add(studentFee);
		add(numStudentFeeLB);
		add(numStudentFeeTF);
		add(optDinner);
		add(numOptDinnerLB);
		add(numOptDinnerTF);
		add(introCommerce);
		add(numIntroCommerceLB);
		add(numIntroCommerceTF);
		add(futureWeb);
		add(numFutureWebLB);
		add(numFutureWebTF);
		add(javaProg);
		add(numJavaProgLB);
		add(numJavaProgTF);
		add(netSecure);
		add(numNetSecureLB);
		add(numNetSecureTF);

	}

	/**
	* @param getTotalCost calculates total cost
	* @return the total cost
	**/

	public double getTotalCost()
	{
		double regCost = 0.0; //holds regular cost
		String str; //used to hold user text
		double genFeeCost = 0.0; //holds general fee cost
		double studentFeeCost = 0.0; //holds student fee cost
		double optDinnerCost = 0.0; //holds optional dinner cost
		double introCommerceCost = 0.0; //holds intro to commerce cost
		double futureWebCost = 0.0; //holds future of web cost
		double javaProgCost = 0.0; //holds java programming cost
		double netSecureCost = 0.0; //holds network security cost

		try
		{
			str = numGenFeeTF.getText();
			genFeeCost = Double.parseDouble(str);
		}
		catch(NumberFormatException e)
		{
		}

		try
		{
			str = numStudentFeeTF.getText();
			studentFeeCost = Double.parseDouble(str);
		}
		catch(NumberFormatException e)
		{
		}

		try
		{
			str = numOptDinnerTF.getText();
			optDinnerCost = Double.parseDouble(str);
		}
		catch(NumberFormatException e)
		{
		}

		try
		{
			str = numIntroCommerceTF.getText();
			introCommerceCost = Double.parseDouble(str);
		}
		catch(NumberFormatException e)
		{
		}

		try
		{
			str = numFutureWebTF.getText();
			futureWebCost = Double.parseDouble(str);
		}
		catch(NumberFormatException e)
		{
		}

		try
		{
			str = numJavaProgTF.getText();
			javaProgCost = Double.parseDouble(str);
		}
		catch(NumberFormatException e)
		{
		}

		try
		{
			str = numNetSecureTF.getText();
			netSecureCost = Double.parseDouble(str);
		}
		catch(NumberFormatException e)
		{
		}

		if(genFee.isSelected())
			regCost += (GEN_FEE * genFeeCost);
		if(studentFee.isSelected())
			regCost += (STUDENT_FEE * studentFeeCost);
		if(optDinner.isSelected())
			regCost += (OPT_DINNER * optDinnerCost);
		if(introCommerce.isSelected())
			regCost += (INTRO_COMMERCE * introCommerceCost);
		if(futureWeb.isSelected())
			regCost += (FUTURE_WEB * futureWebCost);
		if(javaProg.isSelected())
			regCost += (JAVA_PROG * javaProgCost);
		if(netSecure.isSelected())
			regCost += (NET_SECURE * netSecureCost);

		return regCost; //return regular cost
	}

}
















