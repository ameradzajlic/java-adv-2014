package udp2way; 

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.SocketException;

public class Client {
    public static void main(String[] args) throws SocketException, IOException{
        DatagramSocket dServer = new DatagramSocket(1001);
        DatagramPacket dPacket = new DatagramPacket("Hello".getBytes(), "Hello".getBytes().length,InetAddress.getByName("localhost"),1000);
        Runnable r = () -> { 
            System.err.println("Client listening...");
            while(true){
                byte[] buffer = new byte[128];
                DatagramPacket fromServer = new DatagramPacket(buffer, buffer.length);
                try {
                    dServer.receive(fromServer);
                    System.out.println("message received " + new String(fromServer.getData()));
                } catch (IOException ex) { }
            }
        };
        new Thread(r).start();
        System.out.println("Sending message...");
        dServer.send(dPacket);
        System.out.println("Message sent");
        
    } 
}
