// Programmed by    Stephen Brower
// Modified by   Brian Goodwin Oct. 26, 2014
import java.text.DecimalFormat;
public class SampleSimulation
{
    public static void main(String[] args)
    {
        int currentSecond;
        final int MAX_TIME_FOR_SIMULATION = 90*60; // 90 minutes
        final double PROBABILITY_OF_ARRIVAL = 20.0 / (60*60);
        final int TIME_TO_CHECKOUT = 5*60;
        int numCustomersArrived = 0;
        boolean serverFree = true;
        int workToDo = 0;
        int arrivalTime = 0;
       	int numCustomersServed = 0;
        int waitTime = 0; 
        int totalWaitTime = 0;
        Queue<Integer>customerArrivalQueue = new Queue<Integer>();
        DecimalFormat rounder = new DecimalFormat("###.00");
       
       	for (currentSecond = 0; currentSecond < MAX_TIME_FOR_SIMULATION; currentSecond++)
        {
            // has someone arrived?
            if (Math.random() < PROBABILITY_OF_ARRIVAL)
            {
                // a customer arrived
                numCustomersArrived++;
                // stick on customerArrivalQueue queue
                customerArrivalQueue.add(currentSecond);
                
                System.out.println("At time " + currentSecond + " a customer arrived");
            }

            // is a server free and someone waiting?
            if (serverFree && customerArrivalQueue.size() > 0 )
            {
                serverFree = false;
                workToDo = TIME_TO_CHECKOUT;
                // pull customer off queue
                arrivalTime = customerArrivalQueue.remove();
                numCustomersServed++;
                // count customer as served
               waitTime = (currentSecond - arrivalTime);
               totalWaitTime += waitTime;
               
               System.out.println("At " + currentSecond + " started working on customer who arrived at "+arrivalTime);
            }

			// server - work!
            if (!serverFree)
            {
                workToDo--;
                if (workToDo <= 0)
                {
                    serverFree = true;
                    System.out.println("At " + currentSecond + " server free!");
                }
            }
        }

        System.out.println("\n" + numCustomersArrived + " customers arrived");

        // Display the counter for the number of customers served
        System.out.println("Number of customers served: " + numCustomersServed);
        // Display the average wait time that the customers served had to wait on line
        System.out.println("Average Wait Time to be Served: " + (rounder.format((double)totalWaitTime / numCustomersServed / 60))  + " minutes");
        // Display the number of customers stuck on line (still in Queue)
        System.out.println("number of customers stuck on line: " + customerArrivalQueue.size());
    }
}
