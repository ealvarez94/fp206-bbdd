package main.java.grupofp.modelo;

/*
*
* @author jeps
*/

public class Pedido {
   
	private int numPedido;
    private float unidad;
    private String fechaPedido;
    private String horaPedido;      
    private Articulo articulo;
    private Cliente cliente;
	private float precioPedido;
	private double precioEnvioPedido;
    
    //Constructor
    public Pedido(int numPedido, float unidad, String fechaPedido, String horaPedido, Articulo articulo,
			Cliente cliente, float precioPedido, double precioEnvioPedido) {
		super();
		this.numPedido = numPedido;
		this.unidad = unidad;
		this.fechaPedido = fechaPedido;
		this.horaPedido = horaPedido;
		this.articulo = articulo;
		this.cliente = cliente;
		this.precioPedido = precioPedido;
		this.precioEnvioPedido = precioEnvioPedido;
	}


	//Getters & Setters

	public int add (int numberA, int numberB){
		return numberA + numberB;
	}

	public double getPrecioPedido() {

		return this.unidad * this.articulo.getPrecio();
	}

	public double getPrecioEnvio() {
		if (cliente.tipoCliente()==("Estandard")) {
			return articulo.getGastoEnvio();
		} else if (cliente.tipoCliente()==("Premium")) {
			return (articulo.getGastoEnvio() - articulo.getGastoEnvio() * 0.2 );
		}
		return precioEnvioPedido;
	}

	public int getNumPedido() {
		return numPedido;
	}

	public void setNumPedido(int numPedido) {
		this.numPedido = numPedido;
	}

	public float getUnidad() {
		return unidad;
	}

	public void setUnidad(float unidad) {
		this.unidad = unidad;
	}

	public String getFechaPedido() {
		return fechaPedido;
	}

	public void setFechaPedido(String fechaPedido) {
		this.fechaPedido = fechaPedido;
	}

	public String getHoraPedido() {
		return horaPedido;
	}

	public void setHoraPedido(String horaPedido) {
		this.horaPedido = horaPedido;
	}

	public Articulo getArticulo() {
		return articulo;
	}

	public void setArticulo(Articulo articulo) {
		this.articulo = articulo;
	}

	public Cliente getCliente() {
		return cliente;
	}

	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	} 
    
	//toString
	
	@Override
	public String toString() {
		return "Pedido [numPedido=" + numPedido + ", fechaPedido=" + fechaPedido + ", horaPedido=" + horaPedido + "h, articulo=" + articulo.getDescripcion() + ", unidad=" + unidad + ", precioPedido=" + getPrecioPedido() + ", precioEnvio=" + getPrecioEnvio() + ", cliente=" + cliente + "]";
	}

/*	@Override
	public String toString() {
		return "Pedido [numPedido=" + numPedido + ", unidad=" + unidad + ", fechaPedido=" + fechaPedido
				+ ", horaPedido=" + horaPedido + "h, precioPedido=" + getPrecioPedido() + ", articulo=" + articulo + ", cliente=" + cliente + "]";
	}*/
    
    
}