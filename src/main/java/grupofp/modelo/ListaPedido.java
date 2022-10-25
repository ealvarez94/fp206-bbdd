package main.java.grupofp.modelo;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.Iterator;

/*
*
* @author jeps
*/

public class ListaPedido extends Lista<Pedido>{
	
	
	private ListaCliente clientes;
	private ListaArticulo articulos;	
	
//Constructor	
	public ListaPedido(ListaCliente clientes, ListaArticulo articulos) {
		super();
		this.clientes = clientes;
		this.articulos = articulos;
	}
	

	public void aniadir(int numPedido,float unidad,String fechaPedido,String horaPedido, String codigo, String nif) throws Exception {
		Articulo articulo = articulos.getAt(articulos.search(codigo));
		Cliente cliente = clientes.getAt(clientes.search(nif));
		Pedido pedido = new Pedido(numPedido,unidad,fechaPedido,horaPedido,articulo,cliente);
	 	if (yaExiste(pedido.getNumPedido())) {
	 		throw new Exception ("Este pedido ya est� registrado");
	 	}
	 	else {
	 		lista.add(pedido);
	 	}
 }
 	public boolean yaExiste(int numPedido) {
 		for (Pedido pedido: lista) {
 			if (pedido.getNumPedido()==(numPedido)) {
 				return true;
 			}
 		}
 		return false;
 	}
 	
    @Override
public String toString() {
    String cadena = "";
   for (Pedido pedido: lista) {
	   cadena+=(pedido.toString())+"\n";
	  
   }return cadena;
}
}
