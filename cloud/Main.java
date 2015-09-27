package cloud;

import cloud.util.CloudUtil;

public class Main {
	// Método principal
	public static void main(String[] args) {
		// Creando una instancia de CloudUtil
		CloudUtil cloudUtil = new CloudUtil();
		
		// Creando tarjetas de red para la vm1
		NetworkCard nic1 = new NetworkCard();
		nic1.network = "192.168.1.0";
		nic1.macAddress = cloudUtil.getMACAddress();
		nic1.speedMb = 100;
		nic1.setUnit(1);
		
		NetworkCard nic2 = new NetworkCard();
		nic2.network = "192.168.1.0";
		nic2.macAddress = CloudUtil.getMACAddress();
		nic2.speedMb = 100;     
		nic2.setUnit(2);
		
		//Imprimiendo nic1 y nic2
		printNICInfo(nic1);
		printNICInfo(nic2);
	}
	
	public static void printNICInfo(NetworkCard nic){
		System.out.println("MAC Address: " + nic.macAddress);
		System.out.println("Speed      : " + nic.speedMb +" " + (nic.speedMb <= NetworkCard.MAX_SPEED_MB? "OK": "ERR"));
		System.out.println("Network    : " + nic.network);
		System.out.println("Label      : " + nic.label);
		System.out.println("");
	}
}
