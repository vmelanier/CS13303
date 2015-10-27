package net;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class TCPThreadRequest implements Runnable {
	static final Logger logger = LogManager.getLogger();
	private final Socket client;
	ServerSocket serverSocket = null;
	
	// Constructor es necesario para crear un Thread
	public TCPThreadRequest(Socket client){
		this.client = client;
	}

	@Override
	public void run() {
		logger.info("En espera de conexión.");
		// crea objeto de conexión y recursos de I/O
		try (PrintWriter output = new PrintWriter(client.getOutputStream(), true);
				BufferedReader input = new BufferedReader(new InputStreamReader(client.getInputStream()));){
			// obtiene dirección y puerto del cliente
			logger.info("Nuevo cliente {}@{}. En espera de mensaje.", client.getInetAddress(),
					client.getPort());
			// Lee el mensaje y responde 
			String message;
			while ((message = input.readLine()) != null){
				logger.info("Mensaje del cliente {}@{}: {}", client.getInetAddress(), client.getPort(),message);
				if ("CLOSE".equals(message)) {
					logger.warn("El cliente solicito la terminación de conexión.");
					output.println("Cerrando conexión. Adios!");
					client.close();
					break;
				}
				output.println("Recibido: " + message);
			}
		} catch (IOException ex){
			logger.error(ex);
		}
	}
}
