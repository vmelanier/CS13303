package cloud;

public class Main {
	// Método principal
	public static void main(String[] args) {
		
		VirtualMachine vm1 = new VirtualMachine();
		// Asignando valores a variables de vm1
		vm1.name = "vm1";
		vm1.id = 1;
		vm1.cpuCount = 1;
		vm1.memoryGB = 2;
		vm1.guestOS = "MacOSX";
		vm1.powerOn();
		
		// Creando tarjetas de red para la vm1
		NetworkCard nic1 = new NetworkCard();
		nic1.network = "192.168.1.0";
		nic1.macAddress = "64-D9-2C-A1-BD-B5";
		nic1.speedMb = 100;
		nic1.setUnit(1);
		
		NetworkCard nic2 = new NetworkCard();
		nic2.network = "192.168.1.0";
		nic2.macAddress = "5D-E1-5E-B1-9A-DB";
		nic2.speedMb = 100;     
		nic2.setUnit(2);

		/*
		 * Agregando NICs a vm1
		 * como varargs 
		 * */
		vm1.addNICs(nic1, nic2);
		
		// Imprimiendo variables de instancia de vm1
		printVMInfo(vm1);
		
	}
	public static void printVMInfo(VirtualMachine vm){
		System.out.println("Name    : " + vm.name);
		System.out.println("ID      : " + vm.id);
		System.out.println("Memory  : " + vm.memoryGB);
		System.out.println("CPU     : " + vm.cpuCount);
		System.out.println("Guest OS: " + vm.guestOS);
		System.out.println("Status  : " + (vm.powerStatus ? "On" : "Off"));
		System.out.println("NICs    : " + vm.nics);
		System.out.println("");
	}
}
