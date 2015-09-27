package cloud;

class NetworkCard {
	static final int MAX_SPEED_MB = 100;
	int speedMb;                        
	String macAddress;                  
	String network;                     
	int unitNumber = 0;                 
	String label = "Network Card ";     
	
	void setUnit(int unit){
		this.unitNumber = unit;
		String label = this.label + unit;
		this.label = label;
	}
}
