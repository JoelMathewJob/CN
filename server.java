import java.io.*;
import java.net.*;

public class server{
  public static void main(String [] joel){
    int port = 12345;

    try{
      ServerSocket serverSocket = new ServerSocket(port);
      System.out.println("Server listeneing to port "+port);
      
      Socket socket = serverSocket.accept();
      System.out.println("Client connected");
      
      PrintWriter out = new PrintWriter(socket.getOutputStream(),true);
      out.println(" Hello from the server");

      socket.close();
    }
    catch(IOException e){
      System.out.println("Error "+e);
    }
  }
}
