import java.net.*; 
import java.io.*; 

public class mainUDP {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try{	
			DatagramSocket ds1 = new DatagramSocket(); 
			InetAddress ia1 = InetAddress.getByName("localhost"); 
			DatagramSocket ds2 = new DatagramSocket(); 
			InetAddress ia2 = InetAddress.getByName("localhost");
			DatagramSocket ds3 = new DatagramSocket(); 
			InetAddress ia3 = InetAddress.getByName("localhost");
			DatagramSocket ds4 = new DatagramSocket(); 
			InetAddress ia4 = InetAddress.getByName("localhost");
			DatagramSocket ds5 = new DatagramSocket(); 
			InetAddress ia5 = InetAddress.getByName("localhost");
			DatagramSocket ds6 = new DatagramSocket(); 
			InetAddress ia6 = InetAddress.getByName("localhost");
			DatagramSocket ds7 = new DatagramSocket(); 
			InetAddress ia7 = InetAddress.getByName("localhost");
			DatagramSocket ds8 = new DatagramSocket(); 
			InetAddress ia8 = InetAddress.getByName("localhost");
			DatagramSocket ds9 = new DatagramSocket(); 
			InetAddress ia9 = InetAddress.getByName("localhost");
			DatagramSocket ds10 = new DatagramSocket(); 
			InetAddress ia10 = InetAddress.getByName("localhost");
			
			String msg1 = "hello"; 
			String msg2 = "where do you live?"; 
			String msg3 = "like programming?";
			String msg4 = "what about music";
			String msg5 = "Are you Korean?";
			String msg6 = "What's your name?";
			String msg7 = "Do you like sleeping?";
			String msg8 = "How long do you sleep per day?";
			String msg9 = "Do you eat breakfast?";
			String msg10 = "See you later";
			
			byte[] bf1 = msg1.getBytes(); 
			byte[] bf2 = msg2.getBytes();
			byte[] bf3 = msg3.getBytes();
			byte[] bf4 = msg4.getBytes();
			byte[] bf5 = msg5.getBytes();
			byte[] bf6 = msg6.getBytes();
			byte[] bf7 = msg7.getBytes();
			byte[] bf8 = msg8.getBytes();
			byte[] bf9 = msg9.getBytes();
			byte[] bf10 = msg10.getBytes();
			
			DatagramPacket dp1 = new DatagramPacket(bf1, bf1.length, ia1, 9977);
			DatagramPacket dp2 = new DatagramPacket(bf2, bf2.length, ia2, 9978);
			DatagramPacket dp3 = new DatagramPacket(bf3, bf3.length, ia3, 9979);
			DatagramPacket dp4 = new DatagramPacket(bf4, bf4.length, ia4, 9980);
			DatagramPacket dp5 = new DatagramPacket(bf5, bf5.length, ia5, 9981);
			DatagramPacket dp6 = new DatagramPacket(bf6, bf6.length, ia6, 9982);
			DatagramPacket dp7 = new DatagramPacket(bf7, bf7.length, ia7, 9983);
			DatagramPacket dp8 = new DatagramPacket(bf8, bf8.length, ia8, 9984);
			DatagramPacket dp9 = new DatagramPacket(bf9, bf9.length, ia9, 9985);
			DatagramPacket dp10 = new DatagramPacket(bf10, bf10.length, ia10, 9986);
			
			ds1.send(dp1); 
			ds2.send(dp2);  
			ds3.send(dp3);
			ds4.send(dp4);
			ds5.send(dp5);
			ds6.send(dp6);
			ds7.send(dp7);
			ds8.send(dp8);
			ds9.send(dp9);
			ds10.send(dp10);
		}
		catch(Exception e){ 
			System.out.println(e);
			}
		

		
	}

}
