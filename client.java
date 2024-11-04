import java.io.*;
import java.net.*;

public class client{
  public static void main (String[] joel){
    String host = "localhost";
    int port = 12345;

    try{
      Socket socket = new Socket(host, port);
      
BufferedReader bf = new BufferedReader(new InputStreamReader(socket.getInputStream()));
      String response = bf.readLine();
      System.out.println("Server says :"+response);
      
    }
    catch(IOException e){
      System.out.println(e);
    }
  }
}
  
