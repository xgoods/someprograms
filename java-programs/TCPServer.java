/*Brian Goodwin
Programming project part 1
*/
import java.io.*;
import java.net.*;

public class TCPServer
{
    public static void main(String[] args) throws Exception
    {
        String clientRouterNumber;
        String clientLeastCost;
        String serverRouterNumber="1";
        String serverLeastCost="1";
        String serverReturn;
                
        ServerSocket welcomeSocket=new ServerSocket(1059);

        while(true)
        {
            System.out.println("Waiting to recieve input from client");
            try
            {
                Socket connectionSocket=welcomeSocket.accept();
                System.out.println("Connected");
            
            
                BufferedReader inFromClient=new BufferedReader(new InputStreamReader(connectionSocket.getInputStream()));
                DataOutputStream outToClient=new DataOutputStream(connectionSocket.getOutputStream());
                        
                clientRouterNumber=inFromClient.readLine();
                clientLeastCost=inFromClient.readLine();
                System.out.println("Client router number is "+clientRouterNumber+" client least cost is "+clientLeastCost);
                serverReturn=("Server router number is "+serverRouterNumber+" and the least cost to router 0 is "+serverLeastCost);           
                outToClient.writeBytes(serverReturn);
                        
                        
                connectionSocket.close();
            }
            catch(Exception e)
            
            {
                e.printStackTrace();
            }
        }
    }
}