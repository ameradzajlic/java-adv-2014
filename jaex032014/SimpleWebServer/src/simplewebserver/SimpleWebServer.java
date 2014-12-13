package simplewebserver; 
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Properties; 
public class SimpleWebServer {
    static String parseRequest(Socket socket) throws IOException{
        InputStream stream = socket.getInputStream();
        InputStreamReader isr = new InputStreamReader(stream);
        BufferedReader br = new BufferedReader(isr);
        String line = br.readLine();
        String document = line.split("/|HTTP/")[1].trim(); 
        return document;
    }
    static void response(Socket socket,String doc) throws IOException{
        OutputStream oStream = socket.getOutputStream();
        OutputStreamWriter osw = new OutputStreamWriter(oStream);
        File html_file = new File(doc);
        FileInputStream fis;
        if(!html_file.exists()){
            osw.write("HTTP/1.1 404 Not Found\r\n\r\n");
            osw.close();
            return;
        } else {
            fis = new FileInputStream(html_file);
            osw.write("HTTP/1.1 200 OK\r\n");
            osw.write("Content-type: text/html\r\n");
            osw.write("Content-length: " + fis.getChannel().size() + "\r\n");
            osw.write("\r\n");
            
        } 
        InputStreamReader isr = new InputStreamReader(fis); 
        int b;
        while((b=isr.read())!=-1){
            osw.write(b);
        }
        isr.close();
        osw.close();
    }
    public static void main(String[] args) throws FileNotFoundException, IOException {
        FileReader fr = new FileReader("config");
        Properties props = new Properties();
        props.load(fr);
        ServerSocket sSocket = new ServerSocket(Integer.parseInt(props.getProperty("port")));
        int requests = 0;
        while(true){
            Socket socket = sSocket.accept();
               String doc = parseRequest(socket); 
               response(socket, props.getProperty("path")+doc);
               System.out.print("request: " + (++requests) + "\r");
            socket.close();
        }
    }
}
