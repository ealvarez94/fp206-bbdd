
package main.java.grupofp.vista;

import java.util.Scanner;

import main.java.grupofp.controlador.Controlador;

/*
*
* @author jeps
*/

public class OnlineStore {  
    
    public static void main(String[] args) throws Exception{
    	
    Controlador controlador = new Controlador();
    GestionOS gestionOS = new GestionOS();
    
    boolean salir = false;
    char opcion;
    do {
        System.out.println("");
        System.out.println("1. Gestion de Articulos");
        System.out.println("2. Gestion de Clientes");
        System.out.println("3. Gestion de Pedidos");
        opcion = pedirOpcion();
        switch (opcion) {
        
        
            case '1':
        System.out.println("1. Anadir Articulos");
        System.out.println("2. Mostrar Articulos");
        opcion = gestionArticulos();
        if (opcion == '1') {
        	gestionOS.anadirArticulos(controlador);
        		
        }
        else if (opcion == '2'){
        	gestionOS.mostrarArticulos(controlador);
        }
                break;
               
                
            case '2':
            System.out.println("1. Anadir Clientes");
            System.out.println("2. Mostrar Clientes");
            System.out.println("3. Mostrar Clientes Estandard");
            System.out.println("4. Mostrar Clientes Premium");
            opcion = gestionClientes();
            if (opcion == '1') {
            gestionOS.aniadirClientes(controlador);
                		
                }
                else if (opcion == '2'){
                	gestionOS.mostrarClientes(controlador);
                }
                else if (opcion == '3'){
                gestionOS.mostrarClientesEstandard(controlador);
                }
                else if (opcion == '4'){
                gestionOS.mostrarClientesPremium(controlador);
                }
              
            	break;
            	
            	
           case '3':
            System.out.println("1. Anadir Pedidos");
            System.out.println("2. Mostrar Pedidos");
            System.out.println("3. Eliminar Pedidos");
            opcion = gestionPedidos();
            if (opcion == '1') {
            	gestionOS.anadirPedidos(controlador);
          } 
            else if (opcion =='2') {
            	gestionOS.mostrarPedido(controlador);            }
            else if (opcion =='3') {
            	gestionOS.eliminarPedido(controlador);
            }
        }
    }     while (!salir);
    }   
        
static char pedirOpcion() {
    String resp;
    System.out.print("Elige una opcion (1,2,3 o 4): ");
    Scanner teclado = new Scanner(System.in);
	resp = teclado.nextLine();
    if (resp.isEmpty()) {
        resp = " ";
    }
    return resp.charAt(0);
}

static char gestionArticulos() {
    String resp;
    System.out.print("Elige una opcion (1,2): ");
    Scanner teclado = new Scanner(System.in);
	resp = teclado.nextLine();
    if (resp.isEmpty()) {
        resp = " ";
    }
    return resp.charAt(0);
}

static char gestionClientes() {
    String resp;
    System.out.print("Elige una opcion (1,2,3 o 4): ");
    Scanner teclado = new Scanner(System.in);
	resp = teclado.nextLine();
    if (resp.isEmpty()) {
        resp = " ";
    }
    return resp.charAt(0);
}
static char gestionPedidos() {
	 String resp;
	    System.out.print("Elige una opcion (1,2,3 o 4): ");
	    Scanner teclado = new Scanner(System.in);
		resp = teclado.nextLine();
	    if (resp.isEmpty()) {
	        resp = " ";
	    }
	    return resp.charAt(0);
}
}
