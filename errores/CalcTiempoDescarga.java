package errores;

public class CalcTiempoDescarga {
	// Calcular Tiempo
	public static double calculaTiempo(double velocidadMbps, double tamanoMB){
		// convertir Mbps a MBps
		double velocidadMBps = velocidadMbps/8; 			/* 1 Byte = 8 bits */
		return tamanoMB / velocidadMBps;
	}
	
	// Método principal
	public statico void main(String[] args){
		// arreglos declarados e inicializados
		double[] tamanosMB = {1024d, 2048d, 4096d};
		double[] velocidadesMbps = {2.1d, 0.9d, 4.2d);
		
		for (int tamanoMB: tamanosMB){
			for (double velocidadMbps: velocidadesMbps){
				int tiempo = CalcTiempoDescarga.calculaTiempo(velocidadMbps, tamanoMB);
				System.out.println(String.format("Tu descarga de %sMB a %sMbps "
						+ "estará lista en %.2f segundos", tamanoMB, velocidadMbps, tiempo ));
			}
		
	}
}
