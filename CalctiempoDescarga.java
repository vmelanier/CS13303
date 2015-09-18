
public class CalcTiempoDescarga {
	// Calcular Tiempo
	public double calculaTiempo(double velocidadMbps, double tamanoMB){
		// convertir Mbps a MBps
		double velocidadMBps = velocidadMbps/8; 			/* 1 Byte = 8 bits */
		return tamanoMB / velocidadMBps;
	}
	
	// Método principal
	public static void main(String[] args){
		// arreglos declarados e inicializados
		double[] tamanosMB = {1024d, 2048d, 4096d};
		double[] velocidadesMbps = {2.1d, 0.9d, 4.2d};
		
		// Crear un objeto calculadora de tipo CalcTiempoDescarga
		CalcTiempoDescarga calc = new CalcTiempoDescarga();
		
		// Calcular tiempo de descarga del tamaño[0] a la velocidad[0]
		// mediante el método calculaTiempo
		System.out.println("Tu descarga de "+ tamanosMB[0] 
				+ "MB a " + velocidadesMbps[0] 
				+ "Mbps estará lista en " + calc.calculaTiempo(velocidadesMbps[0], tamanosMB[0]) 
				+ " segundos.");

		// Calcular tiempo de descarga del tamaño[1] a la velocidad[1]
		// mediante el método calculaTiempo
		System.out.println("Tu descarga de "+ tamanosMB[1] 
				+ "MB a " + velocidadesMbps[1] 
				+ "Mbps estará lista en " + calc.calculaTiempo(velocidadesMbps[1], tamanosMB[1]) 
				+ " segundos.");

		// Calcular tiempo de descarga del tamaño[2] a la velocidad[2]
		// mediante el método calculaTiempo
		System.out.println("Tu descarga de "+ tamanosMB[2] 
				+ "MB a " + velocidadesMbps[2] 
				+ "Mbps estará lista en " + calc.calculaTiempo(velocidadesMbps[2], tamanosMB[2]) 
				+ " segundos.");
	}
}

