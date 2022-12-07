package Modelo;
import DAO.ClienteDAOImpl;
import DAO.ProductoDAOImpl;
import DAO.PedidoDAOImpl;

import java.util.ArrayList;
import java.util.List;

public class Datos {
    private final ProductoDAOImpl productoDAO = new ProductoDAOImpl();
    private final ClienteDAOImpl clienteDAO = new ClienteDAOImpl();
    private final PedidoDAOImpl pedidoDAO = new PedidoDAOImpl();


    public Datos() {}

    public void agregarProducto(Producto producto) {
        productoDAO.addProducto(producto);
    }

    public List<Producto> getProductos() {
        return productoDAO.getProductos();
    }


    public void agregarCliente(Cliente cliente) {
        clienteDAO.addCliente(cliente);
    }

    public List<Cliente> getClientes() {
        return clienteDAO.getClientes();
    }

    public void agregarPedido(List<Object> parametros) {
        Pedido pedido = new Pedido();
        Cliente cliente = clienteDAO.getClienteByNif((String)parametros.get(0));
        Producto producto = productoDAO.getProductoById((String)parametros.get(1));
        pedido.setCliente(cliente);
        pedido.setProducto(producto);
        pedido.setCantidad(Integer.parseInt((String) parametros.get(2)));
        pedidoDAO.addPedido(pedido);
    }

    public List<Pedido> getPedidos() {
        return pedidoDAO.getPedidos();
    }

}
