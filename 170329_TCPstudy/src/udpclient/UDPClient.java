package udpclient;

import java.net.*;
import java.util.Scanner;
import java.io.*;

public class UDPClient {

	public static void main(String[] args) {
		Scanner myin = new Scanner(System.in);
		
		//연결할 대상의 ip, 포트 번호를 입력 받음.
		//System.out.println("연결할 대상의 ip 주소를 입력하세요 :");
		//String ip = myin.nextLine();
		//System.out.println("연결할 포트를 입력하세요 :");
		//int port = myin.nextInt();
		//myin.nextLine();
		String ip = "localhost";
		int port = 9988;
		
		try{
			//소켓, 주소
			DatagramSocket data_Socket = new DatagramSocket();
			InetAddress ia = InetAddress.getByName(ip);
			//Thread 
			UDPRecieverClass uc = new UDPRecieverClass(data_Socket); 
			uc.start();
			
			
			while(true){
			System.out.println(" ");
			System.out.print("입력 >");
			//보낼 내용을 입력 받음
			String input = myin.nextLine();
			byte[] Out_bf = new byte[512];
			Out_bf = input.getBytes(); 
			
			//데이터페킷 선언
			DatagramPacket Data_Packet = new DatagramPacket(Out_bf, Out_bf.length, ia, port);
			//Data_Packet 내용을 전송함.
			data_Socket.send(Data_Packet);
			Data_Packet = new DatagramPacket(Out_bf, Out_bf.length);
			/*
			//서버로부터 내용을 전송 받음
			byte[] In_bf = new byte[512];
			Data_Packet = new DatagramPacket(In_bf, In_bf.length, ia, port);
			Data_Socket.receive(Data_Packet);
			
			//전송 받은 내용을 출력.
			String str = new String(Data_Packet.getData());
			System.out.println("수신 : "+str);
			*/
			}
			//data_Socket.close();
		}catch(Exception e){
			System.out.println(e);
		}
	}

}
