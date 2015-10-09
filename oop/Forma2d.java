package oop;

public class Forma2d extends Forma{
	private String tipo;
	
	public Forma2d(String color){
		super(color);
	}

	@Override
	public double area() {
		return 0;
	}
	// Getters and Setters
	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
}
