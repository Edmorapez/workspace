package socket;
import java.net.*;
import java.util.Scanner;
import java.io.*;
public class conex {
	
	final int puerto =5000;
	ServerSocket sc;
	Socket so;
	DataOutputStream salida;
	String mensajeR;
	String mensajeRecibido;
	Scanner scanner;


	public void initServer(){
		BufferedReader entrada;
		scanner = new Scanner(System.in);
		String input;
		int contador=0;
		try{
			sc = new ServerSocket(puerto,100);
			so= new Socket();
			System.out.println("Esperando Conexion: \n");
			so = sc.accept();
			contador++;
			System.out.println("Un cliente se ha conectado.\n"+contador);
			
			   PrintWriter out = new PrintWriter(this.so.getOutputStream(), true);
			    out.println("hola usuario: escribe un mensaje ");
	            out.flush();
	            
			entrada = new BufferedReader(new InputStreamReader(so.getInputStream()));
			
			System.out.println("Confirmando conexion al cliente....\n");
			
			while((mensajeR=entrada.readLine())!=null){
				System.out.println("\r\nMensage de " + so.getLocalAddress() + ": " + mensajeR);
				 input = scanner.nextLine();				
		            out.println(input);
		            out.flush();								
			}

		}catch(Exception e){
			System.out.println("Error: "+e.getMessage());
		}
	}
}
