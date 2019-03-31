import java.net.*; 
import java.io.*;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
  
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
            rp.println ("Congratulations!");
            rp.flush();
      
            String receiver = ot.readLine();
            System.out.println ("Client");
            System.out.println ("receiver");
      
      
    } 
   }
