package simpleudp;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.SocketException;

public class SimpleUdp {
    public static void main(String[] args) throws SocketException, IOException {
        DatagramSocket udpServer = new DatagramSocket(1000);
        byte[] data = new byte[32];
        DatagramPacket dPacket = new DatagramPacket(data, data.length);
        System.out.println("Server is listening...");
        int packagesReceived = 0;
        while(true){
            udpServer.receive(dPacket);
            byte[] recData = dPacket.getData();
            System.out.println(new String(recData,"UTF-8"));
            dPacket.setData(new byte[32]); 
            System.out.print("Packages received: " + (++packagesReceived) + "\r");
        }
    }
}
