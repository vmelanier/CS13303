package cloud;

class NetworkCard { 	// Inicio de Scope Clase
	static final int MAX_SPEED_MB = 100;
	// Variables de instancia
	int speedMb;                        
	String macAddress;                  
	String network;                     
	int unitNumber = 0;                 
	String label = "Network Card ";     
	
	void setUnit(int unit){		// Inicio de Scope Método
		this.unitNumber = unit;
		String label = this.label + unit;	// Variable local
		this.label = label;
	}						   // Fin de Scope Método
}						// Fin de Scope Clase
