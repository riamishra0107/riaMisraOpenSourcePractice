import java.net.ServerSocket;
import java.net.Socket;

public class EchoServer {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//creating socket at server side 
		//also we need to have the socket object inside a try catch block
		//we will import the libraries
		//here passing the port no.
		//by doing this we r binding the server socket object to this particular port
		//whenever we use class related to socket we need to use a try catch block
		try {
		System.out.println("waiting for clients");
		ServerSocket ss= new ServerSocket(9806);
		Socket soc =ss.accept();
		System.out.println("connection established");
	}
		catch(Exception e) {
			e.printStackTrace();
			
		}

	}
}
