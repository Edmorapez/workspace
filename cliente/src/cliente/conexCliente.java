package cliente;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;
import java.util.Scanner;

public class conexCliente {
	Socket socket;
    private Scanner scanner;
    conexCliente() throws Exception {
        this.socket = new Socket("192.168.1.33", 5000);
        this.scanner = new Scanner(System.in);
    }
   
     void start() throws IOException {
        String input;
        String mensajeR;
        BufferedReader entrada = new BufferedReader(new InputStreamReader(socket.getInputStream()));
        mensajeR=entrada.readLine();
 	    System.out.println("\r\nMensaje del servidor " + socket.getLocalAddress() + ": " + mensajeR);
 	    
        while (true) {
            input = scanner.nextLine();
            PrintWriter out = new PrintWriter(this.socket.getOutputStream(), true);
            out.println(input);
            out.flush();
          
        	   mensajeR=entrada.readLine();
        	   System.out.println("\r\nMensaje del servidor " + socket.getLocalAddress() + ": " + mensajeR);
           
        }
    }   

}
