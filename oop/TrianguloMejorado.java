package oop;

public class TrianguloMejorado extends Triangulo{
	private double area;

	public TrianguloMejorado(Double ancho, Double alto) {
		super(ancho, alto);
		this.area();
	}
	
	@Override
	public double area(){
		this.area = this.getAncho() * this.getAlto()/2;
		return this.area;
	}
	
	@Override
	public String toString(){
		return String.format("Ancho: %s, Alto: %s, Color: %s, Area: %s", 
				this.getAncho(), 
				this.getAlto(), 
				this.getColor(),
				this.getArea());
	}

	public double getArea() {
		return area;
	}

	public void setArea(double area) {
		this.area = area;
	}

}
