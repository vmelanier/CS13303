package cloud.util;

import java.util.Random;

import cloud.NetworkCard;

public class CloudUtil {
    static int macElements = 6;
    
	public static String getMACAddress(){
		/* Método para generar MAC addresses
		 * aleatorias con fines educativos
		 * Basado en método por Phate en 
		 * Stack Overflow
		 * */
	    Random random = new Random();
	    byte[] macAddress = new byte[macElements];

	    // Generar bytes aleatorios
	    random.nextBytes(macAddress);
	    
	    // Crear un StringBuilder de 18 elementos
	    // 64-D9-2C-A1-BD-B5
	    StringBuilder mac = new StringBuilder(18);

	    // Generar MAC Address basado en la generación
	    // aleatoria
    	int i = 0;
	    for(byte b : macAddress){
	    	mac.append(String.format("%02x%s", b, (mac.length() >= 0 && i < macElements -1 ? ":" : "")));
	    	i++;
	    }

	    // Regresar la dirección MAC en mayúsculas
	    return mac.toString().toUpperCase();
	}
	public static void printNICInfo(NetworkCard nic){
		System.out.println("MAC Address: " + nic.macAddress);
		System.out.println("Speed      : " + nic.speedMb +" " + (nic.speedMb <= NetworkCard.MAX_SPEED_MB? "OK": "ERR"));
		System.out.println("Network    : " + nic.network);
		System.out.println("Label      : " + nic.label);
		System.out.println("");
	}
}
