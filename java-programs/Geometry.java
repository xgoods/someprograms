import javax.swing.JOptionPane;
/**
* @author Brian Goodwin
* @version 1.0, Mar. 4,2014
* The Geometry class represents a geometry calculator
**/

public class Geometry
{
	private double radius; //holds radius
	private double length; //holds length
	private double width; //holds width
	private double base; //holds base
	private double height; //holds height

	/**
	* @param radius accepts arg for circle's radius
	* @param length accepts arg for rectangle's length
	* @param width accepts arg for rectangle's width
	* @param base accepts arg for triange's base
	* @param height accepts arg for triangle's height
	**/

	public Geometry(double radius, double length, double width, double base, double height)
	{
		this.radius = radius;
		this.length = length;
		this.width = width;
		this.base = base;
		this.height = height;
	}

	/**
	* @param setRadius accepts arg for circle's radius
	**/

	public void setRadius(double radius)
	{
		this.radius = radius;
	}

	/**
	* @param setLength accepts arg for rectangle's length
	**/

	public void setLength(double length)
	{
		this.length = length;
	}

	/**
	* @param setWidth accepts arg for rectangle's width
	**/

	public void setWidth(double width)
	{
		this.width = width;
	}

	/**
	* @param setBase accepts arg for triangle's base
	**/

	public void setBase(double base)
	{
		this.base = base;
	}

	/**
	* @param setHeight accepts arg for triangle's height
	**/

	public void setHeight(double height)
	{
		this.height = height;
	}

	/**
	* @param calcAreaCircle accepts the radius and validates
	* the input by ensuring the user cannot enter a radius
	* less than 0
	* @return area of the circle
	**/

	public static double calcAreaCircle(double radius)
	{
		String str; //used for JOptionPane

		while(radius < 0)
			{
				JOptionPane.showMessageDialog(null,"Im sorry, the radius cannot be negative.");
				str = JOptionPane.showInputDialog("Enter the radius of the circle.");
				radius = Double.parseDouble(str);
			}
		return (Math.PI * Math.pow(radius, 2.0));
	}

	/**
	* @param calcAreaRectangle accepts the length and width
	* and validates the input by ensuring the user cannot
	* enter a length and/or width less than 0
	* @return area of the rectangle
	**/

	public static double calcAreaRectangle(double length, double width)
	{
		String str; //used for JOptionPane

		while(length < 0 || width < 0)
			{
				JOptionPane.showMessageDialog(null,"Im sorry, the length and/or width cannot be negative.");
				str = JOptionPane.showInputDialog("Enter the length of the rectangle.");
				length = Double.parseDouble(str);

				str = JOptionPane.showInputDialog("Enter the width of the rectangle.");
				width = Double.parseDouble(str);
			}

		return (length * width);
	}

	/**
	* @param calcAreaTriangle accepts the base and height
	* and validates the input by ensuring the user cannot
	* enter a base or height less than 0
	* @return area of the triangle
	**/

	public static double calcAreaTriangle(double base, double height)
	{
		String str; //used for JOptionPane

		while(base < 0 || height < 0)
			{
				JOptionPane.showMessageDialog(null,"Im sorry, the base and/or height cannot be negative.");
				str = JOptionPane.showInputDialog("Enter the base of the triangle.");
				base = Double.parseDouble(str);

				str = JOptionPane.showInputDialog("Enter the height of the triangle.");
				height = Double.parseDouble(str);
			}

		return (.5 * base * height);
	}
}