package DAO;

import Modelo.Pedido;
import java.util.List;

public interface PedidoDAO {

    /* Create */
    public boolean addPedido(Pedido pedido);

    /* Get All*/
    public List getPedidos();

    /* Get one by id*/
    public Pedido getPedidoById(String codigo);
}
