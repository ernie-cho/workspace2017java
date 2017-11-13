package udptest;

import java.net.*;
import java.io.*;
import java.lang.*;

public class UDPServer {

	public static void main(String[] args) {
		final int port = 9988;	// ��Ʈ ��ȣ�� final ������ ����
		
		try{
			DatagramSocket Data_Socket = new DatagramSocket(port);

			
			while(true){
				try{
					byte[] In_bf = new byte[512]; // �Է� �޴� ���� ���� �迭
					DatagramPacket Data_Packet = new DatagramPacket(In_bf, In_bf.length);
					Data_Socket.receive(Data_Packet); // Data_Packet�� Data_Socket�� �����Ѵ�.
					InetAddress Add = Data_Packet.getAddress();	// �ּ� Ȯ��
					int Out_port = Data_Packet.getPort();	// ��Ʈ Ȯ��
					String R_Str1 = new String(Data_Packet.getData()); //Data_Packet�� ���� �����͸� ���ڿ��� ��ȯ�Ѵ�
					String R_Str2 = new String(R_Str1.trim());			//�յ� ������ ����
					System.out.println("�ּ�:"+Add+ "  ��Ʈ ��ȣ:"+ + Out_port);
					System.out.println("���ŵ� �޽���(Client->Server): " + R_Str2);
					
					byte[] Out_bf = new byte[512];	// ���� ���� ���� �迭
					if(R_Str2.contains("��")){	// ���� ���� �߿� ���ڿ��� ���Ͽ� �ش� ���ڰ� �� ������ if�� ����.
						Out_bf = "���� ������ ��õ�Ѵ�!".getBytes();
					}
					else if(R_Str2.contains("���")){
						Out_bf = "���� ������ ����?".getBytes();
					}
					else if(R_Str2.contains("�ȳ�")){
						Out_bf = "�ݰ��� :)".getBytes();
					}
					else if(R_Str2.contains("�̸�")){
						Out_bf = "���� SERO����. ���� �̸�����?".getBytes();
					}
					else if(R_Str2.contains("����")){
						Out_bf = "���� ��ȭ�ϱ� �Ⱦ��?".getBytes();
					}
					else if(R_Str2.contains("��")){
						Out_bf = "��~".getBytes();
					}
					else if(R_Str2.contains("��")){
						Out_bf = "�׷�����".getBytes();
					}
					else if(R_Str2.contains("����")){
						Out_bf = "�� ������ ����� ~".getBytes();
					}
					else if(R_Str2.contains("����")){
						Out_bf = "���� ���ΰ� ����ھ��~".getBytes();
					}
					else if(R_Str2.contains("�н�")){
						Out_bf = "��Ƣ���� �ְ���!".getBytes();
					}
					else if(R_Str2.contains("����")){
						Out_bf = "�ݶ� �Ծ�".getBytes();
					}
					else if(R_Str2.contains("�ܹ���")){
						Out_bf = "�Ƶ����� ���".getBytes();
					}
					else if(R_Str2.contains("��")){
						Out_bf = "���̽� �̸� ��".getBytes();
					}
					else if(R_Str2.contains("���ɸ�")){
						Out_bf = "����� ���� ���ɸ��� �ְ���".getBytes();
					}
					else if(R_Str2.contains("��â")){
						Out_bf = "��â�� �ޱ����� �ְ��".getBytes();
					}
					else if(R_Str2.contains("ġŲ")){
						Out_bf = "�� ġ���ϰ�ʹ�.".getBytes();
					}
					else if(R_Str2.contains("��")){
						Out_bf = "�ߴٸ��� ������ ���ô�!".getBytes();
					}
					else{
						Out_bf = "���� ������ �߸𸣰ھ��".getBytes();
					}
					
					Data_Packet = new DatagramPacket(Out_bf, Out_bf.length, Add, Out_port);	// Ŭ���̾�Ʈ���� ������ ������ ��Ŷ
					Data_Socket.send(Data_Packet);	// Ŭ���̾�Ʈ���� ������ ��Ŷ�� ����.
					
				}catch(IOException e){}
			}
		}catch(IOException e){}
	}

}
