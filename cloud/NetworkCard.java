package cloud;

import cloud.util.CloudUtil;

class NetworkCard {
	static final int MAX_SPEED_MB = 100;            
	final String macAddress;            
	final int unitNumber;  
	final String label;
	int speedMb = MAX_SPEED_MB;
	String network;                                         

	NetworkCard(int unitNumber){
		this.unitNumber = unitNumber;
		this.label = "Network Card " + unitNumber;
		this.macAddress = CloudUtil.getMACAddress();
	}
	
	NetworkCard(String network, int unitNumber){
		this.network = network;
		this.unitNumber = unitNumber;
		this.label = "Network Card " + unitNumber;
		this.macAddress = CloudUtil.getMACAddress();
	}
	NetworkCard(String network, int unitNumber, int speedMb){
		this.network = network;
		this.unitNumber = unitNumber;
		this.speedMb = speedMb;
		this.label = "Network Card " + unitNumber;
		this.macAddress = CloudUtil.getMACAddress();
	}
}
