import java.net.*; 
import java.io.*; 
  
public class SimpleServer 
{
  
    // constructor with port 
    public static void main (String[]args) throws IOException
    { 
            ServerSocket Simple = new ServerSocket(5132); 
          
            System.out.println("Server started wait for client to response . . .");
  
            Socket S = Simple.accept(); 
            System.out.println("Client is accepted and annyeong!)"); 
  
            // takes input from the client socket 
            in gt = new DataInputStream(S.getInputStream()); 
            BufferedReader ot = new BufferedReader (gt);
  
            PrintWriter rp = new PrintWriter (S.getOutputStream());
            rp.printIn ("Congratulations!");
            rp.flush();
      
            String rcvr = ot.readLine();
            System.out.println ("Client", recvr);
      
      
    } 
   }
