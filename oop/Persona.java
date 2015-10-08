package oop;

public class Persona {
	private String nombre;
	private String apellido;
	private String nombreCompleto;
	
	public Persona(){
	}
	
	public Persona(String nombre, String apellido){
		this.nombre = nombre;
		this.apellido = apellido;
		this.nombreCompleto = this.nombre +" " + this.apellido;
	}
	// Inician getters y setters
	public String getNombre(){
		return this.nombre;
	}
	
	public void setNombre(String nombre){
		this.nombre = nombre;
	}
	
	public String getApellido(){
		return this.apellido;
	}
	
	public void setApellido(String apellido){
		this.apellido = apellido;
	}
	
	public String getNombreCompleto(){
		return this.nombreCompleto;
	}
	
	public void setNombreCompleto(String nombreCompleto){
		this.nombreCompleto = nombreCompleto;
	}

}
