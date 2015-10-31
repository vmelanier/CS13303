package lambda;

public class AnonClassDemo1 {
	// Interfaz Call Home
	interface CallHome {
		public void call();
		public void callOtherHome(String number);
	}
	
	public void callHome(){
		
		class CallHomeMexico implements CallHome{
			String number = "+521234567890";
			public void call(){
				callOtherHome(number);}	
			public void callOtherHome(String number){
				System.out.println("Dialing " + number);
			}
		}
		
		// inicio clase anónima CallHomeCananda
		CallHome callHomeCanada = new CallHome(){
			String number = "+11234567890";
			public void call(){
				callOtherHome(number);}	
			public void callOtherHome(String number){
				System.out.println("Dialing " + number);
			}
		};

		CallHome callHomeMexico = new CallHomeMexico();
		
		callHomeMexico.call();
		callHomeCanada.call();
		callHomeCanada.callOtherHome("+10987654321");
	}
	
	public static void main(String[] args) {
		AnonClassDemo1 anon1 = new AnonClassDemo1();
		anon1.callHome();
	}

}
