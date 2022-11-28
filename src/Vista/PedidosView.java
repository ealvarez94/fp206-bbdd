package Vista;

import Modelo.Pedido;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

//menu principal de pedidos
public class PedidosView {
    static Scanner sc = new Scanner(System.in);

    public int mostrarMenu() {
        System.out.println("MENU PEDIDOS");
        System.out.println("___________________________");
        System.out.println("1 Nuevo pedido");
        System.out.println("2 Ver pedidos");
        System.out.println("3 Volver");

        int opcion = new Scanner(System.in).nextInt();

        return opcion;
    }

//lee el imput y los exporta como parametros para que pueda ser leido por el controlador y el DAO
    public static List lecturaPedido() {

        List parametros = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        System.out.println("NUEVO PEDIDO");
        System.out.println("Introduce el NIF del cliente:");
        String nif = sc.nextLine();
        parametros.add(nif);

        System.out.println("Introduce el codigo del producto");
        String codigo = sc.nextLine();
        parametros.add(codigo);

        System.out.println("Introduce la cantidad:");
        String cantidad = sc.nextLine();
        parametros.add(cantidad);

        return (parametros);

    }

//saca por pantalla los datos de pedidos almacenados en la base de datos
    public void mostrarPedidos(List<Pedido> pedidoLista) {
        System.out.println("PEDIDOS");
        for (Pedido pedido : pedidoLista) {
            System.out.println(pedido.toString());
            System.out.println("___________________________");
        }
    }
}
