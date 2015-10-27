package net;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class TCPMultiServer {
	static final Logger logger = LogManager.getLogger();
	static final int PORT = 8000;
	static ExecutorService executor;
	
	public static void main(String[] args) {
		try (ServerSocket server = new ServerSocket(PORT)){
			// Crea el Pool de Threads
			executor = Executors.newFixedThreadPool(10);
			logger.info("En espera de conexión.");
			while(true){
				Socket client = server.accept();
				// Crea un nuevo Thread por conexión de cliente
				Runnable worker = new TCPThreadRequest(client);
				executor.execute(worker);
			}
		} catch (IOException ex){
			logger.error(ex);
		} finally {
			// Termina el executor
			if (executor != null)
				executor.shutdown();
		}
	}
}
