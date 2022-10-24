
package main.java.grupofp.modelo;

import java.util.ArrayList; 


public class Datos {
    

	protected ListaCliente clientes; 
    protected ListaArticulo articulos;
    protected ListaPedido pedidos; 


//Constructor

	public Datos(ListaCliente clientes, ListaArticulo articulos, ListaPedido pedidos) {
		super();
		this.clientes = clientes;
		this.articulos = articulos;
		this.pedidos = pedidos;
	}

//Getters&Setters

public ListaCliente getClientes() {
	return clientes;
}


public void setClientes(ListaCliente clientes) {
	this.clientes = clientes;
}


public ListaArticulo getArticulos() {
	return articulos;
}


public void setArticulos(ListaArticulo articulos) {
	this.articulos = articulos;
}


public ListaPedido getPedidos() {
	return pedidos;
}


public void setPedidos(ListaPedido pedidos) {
	this.pedidos = pedidos;
}


//toString
@Override
public String toString() {
	return "Datos [clientes=" + clientes + ", articulos=" + articulos + ", pedidos=" + pedidos + ", getClientes()="
			+ getClientes() + ", getArticulos()=" + getArticulos() + ", getPedidos()=" + getPedidos()
			+ ", getClass()=" + getClass() + ", hashCode()=" + hashCode() + ", toString()=" + super.toString()
			+ "]";
}
}
