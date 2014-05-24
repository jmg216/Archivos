package com.home.archivos;

import java.io.Serializable;

/**
 * Persona
 * */
public class Persona implements Serializable {
	
	String nombre;
	String apellido;
	String ci;
	
	public Persona(String nombre, String apellido, String ci) {
		super();
		this.nombre = nombre;
		this.apellido = apellido;
		this.ci = ci;
	}
	
	
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getApellido() {
		return apellido;
	}
	public void setApellido(String apellido) {
		this.apellido = apellido;
	}
	public String getCi() {
		return ci;
	}
	public void setCi(String ci) {
		this.ci = ci;
	}
	
	
	
}
