package udpclient;

import java.net.DatagramPacket;
import java.net.DatagramSocket;

public class UDPRecieverClass extends Thread{
	DatagramSocket data_Socket = null;
	//������
	UDPRecieverClass(DatagramSocket socket){
		this.data_Socket = socket;
	}
	
	
	// ��Ʈ��ũ�� ������ �޴� ���� ������
	public void run(){
		try{
			//DatagramSocket data_Socket = new DatagramSocket();
			byte[] In_bf = new byte[512];
			DatagramPacket data_Packet = new DatagramPacket(In_bf, In_bf.length);
			while(true){
				this.data_Socket.receive(data_Packet);
				String R_Str1 = new String(data_Packet.getData());
				System.out.println(" ");
				System.out.println("���� > " + R_Str1);
			}
			//while�����鼭 close�� �ʿ������
			//this.data_Socket.close(); 
		}catch(Exception e){
			e.printStackTrace();
		}
		
	
	}
}
