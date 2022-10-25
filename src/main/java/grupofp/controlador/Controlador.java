package main.java.grupofp.controlador;

import main.java.grupofp.modelo.Datos;

/*
*
* @author jeps
*/

public class Controlador {

	private Datos datos;
	
	//Constructor
    public Controlador() {
		this.datos = new Datos();
	}
    
    //Getters & Setters
	public Datos getDatos() {
		return datos;
	}

	public void setDatos(Datos datos) {
		this.datos = datos;
	}
}
