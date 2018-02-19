package socket;
import java.net.*;
import java.io.*;
public class conex {
	
	final int puerto =5000;
	ServerSocket sc;
	Socket so;
	DataOutputStream salida;
	String mensajeR;
	String mensajeRecibido;


	public void initServer(){
		BufferedReader entrada;
		try{
			sc = new ServerSocket(puerto);
			so= new Socket();
			System.out.println("Esperando Conexion: \n");
			so = sc.accept();
			System.out.println("Un cliente se ha conectado.\n");
			
			entrada = new BufferedReader(new InputStreamReader(so.getInputStream()));
			salida = new DataOutputStream(so.getOutputStream());
			System.out.println("Confirmando conexion al cliente....\n");
			salida.writeUTF("Conexion exitosa... hola escribe un saludo \n");
			
			///recibir el mensaje
			mensajeRecibido = entrada.readLine();
			System.out.println(mensajeRecibido);
			salida.writeUTF("Se recibio tu mensaje.n Terminando conexion...");
			salida.writeUTF("Gracias por conectarte, adios!");
			sc.close();

		}catch(Exception e){
			System.out.println("Error: "+e.getMessage());
		}
	}
}
