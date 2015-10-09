package oop;

public class Triangulo extends Forma2d{  
	private double ancho;
	private double alto;
	
	public Triangulo(String color){
		super(color);
	}
	
	public Triangulo(String color, Double ancho, Double alto){
		super(color);                        
		this.setAlto(alto);             
		this.setAncho(ancho);           
	}
	
	@Override
	public double area(){
		return this.getAncho() * this.getAlto()/2; 
	}
	
	@Override
	public String toString(){
		return String.format("Ancho: %s, Alto: %s, Color: %s, Tipo: %s", 
				this.getAncho(), 
				this.getAlto(), 
				this.getColor(),
				this.getTipo());
	}
	
	// Getters and Setters
	public double getAncho() {
		return ancho;
	}
	public void setAncho(double ancho) {
		this.ancho = ancho;
	}
	public double getAlto() {
		return alto;
	}
	public void setAlto(double alto) {
		this.alto = alto;
	}
}
