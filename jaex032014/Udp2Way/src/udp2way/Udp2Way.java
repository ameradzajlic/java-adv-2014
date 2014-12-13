package udp2way; 
import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.SocketException;
import java.util.ArrayList;
import java.util.List;
public class Udp2Way {
    static List<InetAddress> clients;
    static DatagramSocket dServer;
    static void broadcast(String msg) throws IOException{
        System.out.println("Broadcasting " + msg);
        DatagramPacket packet = new DatagramPacket(msg.getBytes(), msg.getBytes().length, null, 1001);
        for(InetAddress client : clients){
              packet.setAddress(client);
              dServer.send(packet);
        }
    }
    public static void main(String[] args) throws SocketException, IOException {
        dServer = new DatagramSocket(1000);
        clients = new ArrayList<>();
        byte[] buffer = new byte[128];
        DatagramPacket dPacket = new DatagramPacket(buffer, buffer.length); 
                System.out.println("Server is listening..."); 
                while(true){
                        dServer.receive(dPacket); 
                        if(!clients.contains(dPacket.getAddress())){
                            clients.add(dPacket.getAddress());
                        }
                        System.out.println("Package received: ");
                        String data = new String(dPacket.getData(),0,dPacket.getLength());
                        System.out.println(data);
                        broadcast("Someone said: " + data);
                }
            }  
}
