package DAO;

import Modelo.Producto;
import java.util.List;

public interface ProductoDAO {

    /* Create */
    public boolean addProducto(Producto producto);

    /* Get All*/
    public List getProductos();

    /* Get one by id*/
    public Producto getProductoById(String codigo);
}
