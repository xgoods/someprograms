/**
* @author Brian Goodwin
* @version 1.0, Mar. 8, 2014
* The arrayOperations class represents the different
* array operations
**/
public class arrayOperations
{

	//integer variables
	private int arraySize; //hold array size
	private int[] INTarray = new int[arraySize]; //holds integer array
	private int INTtotal; //holds integer total
	private int INTaverage; // holds integer average
	private int INThighest; // holds highest integer value
	private int INTlowest;; //holds lowest integer value
	//double variables
	private double[] DUBarray = new double[arraySize]; // holds double array
	private double DUBtotal; //holds double total
	private double DUBaverage; //holds double average
	private double DUBhighest; //holds double highest
	private double DUBlowest; //holds double lowest
	//float variables
	private float[] FLOarray = new float[arraySize]; //holds float array
	private float FLOtotal; //holds float total
	private float FLOaverage; //holds float average
	private float FLOhighest; //holds float highest
	private float FLOlowest; //holds float lowest
	//long variables
	private long[] LONarray = new long[arraySize]; //holds long array
	private long LONtotal; //holds long total
	private long LONaverage; //holds long average
	private long LONhighest; //holds long highest
	private long LONlowest; //holds long lowest

	/** The constructor accepts arguments for the arraySize, integer array, double array, float array
	* and long array
	* @param arraySize accepts arg for users array size
	* @param INTarray accepts arg for users integer array
	* @param DUBarray accepts arg for users double array
	* @param FLOarray accepts arg for users float array
	* @param LONarray accepts arg for users long array
	**/

	public arrayOperations(int arraySize, int[] INTarray, double[] DUBarray, float[] FLOarray, long[] LONarray)
	{
		this.arraySize = arraySize;
		this.INTarray = INTarray;
		this.DUBarray = DUBarray;
		this.FLOarray = FLOarray;
		this.LONarray = LONarray;
	}

	/**
	* @param setArraySize accepts args for users array size
	**/

	public void setArraySize(int arraySize)
	{
		this.arraySize = arraySize;
	}

	/**
	* @param setINTarray accepts args for users integer array
	**/

	public void setINTarray(int[] INTarray)
	{
		this.INTarray = INTarray;
	}

	/**
	* @param setDUBarray accepts args for users double array
	**/

	public void setDUBarray(double[] DUBarray)
	{
		this.DUBarray = DUBarray;
	}

	/**
	* @param setFLOarray accepts args for users float array
	**/

	public void setFLOarray(float[] FLOarray)
	{
		this.FLOarray = FLOarray;
	}

	/**
	* @param setLONarray accepts args for users long array
	**/

	public void setLONarray(long[] LONarray)
	{
		this.LONarray = LONarray;
	}

	/**
	* @param getTotal calculates the sum of the integer values
	* in the array
	* @return the sum of the integer values in the array
	**/

	public static int getTotal(int[] INTarray, int INTtotal)
	{
		INTtotal = 0;
		for(int index = 0; index < INTarray.length; index++)
		{
			INTtotal += INTarray[index];
		}

		return INTtotal;
	}

	/**
	* @param getAverage calculates the average of the integer
	* values in the array
	* @return the average of the integer values in the array
	**/

	public static int getAverage(int[] INTarray, int INTtotal, int INTaverage)
	{
		INTaverage = 0;
		INTaverage = (INTtotal / INTarray.length);
		return INTaverage;
	}

	/**
	* @param getHighest calculates the highest integer value
	* in the array
	* @return the highest integer value in the array
	**/

	public static int getHighest(int[] INTarray, int INThighest)
	{
		INThighest = INTarray[0];
		for(int index = 0; index < INTarray.length; index++)
		{
			if(INTarray[index] > INThighest)
			{
				INThighest = INTarray[index];
			}
		}

		return INThighest;
	}

	/**
	* @param getLowest calculates the lowest integer value
	* in the array
	* @return the lowest integer value in the array
	**/

	public static int getLowest(int[] INTarray, int INTlowest)
	{
		INTlowest = INTarray[0];
		for(int index = 0; index < INTarray.length; index++)
		{
			if(INTarray[index] < INTlowest)
			{
				INTlowest = INTarray[index];
			}
		}

		return INTlowest;
	}

	/**
	* @param getTotal calculates the sum of the double values
	* in the array
	* @return the sum of the double values in the array
	**/

