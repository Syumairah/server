import java.net.*; 
import java.io.*; 
  
public class SimpleServer 
{ 
    //initialize socket and input stream 
    private Socket          socket   = null; 
    private ServerSocket    server   = null; 
    private DataInputStream in       =  null; 
  
    // constructor with port 
    public SmpleServer(int port) 
    { 
        // starts server and waits for a connection 
        try
        { 
            server = new ServerSocket(5132); 
            System.out.println("Server started"); 
  
            System.out.println("Waiting for a client to response ..."); 
  
            socket = server.accept(); 
            System.out.println("Congratulations! client is accepted and annyeong!"); 
  
            // takes input from the client socket 
            in = new DataInputStream( 
                new BufferedInputStream(socket.getInputStream())); 
  
            String line = ""; 
  
            // reads message from client until "Over" is sent 
            while (!line.equals("Over")) 
            { 
                try
                { 
                    line = in.readUTF(); 
                    System.out.println(line); 
  
                } 
                catch(IOException i) 
                { 
                    System.out.println(i); 
                } 
            } 
            System.out.println("Closing connection"); 
  
            // close connection 
            socket.close(); 
            in.close(); 
        } 
        catch(IOException i) 
        { 
            System.out.println(i); 
        } 
    } 
  
    public static void main(String args[]) 
    { 
        SimpleServer server = new SimpleServer(5132); 
    } 
} 
