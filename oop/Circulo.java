package oop;

public class Circulo extends Forma2d{
	private double radio;
	private final double PI = Math.PI;
	private double area;
	
	public Circulo(String color) {
		super(color);
	}
	
	public Circulo(String color, double radio) {
		super(color);
		this.setRadio(radio);
		this.area();
	}
	
	@Override
	public double area(){
		this.area = PI * Math.pow(this.getRadio(), 2);
		return this.area;
		
	}
	
	@Override
	public String toString(){
		return String.format("Radio: %s, Area: %s, Color: %s", 
				this.getRadio(), 
				this.getArea(), 
				this.getColor());
	}

	// Getters and Setters
	public double getArea() {
		return area;
	}

	public void setArea(double area) {
		this.area = area;
	}

	public double getRadio() {
		return radio;
	}

	public void setRadio(double radio) {
		this.radio = radio;
	}	
}
