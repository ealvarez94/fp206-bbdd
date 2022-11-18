package main.java.grupofp.modelo;

/*
*
* @author jeps
*/

public class ListaPedido extends Lista<Pedido>{
	
	
	private ListaCliente clientes;
	private ListaArticulo articulos;
	private float precioPedido;
	private double precioEnvioPedido;

	//Constructor	
	public ListaPedido(ListaCliente clientes, ListaArticulo articulos) {
		super();
		this.clientes = clientes;
		this.articulos = articulos;
	}
	

	public void aniadir(int numPedido, float unidad, String fechaPedido, String horaPedido, String codigo, String nif) throws Exception {
		Articulo articulo = articulos.getAt(articulos.search(codigo));
		Cliente cliente = clientes.getAt(clientes.search(nif));
		Pedido pedido = new Pedido(numPedido,unidad,fechaPedido,horaPedido,articulo,cliente,precioPedido,precioEnvioPedido);
	 	if (yaExiste(pedido.getNumPedido())) {
	 		throw new Exception ("Este pedido ya esta registrado");
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
