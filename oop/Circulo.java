package oop;

public class Circulo extends Forma2d{
	private double radio;
	private final double PI = Math.PI;
	private double area;
	private double perimetro;
	
	public Circulo(String color) {
		super(color);
	}
	
	public Circulo(String color, double radio) {
		super(color);
		this.setRadio(radio);
		this.setArea(this.calculaArea());
		this.setPerimetro(this.calculaPerimetro());
	}
	
	@Override
	public double calculaArea(){
		return this.PI * Math.pow(this.getRadio(), 2);
	}
	
	@Override
	public double calculaPerimetro(){
		return 2 * this.PI * this.radio;
	}
	
	@Override
	public String toString(){
		return String.format("Radio: %s, Area: %s, Color: %s, Perimetro: %s", 
				this.getRadio(), 
				this.getArea(), 
				this.getColor(),
				this.getPerimetro());
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
	public double getPerimetro() {
		return perimetro;
	}

	public void setPerimetro(double perimetro) {
		this.perimetro = perimetro;
	}
}
