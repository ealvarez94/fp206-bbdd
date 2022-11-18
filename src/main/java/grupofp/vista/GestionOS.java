package main.java.grupofp.vista;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.Scanner;

import main.java.grupofp.controlador.Controlador;
import main.java.grupofp.modelo.*;

/*
*
* @author jeps
*/

public class GestionOS {
    
	static void mostrarDatos(Controlador controlador) {
		System.out.println(controlador.getDatos().getClientes().toString());
		System.out.println(controlador.getDatos().getArticulos().toString());
		System.out.println(controlador.getDatos().getPedidos().toString());
	}

	public void anadirArticulos(Controlador controlador) throws Exception {
	
	System.out.println("1. Va a anadir un nuevo articulo, introduzca por orden los siguientes datos: Codigo,Descripcion,precioVenta,tiempoPreparacion y gastosEnvio");
	Scanner teclado = new Scanner(System.in);
	
	String codigo = teclado.nextLine();
	String descripcion = teclado.nextLine();
	String precioVenta = teclado.nextLine();
	double precioV = Double.parseDouble(precioVenta);
	String tiempoPreparacion = teclado.nextLine();
	double tiempoP = Double.parseDouble(tiempoPreparacion);
	String gastosEnvio = teclado.nextLine();
	double gastosE = Double.parseDouble(gastosEnvio);

	controlador.getDatos().getArticulos().aniadir(codigo,descripcion,precioV,tiempoP,gastosE);
	}

	public void mostrarArticulos(Controlador controlador) {
	System.out.println(controlador.getDatos().getArticulos().toString());	
	}

	public void aniadirClientes(Controlador controlador) throws Exception {
	
	System.out.println("1. Va a anadir un nuevo cliente, introduzca por orden los siguientes datos: nombre, NIF, domicilio, email, tipoCliente.");
	Scanner teclado = new Scanner(System.in);
	
	String nombre = teclado.nextLine();
	String nif = teclado.nextLine();
	String domicilio = teclado.nextLine();
	String email = teclado.nextLine();
	String tipoCliente = teclado.nextLine();

	controlador.getDatos().getClientes().aniadir(nombre,nif,domicilio,email,tipoCliente);
	}
		
	public void mostrarClientes(Controlador controlador) {
	System.out.println(controlador.getDatos().getClientes().toString());
	}

	public void mostrarClientesPremium(Controlador controlador) {
		System.out.println(controlador.getDatos().getClientes().toStringPremium());
	}

	public void mostrarClientesEstandard(Controlador controlador) {
		System.out.println(controlador.getDatos().getClientes().toStringEstandard());
	}
	
	public void anadirPedidos(Controlador controlador) throws Exception {
		
	System.out.println("1. Va a anadir un nuevo pedido, introduzca por orden los siguientes datos: numPedido,unidad,fechaPedido,horaPedido,codigoArticulo,nifCliente.");
	Scanner teclado = new Scanner(System.in);
	
	String numPedido = teclado.nextLine();
	String unidad = teclado.nextLine();
	float unid = Float.parseFloat(unidad);
	String fechaPedido = teclado.nextLine();
	String horaPedido = teclado.nextLine();
	String codigoArticulo = teclado.nextLine();
	String nifCliente = teclado.nextLine();

	controlador.getDatos().getPedidos().aniadir(Integer.parseInt(numPedido),unid,fechaPedido,horaPedido,codigoArticulo,nifCliente);
	}

	public void mostrarPedido(Controlador controlador) {
	System.out.println(controlador.getDatos().getPedidos().toString());	

	}

	public void eliminarPedido(Controlador controlador) throws Exception {
		System.out.println("1. Se va a eliminar el siguiente pedido registrado, escriba el numero del pedido que desea eliminar.");
		Scanner teclado = new Scanner(System.in);
		String numPedido = teclado.nextLine();
		Pedido pedido = controlador.getDatos().getPedidos().getAt(controlador.getDatos().getPedidos().search(numPedido));
		controlador.getDatos().getPedidos().borrar(pedido);	
	}
}
