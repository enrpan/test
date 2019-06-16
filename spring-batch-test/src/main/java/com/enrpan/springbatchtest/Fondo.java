package com.enrpan.springbatchtest;

public class Fondo {

	private String nombre;
	private String id;
	
	public Fondo() {
    }
		
	public Fondo(String nombre, String id) {
		this.nombre = nombre;
		this.id = id;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	@Override
	public String toString() {
		return "Fondo [nombre=" + nombre + ", id=" + id + "]";
	}
	
	
}
