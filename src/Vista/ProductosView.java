package Vista;

import Modelo.Producto;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

//menu principal de productos
public class ProductosView {

//menu principal de productos
    public int mostrarMenu() {
        System.out.println("MENU PRODUCTOS");
        System.out.println("___________________________");
        System.out.println("1 Agregar productos");
        System.out.println("2 Ver productos");
        System.out.println("3 Volver");

        int opcion = new Scanner(System.in).nextInt();

        return opcion;
    }

//lee el imput y los exporta como parametros para que pueda ser leido por el controlador y el DAO
    public static List lecturaProducto() {

        List parametros = new ArrayList<>();
        Scanner sc = new Scanner(System.in);

        System.out.println("Codigo producto:");
        String codigo = sc.nextLine();
        parametros.add(codigo);

        System.out.println("Nombre producto:");
        String nombre = sc.nextLine();
        parametros.add(nombre);

        System.out.println("Precio de venta:");
        String precioVenta = sc.nextLine();
        parametros.add(precioVenta);

        System.out.println("Gastos de envio:");
        String gastosEnvio = sc.nextLine();
        parametros.add(gastosEnvio);

        System.out.println("Tiempo preparo:");
        String tiempoPrep = sc.nextLine();
        parametros.add(tiempoPrep);

        return (parametros);

    }

//saca por pantalla los datos de pedidos almacenados en la base de datos
    public void mostrarProductos(List<Producto> productoLista) {
        System.out.println("PRODUCTOS");
        for (Producto producto : productoLista) {
                System.out.println(producto.toString());
                System.out.println("___________________________");
            }
        }
    }

