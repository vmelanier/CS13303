package oop;

public class Triangulo extends Forma2d{  // superclase Forma2d
	private String color;
	
	public Triangulo(Double ancho, Double alto){
		super();                        // Constructor de la superclase
		this.setAlto(alto);             // Incializando variables privadas
		this.setAncho(ancho);           // con métodos de acceso
	}
	
	public double area(){
		return this.getAncho() * this.getAlto()/2; // Obteniendo variables privadas
	}
	
	public String getColor(){
		return this.color;
	}
	
	public void setColor(String color){
		this.color = color;
	}
	
	public String toString(){
		return String.format("Ancho: %s, Alto: %s, Color: %s", 
				this.getAncho(), 
				this.getAlto(), 
				this.getColor());
	}
}
