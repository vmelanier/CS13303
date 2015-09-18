/**
 * Esta clase permite calcular el <b><u>Tiempo de descarga</u></b> por
 * medio de las siguientes intradas:
 * <ul>
 * <li>velocidadMbps</li>
 * <li>tamanoMB</li>
 * </ul>
 *
 * @see java.lang.Object
 * @author JM Lopez
 * @version 1.0
 *
 */
public class CalcTiempoDescarga {
        // variables declaradas
        double tamanoMB;
        double velocidadMbps;

        public CalcTiempoDescarga(double tamanoMB, double velocidadMbps) {
                this.tamanoMB = tamanoMB;
                this.velocidadMbps = velocidadMbps;
        }

        // Calcular Tiempo
        public double calculaTiempo(){
                // convertir Mbps a MBps
                double velocidadMBps = velocidadMbps/8;                         /* 1 Byte = 8 bits */
                return tamanoMB / velocidadMBps;
        }

        // Método principal
        public static void main(String[] args){
                /*
                 * Telmex infinitum Velocidad de
                 * descarga promedio: 2.1 Mbps (268 kB/s)
                 *
                 */
                double tamanoMB = 1024;
                double velocidadMbps = 2.1;

                // Crear un objeto calculadora de tipo CalcTiempoDescarga
                CalcTiempoDescarga calc = new CalcTiempoDescarga(tamanoMB, velocidadMbps);
                double tiempoSeg = calc.calculaTiempo();

                // Imprimir resultados en pantalla
                System.out.println("Tu descarga de "+ tamanoMB + " MB estará lista en " +
                                                        tiempoSeg + " segundos.");
                System.out.println("Tu descarga de "+ tamanoMB + " MB estará lista en " +
                                                        tiempoSeg/60 + " minutos.");
                System.out.println("Tu descarga de "+ tamanoMB + " MB estará lista en " +
                                                        tiempoSeg/3600 + " horas.");
        }
}