	public static double getTotal(double[] DUBarray, double DUBtotal)
	{
		DUBtotal = 0;
		for(int index = 0; index < DUBarray.length; index++)
		{
			DUBtotal += DUBarray[index];
		}

		return DUBtotal;
	}

	/**
	* @param getAverage calculates the average of the double values
	* in the array
	* @return the average of the double values in the array
	**/

	public static double getAverage(double[] DUBarray, double DUBtotal, double DUBaverage)
	{
		DUBaverage = 0;
		DUBaverage = (DUBtotal / DUBarray.length);
		return DUBaverage;
	}

	/**
	* @param getHighest calculates the highest double value in the array
	* @return the highest double value in the array
	**/

	public static double getHighest(double[] DUBarray, double DUBhighest)
	{
		DUBhighest = DUBarray[0];
		for(int index = 0; index < DUBarray.length; index++)
		{
			if(DUBarray[index] > DUBhighest)
			{
				DUBhighest = DUBarray[index];
			}
		}

		return DUBhighest;
	}

	/**
	* @param getLowest calculates the lowest double value in the array
	* @return the lowest double value in the array
	**/

	public static double getLowest(double[] DUBarray, double DUBlowest)
	{
		DUBlowest = DUBarray[0];
		for(int index = 0; index < DUBarray.length; index++)
		{
			if(DUBarray[index] < DUBlowest)
			{
				DUBlowest = DUBarray[index];
			}
		}

		return DUBlowest;
	}

	/**
	* @param getTotal calculates the sum of the float values
	* in the array
	* @return the sum of the float values in the array
	**/

	public static float getTotal(float[] FLOarray, float FLOtotal)
	{
		FLOtotal = 0f;
		for(int index = 0; index < FLOarray.length; index++)
		{
			FLOtotal += FLOarray[index];
		}

		return FLOtotal;
	}

	/**
	* @param getAverage calculates the average of the float values
	* in the array
	* @return the average of the float values in the array
	**/

	public static float getAverage(float[] FLOarray, float FLOtotal, float FLOaverage)
	{
		FLOaverage = 0f;
		FLOaverage = (FLOtotal / FLOarray.length);
		return FLOaverage;
	}

	/**
	* @param getHighest calculates the highest float value
	* in the array
	* @return the highest float value in the array
	**/

	public static float getHighest(float[] FLOarray, float FLOhighest)
	{
		FLOhighest = FLOarray[0];
		for(int index = 0; index < FLOarray.length; index++)
		{
			if(FLOarray[index] > FLOhighest)
			{
				FLOhighest = FLOarray[index];
			}
		}

		return FLOhighest;
	}

	/**
	* @param getLowest calculates the lowest float value
	* in the array
	* @return the lowest float value in the array
	**/

	public static float getLowest(float[] FLOarray, float FLOlowest)
	{
		FLOlowest = FLOarray[0];
		for(int index = 0; index < FLOarray.length; index++)
		{
			if(FLOarray[index] < FLOlowest)
			{
				FLOlowest = FLOarray[index];
			}
		}

		return FLOlowest;
	}

	/**
	* @param getTotal calculates the sum of the long values
	* in the array
	* @return the sum of the long values in the array
	**/

	public static long getTotal(long[] LONarray, long LONtotal)
	{
		LONtotal = 0;
		for(int index = 0; index < LONarray.length; index++)
		{
			LONtotal += LONarray[index];
		}

		return LONtotal;
	}

	/**
	* @param getAverage calculates the average of the long values
	* in the array
	* @return the average of the long values in the array
	**/

	public static long getAverage(long[] LONarray, long LONtotal, long LONaverage)
	{
		LONaverage = 0;
		LONaverage = (LONtotal / LONarray.length);
		return LONaverage;
	}

	/**
	* @param getHighest calculates the highest long value
	* in the array
	* @return the highest long value in the array
	**/

	public static long getHighest(long[] LONarray, long LONhighest)
	{
		LONhighest = LONarray[0];
		for(int index = 0; index < LONarray.length; index++)
		{
			if(LONarray[index] > LONhighest)
			{
				LONhighest = LONarray[index];
			}
		}

		return LONhighest;
	}

	/**
	* @param getLowest calculates the lowest long value
	* in the array
	* @return the lowest long value in the array
	**/

	public static long getLowest(long[] LONarray, long LONlowest)
	{
		LONlowest = LONarray[0];
		for(int index = 0; index < LONarray.length; index++)
		{
			if(LONarray[index] < LONlowest)
			{
				LONlowest = LONarray[index];
			}
		}

		return LONlowest;
	}
}

