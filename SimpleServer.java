import java.net.*; 
import java.io.*; 
  
public class SimpleServer 
{
  
    // constructor with port 
    public static void main (String[]args) throws IOException
    { 
            ServerSocket Simple = new ServerSocket(5132); 
            Socket S = Simple.accept(); 
      
            System.out.println("Client is accepted and annyeong!");
 
  
            // takes input from the client socket 
            InputStreamReader gt = new InputStreamReader(S.getInputStream()); 
            BufferedReader ot = new BufferedReader(gt);
  
            PrintWriter rp = new PrintWriter(S.getOutputStream());
            ot.println ("Congratulations!");
            ot.flush();
      
            String receiver = ot.readLine();
            System.out.println ("Client", receiver);
      
      
    } 
   }
