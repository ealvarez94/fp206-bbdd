
package main.java.grupofp.modelo;

import java.util.ArrayList; 

/*
*
* @author jeps
*/

public class Datos {
    
	protected ListaCliente clientes;
	protected ListaArticulo articulos;
    protected ListaPedido pedidos;
    
   // Constructor
    
	public Datos() {

		this.clientes = new ListaCliente();
		this.articulos = new ListaArticulo();
		this.pedidos = new ListaPedido(this.clientes,this.articulos);
	}
	
   //Getters & Setters
    public ListaCliente getClientes() {
		return clientes;
	}

	public ListaCliente getClientesPremium(){
		ListaCliente ClientePremium = clientes;
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
}