package cloud;

import cloud.util.CloudUtil;

public class Main {
	// Método principal
	public static void main(String[] args) {
		if (args.length > 1){
			// Creando objetos NetworkCard
			// asumiendo que los argumentos de entrada
			// son dos redes con mascara de red 0.0.0.0/24
			NetworkCard nic1 = new NetworkCard(args[0], 1);
			NetworkCard nic2 = new NetworkCard(args[1], 2, 1000);
			
			//Imprimiendo nic1, nic2 y nic3
			CloudUtil.printNICInfo(nic1);
			CloudUtil.printNICInfo(nic2);
		} else {
			System.out.println("Al menos un argumento es necesario.");
			System.out.println("java -jar Cloud.jar \"red1/mascara1\" \"red2/mascara2\"");
		}
	}
	

}
