package cliente;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.net.Socket;

public class conexCliente {
	
	final String HOST = "localhost";
	final int puerto =5000;
	Socket sc;
	DataOutputStream mensaje;
	DataInputStream entrada;
	public void iniCliente(){
		try{
			sc = new Socket( HOST , puerto );
			mensaje = new DataOutputStream(sc.getOutputStream());
			mensaje.writeUTF("hola que tal!!");
			sc.close();



		}catch(Exception e){
			System.out.println("Error: "+e.getMessage());
		}
	}

}
