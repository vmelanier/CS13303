package oop;

public class TrianguloMejorado extends Triangulo{
	private double area;

	public TrianguloMejorado(String color){
		super(color);
	}
	public TrianguloMejorado(String color, Double ancho, Double alto) {
		super(color);
		this.setAlto(alto);
		this.setAncho(ancho);
		this.setArea(this.calculaArea());;
	}
	
	@Override
	public double calculaArea(){
		return this.getAncho() * this.getAlto()/2;
	}
	
	@Override
	public String toString(){
		return String.format("Ancho: %s, Alto: %s, Color: %s, Area: %s, Tipo: %s", 
				this.getAncho(), 
				this.getAlto(), 
				this.getColor(),
				this.getArea(),
				this.getTipo());
	}

	public double getArea() {
		return area;
	}

	public void setArea(double area) {
		this.area = area;
	}

}
