package cliente;


import java.net.UnknownHostException;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		conexCliente client;
		
		try {
			client = new conexCliente();
			 System.out.println("\r\nConectado a: " + client.socket.getInetAddress());
		        client.start(); 
		      
		} catch (NumberFormatException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (UnknownHostException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
        
       

	}

}
