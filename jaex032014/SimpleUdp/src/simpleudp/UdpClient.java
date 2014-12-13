package simpleudp;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.SocketException;
import java.net.UnknownHostException;

public class UdpClient {
    public static void main(String[] args) throws SocketException, UnknownHostException, IOException {
        InetAddress host = InetAddress.getByName("localhost");
        DatagramSocket dSocket = new DatagramSocket();
        byte[] buffer = "Hello".getBytes();
        DatagramPacket message = new DatagramPacket(buffer, buffer.length,host,1000); 
        //for(int i=0;i<30000;i++){ 
            dSocket.send(message);
        //}
        dSocket.close();
    }
}
