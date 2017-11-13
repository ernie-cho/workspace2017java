package udpclient;

import java.net.DatagramPacket;
import java.net.DatagramSocket;

public class UDPRecieverClass extends Thread{
	DatagramSocket data_Socket = null;
	//생성자
	UDPRecieverClass(DatagramSocket socket){
		this.data_Socket = socket;
	}
	
	
	// 네트워크로 데이터 받는 전용 쓰레드
	public void run(){
		try{
			//DatagramSocket data_Socket = new DatagramSocket();
			byte[] In_bf = new byte[512];
			DatagramPacket data_Packet = new DatagramPacket(In_bf, In_bf.length);
			while(true){
				this.data_Socket.receive(data_Packet);
				String R_Str1 = new String(data_Packet.getData());
				System.out.println(" ");
				System.out.println("받음 > " + R_Str1);
			}
			//while문쓰면서 close가 필요없어짐
			//this.data_Socket.close(); 
		}catch(Exception e){
			e.printStackTrace();
		}
		
	
	}
}
