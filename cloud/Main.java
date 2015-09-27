package cloud;

public class Main {
	// Método principal
	public static void main(String[] args) {
		// Creando objetos NetworkCard
		NetworkCard nic1 = new NetworkCard(1);
		NetworkCard nic2 = new NetworkCard("192.168.1.0/24", 2);
		NetworkCard nic3 = new NetworkCard("192.168.0.0/24", 3, 1000);
		
		//Imprimiendo nic1, nic2 y nic3
		printNICInfo(nic1);
		printNICInfo(nic2);
		printNICInfo(nic3);
	}
	
	public static void printNICInfo(NetworkCard nic){
		System.out.println("MAC Address: " + nic.macAddress);
		System.out.println("Speed      : " + nic.speedMb +" " + (nic.speedMb <= NetworkCard.MAX_SPEED_MB? "OK": "ERR"));
		System.out.println("Network    : " + nic.network);
		System.out.println("Label      : " + nic.label);
		System.out.println("");
	}
}
