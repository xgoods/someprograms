/**
Brian Goodwin
Programming assignment 1
cs241 3-20-16
**/
import java.util.Random;
import java.util.Arrays;
import java.util.Collections;
import java.io.*;
public class Insertion
{
	public static void main(String[] args) throws IOException
	{
		
		Random rand=new Random();
		File file=new File("InsertionResults.txt");
		file.createNewFile();
		PrintStream output = new PrintStream(file);
		int firstN=32;
		int secondN=100;
		int thirdN=1000;
		int fourthN=10000;
		
		int[] arrayBest32=new int[firstN];
		int[] arrayRand32=new int[firstN];
		int[] arrayWorst32=new int[firstN];
		
		int[] arrayBest100=new int[secondN];
		int[] arrayRand100=new int[secondN];
		int[] arrayWorst100=new int[secondN];
		
		int[] arrayBest1000=new int[thirdN];
		int[] arrayRand1000=new int[thirdN];
		int[] arrayWorst1000=new int[thirdN];
		
		int[] arrayBest10000=new int[fourthN];
		int[] arrayRand10000=new int[fourthN];
		int[] arrayWorst10000=new int[fourthN];
		
		for(int i=0;i<firstN;i++)
		{
			arrayRand32[i]=rand.nextInt(100)+1;
			arrayBest32[i]=rand.nextInt(100)+1;
			arrayWorst32[i]=rand.nextInt(100)+1;
		}
		
		for(int i=0;i<secondN;i++)
		{
			arrayRand100[i]=rand.nextInt(100)+1;
			arrayBest100[i]=rand.nextInt(100)+1;
			arrayWorst100[i]=rand.nextInt(100)+1;
		}
		
		for(int i=0;i<thirdN;i++)	
		{
			arrayRand1000[i]=rand.nextInt(100)+1;
			arrayBest1000[i]=rand.nextInt(100)+1;
			arrayWorst1000[i]=rand.nextInt(100)+1;
		}
		
		for(int i=0;i<fourthN;i++)
		{
			arrayRand10000[i]=rand.nextInt(100)+1;
			arrayBest10000[i]=rand.nextInt(100)+1;
			arrayWorst10000[i]=rand.nextInt(100)+1;
			
		}
		
		bestCase32(arrayBest32,32,output);
		worstCase32(arrayWorst32,32,output);
		randCase32(arrayRand32,32,output);
	    output.println();
		output.print("The conclusion with n=32 is that the number of key comparisons for best and worst case does match the theoritical values.");
		output.print(" However, the number of key comparisons in the average case is slightly different than the theoretical value.");
		output.println();
		bestCaseN(arrayBest100,100,output);
		worstCaseN(arrayWorst100,100,output);
		randCaseN(arrayRand100,100,output);
		
		bestCaseN(arrayBest1000,1000,output);
		worstCaseN(arrayWorst1000,1000,output);
		randCaseN(arrayRand1000,1000,output);
		
		bestCaseN(arrayBest10000,10000,output);
		worstCaseN(arrayWorst10000,10000,output);
		randCaseN(arrayRand10000,10000,output);
		output.println();
		output.print("The conclusion for n=100,1000,10000 is that the number of key comparisons for worst and average case show O(n^2)");
		output.print(" where best case shows close to O(n). When the array size increases by factor of 10 the number of comparisons increases");
		output.print(" by 100. The constant factor is 1.");
		output.close();
	}
	
	private static void bestCase32(int[] bestArray,int n, PrintStream output) throws IOException
	{
		
		Arrays.sort(bestArray);
		output.println("The best case scenario with n="+n);
		output.println("------------------------------------------------------------------------------------------------------------");
		output.print("Input: ");
		for(int i=0; i<bestArray.length;i++)
		{
			output.print(bestArray[i]+" ");
		}
		output.println();
		insertionAlgo(bestArray,n,output);
	}
	private static void bestCaseN(int[] bestArray,int n, PrintStream output) throws IOException
	{
		output.println();
		Arrays.sort(bestArray);
		output.println("The best case scenario with n="+n);
		output.println("------------------------------------");
		
		insertionAlgo(bestArray,n,output);
	}
	
	private static void worstCase32(int[] worstArray,int n, PrintStream output) throws IOException
	{
		int[] arrayWorst=new int[n];
		
		Integer[] tempArrayWorst=new Integer[worstArray.length];
		
		for(int i=0;i<worstArray.length;i++)
		{
			tempArrayWorst[i]=new Integer(worstArray[i]);
		}
		
		Arrays.sort(tempArrayWorst, Collections.reverseOrder());
		
		for(int i=0;i<tempArrayWorst.length;i++)
		{
			arrayWorst[i]=tempArrayWorst[i].intValue();
		}
		output.println();
		output.println("The worst case scenario with n="+n);
		output.println("------------------------------------------------------------------------------------------------------------");
		output.print("Input: ");
		for(int i=0; i<arrayWorst.length;i++)
		{
			output.print(arrayWorst[i]+" ");
		}
		output.println();
		insertionAlgo(arrayWorst,n,output);
	}
	
	private static void worstCaseN(int[] worstArray,int n, PrintStream output) throws IOException
	{
		int[] arrayWorst=new int[n];
		
		Integer[] tempArrayWorst=new Integer[worstArray.length];
		
		for(int i=0;i<worstArray.length;i++)
		{
			tempArrayWorst[i]=new Integer(worstArray[i]);
		}
		
		Arrays.sort(tempArrayWorst, Collections.reverseOrder());
		
		for(int i=0;i<tempArrayWorst.length;i++)
		{
			arrayWorst[i]=tempArrayWorst[i].intValue();
		}
		output.println();
		output.println("The worst case scenario with n="+n);
		output.println("-------------------------------------");
		
		insertionAlgo(arrayWorst,n,output);
	}
	
	private static void randCase32(int[] randArray, int n, PrintStream output) throws IOException
	{
	    output.println();
	    output.println("The average case scenario with n="+n);
		output.println("------------------------------------------------------------------------------------------------------------");
		output.print("Input: ");
		for(int i=0; i<randArray.length;i++)
		{
			output.print(randArray[i]+" ");
		}
		output.println();
		insertionAlgo(randArray,n,output);
	}
	
	private static void randCaseN(int[] randArray, int n, PrintStream output) throws IOException
	{
	    output.println();
	    output.println("The average case scenario with n="+n);
		output.println("-------------------------------------");
		
		insertionAlgo(randArray,n,output);
	}
	private static void printArray(int[] array, PrintStream output) throws IOException
	{
		
		output.print("Output: ");
		for(int i=0;i<array.length;i++)
		{
			
			output.print(array[i]+" ");
		}
		output.println();
	}
	
	private static void insertionAlgo(int[] array, int n, PrintStream output) throws IOException
	{
		int count=0;
		int key;
		int t;
		for(int i=1; i<array.length;i++)
		{
			key=array[i];
			t=i-1;
			
			count++;
			while(t>=0&&array[t]>key)
			{
				array[t+1]=array[t];
				t--;
				
			    if(t>=0)
			        count++;
			}
			array[t+1]=key;
		}
		
		if(n==32)
		{
		   printArray(array,output);
		}
		output.println("Number of key comparisons: "+count);
	}
}
			
			

	
