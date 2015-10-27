package net;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.*;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class TCPClient {
	static final String HOSTNAME = "localhost";
	static final int SERVER_PORT = 8000;
	static final Logger logger = LogManager.getLogger();

	public static void main(String[] args) {
		// Crea socket para comunicarse con el HOSTANE en el puerto SERVER_PORT
		try(Socket clientSocket = new Socket(HOSTNAME, SERVER_PORT)) {
			// obtiene dirección remota y local
			logger.info("Conectado a {} via {}@{}", clientSocket.getRemoteSocketAddress(),
					clientSocket.getLocalAddress(), clientSocket.getLocalPort());
			// Crea Recursos de IO
			try(PrintWriter output = new PrintWriter(clientSocket.getOutputStream(), true);
					BufferedReader input = new BufferedReader(new InputStreamReader(clientSocket.getInputStream()));
					BufferedReader userInput = new BufferedReader(new InputStreamReader(System.in))) {

				String message;
				while(true) {
					// Lee mensaje para enviar por medio de stdin
					System.out.print("Mensaje a enviar al servidor: ");
					message = userInput.readLine();
					
					// Escribe mensaje en el outputstream por medio de output
					output.println(message);
					System.out.print("Respuesta del servidor: ");

					// Lee respuesta del servidor
					String reply = input.readLine();
					System.out.println(reply);
					// Valida si se está cerrando la conexión.
					if (reply.contains("Cerrando conexión")){
						logger.warn("Cerrando la conexión.");
						clientSocket.close();
						break;
					}
				}
			}
		} catch (IOException ex){
			logger.error(ex);
		}

	}
}
