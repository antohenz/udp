import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;


public class DnsTest {

	public static void main(String[] args) throws IOException {
		DatagramSocket socket = new DatagramSocket(10010);
		
		byte[] message = "test".getBytes();
		int port = 13;
		
		InetAddress address = InetAddress.getByName("64.90.182.55");
		DatagramPacket packet = new DatagramPacket(message, message.length, address, port);
		socket.send(packet);

		System.out.println("done");
		System.out.println(address);
	}

}
