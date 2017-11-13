import java.net.*; 
import java.io.*; 
import java.lang.*;

public class UDPServer {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			 DatagramSocket ds1 = new DatagramSocket(9977); 
			 byte[] bf1 = new byte[30]; 
			 DatagramPacket dp1 = new DatagramPacket(bf1, bf1.length); 
			 
			 DatagramSocket ds2 = new DatagramSocket(9978); 
			 byte[] bf2 = new byte[30]; 
			 DatagramPacket dp2 = new DatagramPacket(bf2, bf2.length); 
		
			 DatagramSocket ds3 = new DatagramSocket(9979); 
			 byte[] bf3 = new byte[30]; 
			 DatagramPacket dp3 = new DatagramPacket(bf3, bf3.length); 
			 
			 DatagramSocket ds4 = new DatagramSocket(9980); 
			 byte[] bf4 = new byte[30]; 
			 DatagramPacket dp4 = new DatagramPacket(bf4, bf4.length); 
			 
			 DatagramSocket ds5 = new DatagramSocket(9981); 
			 byte[] bf5 = new byte[30]; 
			 DatagramPacket dp5 = new DatagramPacket(bf5, bf5.length); 
			 
			 DatagramSocket ds6 = new DatagramSocket(9982); 
			 byte[] bf6 = new byte[30]; 
			 DatagramPacket dp6 = new DatagramPacket(bf6, bf6.length); 
			 
			 DatagramSocket ds7 = new DatagramSocket(9983); 
			 byte[] bf7 = new byte[30]; 
			 DatagramPacket dp7 = new DatagramPacket(bf7, bf7.length); 
			 
			 DatagramSocket ds8 = new DatagramSocket(9984); 
			 byte[] bf8 = new byte[30]; 
			 DatagramPacket dp8 = new DatagramPacket(bf8, bf8.length); 
			 
			 DatagramSocket ds9 = new DatagramSocket(9985); 
			 byte[] bf9 = new byte[30]; 
			 DatagramPacket dp9 = new DatagramPacket(bf9, bf9.length);
			 
			 DatagramSocket ds10 = new DatagramSocket(9986); 
			 byte[] bf10 = new byte[30]; 
			 DatagramPacket dp10 = new DatagramPacket(bf10, bf10.length);
			 
		 while(true) {
			 try {
			 ds1.receive(dp1); 
			 String rs1 = new String(dp1.getData()); 
			 String rs2 = new String(rs1.trim()); 
			 System.out.println("message 1(Client->Server): " + rs2); 
			 
			 ds2.receive(dp2); 
			 String rs3 = new String(dp2.getData()); 
			 String rs4 = new String(rs3.trim()); 
			 System.out.println("message 2(Client->Server): " + rs4); 
			 
			 ds3.receive(dp3); 
			 String rs5 = new String(dp3.getData()); 
			 String rs6 = new String(rs5.trim()); 
			 System.out.println("message 3(Client->Server): " + rs6); 
			 
			 ds4.receive(dp4); 
			 String rs7 = new String(dp4.getData()); 
			 String rs8 = new String(rs7.trim()); 
			 System.out.println("message 4(Client->Server): " + rs8);
			 
			 ds5.receive(dp5); 
			 String rs9 = new String(dp5.getData()); 
			 String rs10 = new String(rs9.trim()); 
			 System.out.println("message 5(Client->Server): " + rs10);
			 
			 ds6.receive(dp6); 
			 String rs11 = new String(dp6.getData()); 
			 String rs12 = new String(rs11.trim()); 
			 System.out.println("message 6(Client->Server): " + rs12);
			 
			 ds7.receive(dp7); 
			 String rs13 = new String(dp7.getData()); 
			 String rs14 = new String(rs13.trim()); 
			 System.out.println("message 7(Client->Server): " + rs14);
			 
			 ds8.receive(dp8); 
			 String rs15 = new String(dp8.getData()); 
			 String rs16 = new String(rs15.trim()); 
			 System.out.println("message 8(Client->Server): " + rs16);
			 
			 ds9.receive(dp9); 
			 String rs17 = new String(dp9.getData()); 
			 String rs18 = new String(rs17.trim()); 
			 System.out.println("message 9(Client->Server): " + rs18);
			 
			 ds10.receive(dp10); 
			 String rs19 = new String(dp10.getData()); 
			 String rs20 = new String(rs19.trim()); 
			 System.out.println("message 10(Client->Server): " + rs20);
			 
			 if(rs2.contains("hello")){
				 System.out.println("message 1 (Server) : how are you");
			 }
			 if(rs4.contains("live")){
				 System.out.println("message 2 (Server) : in Suwon");
			 }
			 if(rs6.contains("like")){
				 System.out.println("message 3 (Server) : Yes I do");
			 }
			 if(rs8.contains("music")){
				 System.out.println("message 4 (Server) : I also like music");
			 }
			 if(rs10.contains("Korean")){
				 System.out.println("message 5 (Server) : Yes I am ");
			 }
			 if(rs12.contains("name")){
				 System.out.println("message 6 (Server) : Call me Ernie ");
			 }
			 if(rs14.contains("you")){
				 System.out.println("message 7 (Server) : I love it! ");
			 }
			 if(rs16.contains("day")){
				 System.out.println("message 8 (Server) : At about 6hours ");
			 }
			 if(rs18.contains("eat")){
				 System.out.println("message 9 (Server) : I always have it ");
			 }
			 if(rs20.contains("later")){
				 System.out.println("message 10 (Server) : Okay, Goodbye ");
			 }
			 
	 
			 return ;
			 
			 }
			 catch(IOException e){
				 
			 }	 
		 }	
	   } catch(IOException e){
			 
		 }		
	}

	

}