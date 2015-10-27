package net;
import java.net.*;
import java.io.*;
import org.apache.logging.log4j.Logger;
import org.apache.logging.log4j.LogManager;

public class TCPServer {
	static final Logger logger = LogManager.getLogger();
	static final int PORT = 8000;

	public static void main(String[] args) {
		// Crea serverSocket en el puerto especificado
		try (ServerSocket serverSocket = new ServerSocket(PORT)){
			logger.info("Socket creado en {}", serverSocket.toString());
			// Se ejecuta hasta que el programa salga
			while(true){
				logger.info("En espera de conexión.");
				// crea objeto de conexión y recursos de I/O
				try (Socket connectionSocket = serverSocket.accept();
						PrintWriter output = new PrintWriter(connectionSocket.getOutputStream(), true);
						BufferedReader input = new BufferedReader(new InputStreamReader(connectionSocket.getInputStream()));){
					// obtiene dirección y puerto del cliente
					logger.info("Nuevo cliente {}@{}. En espera de mensaje.", connectionSocket.getInetAddress(),
							connectionSocket.getPort());
					// Lee el mensaje y responde 
					String message;
					while ((message = input.readLine()) != null){
						logger.info("Mensaje del cliente: {}", message);
						if ("CLOSE".equals(message)) {
							logger.warn("El cliente solicito la terminación de conexión.");
							output.println("Cerrando conexión. Adios!");
							connectionSocket.close();
							break;
						}
						output.println("Recibido: " + message);
					}
				} catch (IOException ex){
					logger.error(ex);
				}
			}
		} catch (IOException ex){
			logger.error(ex);
		}
	}

}
