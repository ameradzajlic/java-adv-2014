package simplehttpserver;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.net.ServerSocket;
import java.net.Socket;

public class SimpleHttpServer {
    public static void main(String[] args) throws IOException {  
        ServerSocket server = new ServerSocket(1000); 
        System.out.println("Server is listening..."); 
        int requests = 0;
        while(true){
            Socket socket = server.accept();  
            InputStream stream = socket.getInputStream(); 
            String line;
            InputStreamReader sreader = new InputStreamReader(stream);
            BufferedReader rdr = new BufferedReader(sreader); 
            while(!(line=rdr.readLine()).isEmpty()){
                System.out.println(line);
            }  
            BufferedWriter wr = new BufferedWriter(new OutputStreamWriter(socket.getOutputStream()));
            wr.write("HTTP/1.1 200 OK\r\n\r\n");
            wr.write("Hello");
            wr.flush(); 
            socket.close();
            System.out.print(++requests+"\r");
        } 
    }
}
