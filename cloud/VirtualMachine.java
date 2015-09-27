package cloud;

class VirtualMachine {
	int id;                  // Identificador único
	int cpuCount;            // Número de CPU
	long memoryGB;           // Memoria en GB
	boolean powerStatus;     // Estado
	String name;             // Nombre
	String guestOS;          // Sistema Operativo
	NetworkCard[] nics;      // Tarjetas de Red Virtuales
	
	boolean isPoweredOn() {
		/* Validar si la VM está prendida */
		return (this.powerStatus ? true : false);
		}
	
	int numberOfCPUs() {
		/* Obtener el número de CPUs de la VM */
		return this.cpuCount;
		}
	
	void powerOn() {
		/* Encender la VM */
		this.powerStatus = true;
		}
	
	void powerOff() {
		/* Apagar la VM */
		this.powerStatus = false;
		}
	
	void setName(String name) {
		/* Asignar nombre a la VM */
		this.name = name;
		}
	
	void addNICs(NetworkCard ... nics) {
		/* Asignar NICs a la VM */
		this.nics = nics;
		}
}
