package oop;

class CalcTiempoDescarga {
	static final double VELOCIDAD_DEFAULT = 1.0d;
	double velocidadMbps;		
	double tiempo;
	
	public CalcTiempoDescarga(){
		this.velocidadMbps = VELOCIDAD_DEFAULT;
	}
	
	public CalcTiempoDescarga(double velocidadMbps){
		this.velocidadMbps = velocidadMbps;
	}
	
	// Método sobrecargado
    public void calculaTiempo(double tamanoMB){            
    	double velocidadMBps = this.velocidadMbps/8;
    	this.tiempo = tamanoMB / velocidadMBps;
    	}

    // Método sobrecargado
	public void calculaTiempo(double velocidadMbps, double tamanoMB){
		double velocidadMBps = velocidadMbps/8;     
		this.tiempo = tamanoMB / velocidadMBps;
		}
}