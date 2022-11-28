package DAO;

import Modelo.Pedido;
import resources.Database;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class PedidoDAOImpl extends Database implements PedidoDAO {

    private final Connection con = Database.getConexion();
    private final ClienteDAOImpl cliente = new ClienteDAOImpl();
    private final ProductoDAOImpl producto = new ProductoDAOImpl();

    private final static String SQL_CREATE_PEDIDO = "INSERT INTO pedidos(nif_cliente, codigo_articulo, cantidad) VALUES(?,?,?)";
    private final static String SQL_GET_PEDIDO_ID = "SELECT * FROM pedidos WHERE codigo = ?";
    private final static String SQL_GET_PEDIDOS = "SELECT * FROM pedidos";


    @Override
    public boolean addPedido(Pedido pedido) {
        try {
            PreparedStatement pstm = con.prepareStatement(SQL_CREATE_PEDIDO);
            pstm.setString(1, pedido.getCliente().getNif());
            pstm.setString(2, pedido.getProducto().getCodigo());
            pstm.setInt(3, pedido.getCantidad());
            pstm.executeUpdate();
            return true;

        } catch (SQLException ex) {
            ex.printStackTrace();
            return false;
        }

    }

    @Override
    public List<Pedido> getPedidos() {
        return getPedidos(SQL_GET_PEDIDOS);
    }

    private List<Pedido> getPedidos(String sqlSelectPedidos) {
        List<Pedido> lista = new ArrayList<>();
        try (PreparedStatement pstm = con.prepareStatement(sqlSelectPedidos)) {
            try(ResultSet rs = pstm.executeQuery()) {
                while(rs.next()) {
                    Pedido pedido = new Pedido();
                    pedido.setCodigo(rs.getString(1));
                    pedido.setCliente(cliente.getClienteByNif(rs.getString(2)));
                    pedido.setProducto(producto.getProductoById(rs.getString(3)));
                    pedido.setCantidad(rs.getInt(4));

                    lista.add(pedido);
                }
            }
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        return lista;
    }

    @Override
    public Pedido getPedidoById(String codigo) {
        Pedido pedido = null;
        try (PreparedStatement pstm= con.prepareStatement((SQL_GET_PEDIDO_ID))) {
            pstm.setString(1, codigo);
            try (ResultSet rs = pstm.executeQuery()) {
                if (rs.next()) {
                    pedido.setCodigo(rs.getString(1));
                    pedido.setCliente(cliente.getClienteByNif(rs.getString(2)));
                    pedido.setProducto(producto.getProductoById(rs.getString(3)));
                    pedido.setCantidad(rs.getInt(4));
                }
            }
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        return pedido;
    }


}
