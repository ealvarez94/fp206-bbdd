package DAO;

import Modelo.Cliente;
import Modelo.Estandar;
import Modelo.Premium;
import resources.Database;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class ClienteDAOImpl extends Database implements ClienteDAO {

    private final Connection con = Database.getConexion();
    private final static String SQL_CREATE_CLIENTE = "INSERT INTO clientes(nif, nombre, email, domicilio, cuota, descuento) VALUES (?, ?, ?, ?, ?, ?)";
    private final static String SQL_GET_CLIENTE = "SELECT * FROM clientes WHERE nif = ?";
    private final static String SQL_GET_CLIENTES = "SELECT * FROM clientes";

    @Override
    public boolean addCliente(Cliente cliente) {
        try {
            PreparedStatement pstm = con.prepareStatement(SQL_CREATE_CLIENTE);
            pstm.setString(1, cliente.getNif());
            pstm.setString(2, cliente.getNombre());
            pstm.setString(3, cliente.getEmail());
            pstm.setString(4, cliente.getDomicilio());
            pstm.setDouble(5, cliente.getCuota());
            pstm.setDouble(6, cliente.getDescuento());
            // Ejecutamos statement
            pstm.executeUpdate();
            return true;

        } catch (SQLException ex) { //  si ocurre una excepcion
            ex.printStackTrace();
            return false;
        }
    }

    @Override
    public List<Cliente> getClientes() {
        Cliente cliente;
        List<Cliente> list = new ArrayList<>();
        try(PreparedStatement pstm = con.prepareStatement(SQL_GET_CLIENTES);
            ResultSet rs = pstm.executeQuery()){
            while(rs.next()) {
                int setCuota = rs.getInt(5);
                if(setCuota > 0) {
                    Cliente clientePremium = new Premium();
                    clientePremium.setNif(rs.getString(1));
                    clientePremium.setNombre(rs.getString(2));
                    clientePremium.setEmail(rs.getString(3));
                    clientePremium.setDomicilio(rs.getString(4));
                    clientePremium.setCuota(rs.getInt(5));
                    clientePremium.setDescuento(rs.getInt(6));
                    cliente = clientePremium;
                    list.add(cliente);

                } else {
                    Cliente clienteEstandard = new Estandar();

                    clienteEstandard.setNif(rs.getString(1));
                    clienteEstandard.setNombre(rs.getString(2));
                    clienteEstandard.setEmail(rs.getString(3));
                    clienteEstandard.setDomicilio(rs.getString(4));
                    cliente = clienteEstandard;
                    list.add(cliente);
                }
            }
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        return list;
    }

    @Override
    public Cliente getClienteByNif(String nif) {
        Cliente cliente = null;
        try (PreparedStatement pstm = con.prepareStatement(SQL_GET_CLIENTE)){
            pstm.setString(1, nif);
            try (ResultSet rs = pstm.executeQuery()){
                if (rs.next()) {
                    if(rs.getInt(5) > 0) {
                        Cliente clientePremium = new Premium();
                        clientePremium.setNif(rs.getString(1));
                        clientePremium.setNombre(rs.getString(2));
                        clientePremium.setEmail(rs.getString(3));
                        clientePremium.setDomicilio(rs.getString(4));
                        clientePremium.setCuota(rs.getInt(5));
                        clientePremium.setDescuento(rs.getInt(6));

                        cliente = clientePremium;
                    } else {
                        Cliente clienteEstandard = new Estandar();
                        clienteEstandard.setNif(rs.getString(1));
                        clienteEstandard.setNombre(rs.getString(2));
                        clienteEstandard.setEmail(rs.getString(3));
                        clienteEstandard.setDomicilio(rs.getString(4));
                        clienteEstandard.setCuota(rs.getInt(5));
                        clienteEstandard.setDescuento(rs.getInt(6));

                        cliente = clienteEstandard;
                    }

                }
            }
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        return cliente;
    }

}
