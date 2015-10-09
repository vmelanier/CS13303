package oop;

public class Forma2d extends Forma implements Cuantificable{
	private String tipo;
	
	public Forma2d(String color){
		super(color);
	}

	// Getters and Setters
	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	@Override
	public double calculaPerimetro() {
		return 0;
	}

	@Override
	public double calculaArea() {
		return 0;
	}
}
