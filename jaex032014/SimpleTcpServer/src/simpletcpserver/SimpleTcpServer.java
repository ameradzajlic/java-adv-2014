package simpletcpserver;
import java.io.IOException;
import java.net.InetAddress;
import java.net.ServerSocket; 
public class SimpleTcpServer {
    public static void main(String[] args) throws IOException { 
        ServerSocket serverSocket = new ServerSocket(1000);
        System.out.println("Server is listening...");
        serverSocket.accept(); 
        System.out.println("Connection accepted");
    }
}
