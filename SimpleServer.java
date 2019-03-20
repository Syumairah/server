import java.net.*; 
import java.io.*; 
  
public class SimpleServer 
{ 
    //initialize socket and input stream 
    private Socket          socket   = null; 
    private ServerSocket    server   = null; 
    private DataInputStream in =  null; 
    private DataOutputStream out = null;
  
    // constructor with port 
    public SimpleServer (int port) 
    { 
        // starts server and waits for a connection 
        try
        { 
            server = new ServerSocket(port); 
            System.out.println("Server started and waiting for a client to response ...");  
  
            socket = server.accept(); 
            System.out.println("Client accepted"); 
  
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
          
          //Sending response back to the client
          OutputStream os = socket.getOutputStream();
          OutputStreamWriter osw = new OutputStreamWriter(os);
          BufferedWriter bw = new BufferedWriter(osw);
          System.out.println ("Message sent to the client is "+server.accept());
          bw.flush();
  
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
        SimpleServer server = new SimpleServer(5000); 
    } 
} 
