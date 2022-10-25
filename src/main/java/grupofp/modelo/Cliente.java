
package main.java.grupofp.modelo;
import java.util.ArrayList;
import java.util.Scanner;

/*
*
* @author jeps
*/

public abstract class Cliente {

	protected String nombre; 
    protected String nif; 
    protected String domicilio; 
    protected String email;
 
//Constructor
    public Cliente(String nombre, String nif, String domicilio, String email) {
        this.nombre = nombre;
        this.nif = nif;
        this.domicilio = domicilio;
        this.email = email;
    }

    
// Getters 
    
    String getNombre(){
        return nombre;
    }
    
    String getNif(){
        return nif; 
    }
    
    String getDomicilio(){
        return domicilio; 
    }
    
    String getEmail(){
        return email; 
    }
    
    
    //Setters
    void setNombre(String nombre){
        this.nombre = nombre; 
    }
    
    void setNIF(String nif){
        this.nif = nif; 
    }
    
    void setDomicilio(String domicilio){
        this.domicilio = domicilio; 
    }
    
    void setEmail(String email){
        this.email = email; 
    }
    
    //Metodos
    
    public abstract String tipoCliente();
        
    public abstract int cuotaAnual();
   
    public abstract int descuentoEnv();

    @Override
    public String toString() {
    	return "Cliente{" + "nombre=" + nombre + ", NIF=" + nif + ", domicilio=" + domicilio + ", email=" + email + ", tipoC="+ tipoCliente() + ", calcAnual="  +cuotaAnual()+ ", descuentoEnv= " +descuentoEnv()+ "}";
    }
}

