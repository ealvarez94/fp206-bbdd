package Controlador;
import Vista.AppView;

//clase principal desde la que se ejecuta la aplicacion
public class OnlineStore {
    public static void main(String[] args)  {

        OnlineStore app = new OnlineStore();
        app.inicio();

    }


//funcion que lanza el menu principal de la aplicacion
    public void inicio() {

        AppView interfaz = new AppView();

        int opcion = interfaz.menuPrincipal();
        switch (opcion) {
            case 1:
                ClienteController cliente = new ClienteController();
                cliente.subMenu();
                break;
            case 2:
                ProductosController productos = new ProductosController();
                productos.subMenu();
            case 3:
                PedidosController pedidos = new PedidosController();
                pedidos.subMenu();
                break;
            case 4:
                System.out.println("*** ¡HASTA LA PROXIMA!***\n");
                System.exit(0);
            default:
                System.out.println("*** OPCION NO DISPONIBLE ***\n");
                inicio();
        }

    }

}
