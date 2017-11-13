/*import java.net.*; 
import java.io.*; 

class Jv_11_2_TCPClient { 
public static void main(String args[]) { 
	try { 
	Socket s1; 
	InputStream is1; 
	DataInputStream is2; 
	OutputStream os1; 
	DataOutputStream os2; 
	
	String sendString = "TCP client "; 
	s1 = new Socket("172.20.30.214", 5433); 
	is1 = s1.getInputStream(); 
	is2 = new DataInputStream(is1); 
	String st = new String(is2.readUTF()); 
	System.out.println(st); 
	os1 = s1.getOutputStream(); 
	os2 = new DataOutputStream(os1); 
	os2.writeUTF(sendString); 
	
	st = new String(is2.readUTF());
	System.out.println(st);
	
	
	
	os2.close(); 
	os1.close(); 
	is2.close(); 
	is2.close(); 
	s1.close(); 
	} catch(ConnectException connExc) { 
	System.err.println("서버 연결 실패"); 
	} 
	catch(IOException e) {e.printStackTrace();} 
	
    } 
 }

*/

