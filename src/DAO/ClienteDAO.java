package DAO;

import Modelo.Cliente;
import java.util.List;


public interface ClienteDAO {

    /* Create */
    public boolean addCliente(Cliente cliente);

    /* Get All*/
    public List<Cliente> getClientes();

    /* Get one by nif*/
    public Cliente getClienteByNif(String nif);



}