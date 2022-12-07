package DAO;

import Modelo.Producto;
import resources.Database;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class ProductoDAOImpl extends Database implements ProductoDAO{

    private final Connection con = Database.getConexion();
    private final static String SQL_CREATE_PRODUCT = "INSERT INTO productos(codigo, nombre, pvp, gastos_envio, tiempo_preparacion) VALUES (?, ?, ?, ?, ?)";
    private final static String SQL_GET_PRODUCT_ID = "SELECT * FROM productos WHERE codigo = ?";
    private final static String SQL_GET_ALL_PRODUCTS = "SELECT * FROM productos";

    @Override
    public boolean addProducto(Producto producto) {
        try {
            PreparedStatement pstm = con.prepareStatement(SQL_CREATE_PRODUCT);
            pstm.setString(1, producto.getCodigo());
            pstm.setString(2, producto.getNombre());
            pstm.setDouble(3, producto.getPrecioVenta());
            pstm.setDouble(4, producto.getGastosEnvio());
            pstm.setInt(5, producto.getTiempoPrep());
            pstm.executeUpdate();
            return true;
        } catch (SQLException ex) {
            ex.printStackTrace();
            return false;
        }
    }

    @Override
    public List<Producto> getProductos() {
        List<Producto> list = new ArrayList<>();
        try (PreparedStatement psmt = con.prepareStatement(SQL_GET_ALL_PRODUCTS)) {
            try(ResultSet rs = psmt.executeQuery()) {
                while (rs.next()) {
                    Producto producto = new Producto();
                    producto.setCodigo(rs.getString(1));
                    producto.setNombre(rs.getString(2));
                    producto.setPrecioVenta(rs.getFloat(3));
                    producto.setGastosEnvio(rs.getFloat(4));
                    producto.setTiempoPrep(rs.getInt(5));
                    list.add(producto);
                }
            }
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        return list;
    }

    @Override
    public Producto getProductoById(String codigo) {
        Producto producto = new Producto();
        try (PreparedStatement pstm= con.prepareStatement((SQL_GET_PRODUCT_ID))) {
            pstm.setString(1, codigo);
            try (ResultSet rs = pstm.executeQuery()) {
                if (rs.next()) {
                    producto.setCodigo(rs.getString(1));
                    producto.setNombre(rs.getString(2));
                    producto.setPrecioVenta(rs.getFloat(3));
                    producto.setGastosEnvio(rs.getFloat(4));
                    producto.setTiempoPrep(rs.getInt(5));
                }
            }
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        return producto;
    }
}
