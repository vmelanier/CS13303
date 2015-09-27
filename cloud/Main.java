package cloud;

public class Main {
	// Método principal
	public static void main(String[] args) {
		
		// Creando tarjetas de red para la vm1
		NetworkCard nic1 = new NetworkCard();
		nic1.network = "192.168.1.0";
		nic1.macAddress = "64-D9-2C-A1-BD-B5";
		nic1.speedMb = 100;
		nic1.setUnit(1);

		// Imprimiendo variables de instancia
		printNICInfo(nic1);
		
		NetworkCard nic2 = new NetworkCard();
		nic2.network = "192.168.1.0";
		nic2.macAddress = "5D-E1-5E-B1-9A-DB";
		nic2.speedMb = 1000;     // 1000 Mb Full duplex
		nic2.setUnit(2);

		// Imprimiendo variables de instancia		
		printNICInfo(nic2);
		
	}
	public static void printNICInfo(NetworkCard nic){
		System.out.println("MAC Address: " + nic.macAddress);
		System.out.println("Speed      : " + nic.speedMb +" " + (nic.speedMb <= NetworkCard.maxSpeedMb? "OK": "ERR"));
		System.out.println("Network    : " + nic.network);
		System.out.println("Label      : " + nic.label);
		System.out.println("");
	}
}
