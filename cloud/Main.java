package cloud;

public class Main {
	// Método principal
	public static void main(String[] args) {
		/* Nuevos objetos son creados con la palabra clave: new
		 * Asignando un objeto a una variable del mismo tipo. 
		 */
		VirtualMachine vm1 = new VirtualMachine();
		VirtualMachine vm2 = new VirtualMachine();
		/* Al realizar new VirtualMachine(), se está invocando 
		 * a un método especial, llamado Constructor que en este
		 * caso no cuenta con argumentos de entrada.
		 */
		
		// Asignando valores a variables de vm1
		vm1.name = "vm1";
		vm1.id = 1;
		vm1.cpuCount = 1;
		vm1.memoryGB = 2;
		vm1.guestOS = "MacOSX";
		vm1.powerOn();
		
		// Imprimir atributos del objeto vm1
		printVMInfo(vm1);

		// Asignando valores a variables de vm2
		vm2.name = "vm2";
		vm2.id = 2;
		vm2.cpuCount = 3;
		vm2.memoryGB = 4;
		vm2.guestOS = "Windows10";
		vm2.powerOff();
		
		// Imprimir atributos del objeto vm2
		printVMInfo(vm2);		
	}
	
	public static void printVMInfo(VirtualMachine vm){
		/*
		 * Método para imprimir atributos de variables 
		 * almacenadas en VirutalMachine
		 */
		System.out.println("Name    : " + vm.name);
		System.out.println("ID      : " + vm.id);
		System.out.println("Memory  : " + vm.memoryGB);
		System.out.println("CPU     : " + vm.cpuCount);
		System.out.println("Guest OS: " + vm.guestOS);
		System.out.println("Status  : " + vm.powerStatus);
		System.out.println("");
	}
}
