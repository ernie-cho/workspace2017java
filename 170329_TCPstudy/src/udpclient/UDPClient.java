package udpclient;

import java.net.*;
import java.util.Scanner;
import java.io.*;

public class UDPClient {

	public static void main(String[] args) {
		Scanner myin = new Scanner(System.in);
		
		//������ ����� ip, ��Ʈ ��ȣ�� �Է� ����.
		//System.out.println("������ ����� ip �ּҸ� �Է��ϼ��� :");
		//String ip = myin.nextLine();
		//System.out.println("������ ��Ʈ�� �Է��ϼ��� :");
		//int port = myin.nextInt();
		//myin.nextLine();
		String ip = "localhost";
		int port = 9988;
		
		try{
			//����, �ּ�
			DatagramSocket data_Socket = new DatagramSocket();
			InetAddress ia = InetAddress.getByName(ip);
			//Thread 
			UDPRecieverClass uc = new UDPRecieverClass(data_Socket); 
			uc.start();
			
			
			while(true){
			System.out.println(" ");
			System.out.print("�Է� >");
			//���� ������ �Է� ����
			String input = myin.nextLine();
			byte[] Out_bf = new byte[512];
			Out_bf = input.getBytes(); 
			
			//��������Ŷ ����
			DatagramPacket Data_Packet = new DatagramPacket(Out_bf, Out_bf.length, ia, port);
			//Data_Packet ������ ������.
			data_Socket.send(Data_Packet);
			Data_Packet = new DatagramPacket(Out_bf, Out_bf.length);
			/*
			//�����κ��� ������ ���� ����
			byte[] In_bf = new byte[512];
			Data_Packet = new DatagramPacket(In_bf, In_bf.length, ia, port);
			Data_Socket.receive(Data_Packet);
			
			//���� ���� ������ ���.
			String str = new String(Data_Packet.getData());
			System.out.println("���� : "+str);
			*/
			}
			//data_Socket.close();
		}catch(Exception e){
			System.out.println(e);
		}
	}

}
