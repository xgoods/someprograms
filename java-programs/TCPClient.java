/*Brian Goodwin
Programming project part 1
*/
import java.io.*; 
import java.net.*; 
class TCPClient 
{ 

    public static void main(String argv[]) throws Exception 
    { 
        String clientRouterNumber="0"; 
        String clientLeastCost="1"; 
        String serverSentence;
        BufferedReader inFromUser=new BufferedReader(new InputStreamReader(System.in)); 
        try
        {
            Socket clientSocket = new Socket("192.168.1.113", 1059); 
            DataOutputStream outToServer = new DataOutputStream(clientSocket.getOutputStream());
            BufferedReader inFromServer = new BufferedReader(new InputStreamReader(clientSocket.getInputStream())); 
        
            System.out.println("Client router number is "+clientRouterNumber+" and the least cost to router 1 is "+clientLeastCost);
            outToServer.writeBytes(clientRouterNumber+'\n'); 
            outToServer.writeBytes(clientLeastCost+'\n');
            serverSentence=inFromServer.readLine(); 

            System.out.println("FROM SERVER: " + serverSentence); 

            clientSocket.close();
        }
        catch(Exception e)
        {
            e.printStackTrace();
        }
    } 
} 