import java.net.Socket;
import java.net.ServerSocket;

public class EchoClient {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//creating socket at client side
		//passing two parameter .first parameter is ip address
		//and the second parameter is the port number
		//ip address here is local host and i.e because both client and server r on same machine
		//so we  just  eed to enter the ip address of our system i.e local host
		try {
			System.out.println("client started");
			Socket soc =new Socket("localhost", 9806);
			
		}
		catch(Exception e) {
			
			e.printStackTrace();	
		}
		
	

	}

}
