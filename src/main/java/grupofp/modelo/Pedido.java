package main.java.grupofp.modelo;
import java.time.*;

public class Pedido {
   
	

	private int numPedido;
    private float unidad;
    private String fechaPedido;
    private String horaPedido;      
    private Articulo articulo;
    private Cliente cliente;
    
    
    //Constructor
    public Pedido(int numPedido, float unidad, String fechaPedido, String horaPedido, Articulo articulo,
			Cliente cliente) {
		super();
		this.numPedido = numPedido;
		this.unidad = unidad;
		this.fechaPedido = fechaPedido;
		this.horaPedido = horaPedido;
		this.articulo = articulo;
		this.cliente = cliente;
	}

    //Getters & Setters
    
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
		return "Pedido [numPedido=" + numPedido + ", unidad=" + unidad + ", fechaPedido=" + fechaPedido
				+ ", horaPedido=" + horaPedido + ", articulo=" + articulo + ", cliente=" + cliente + "]";
	}
    
    
}