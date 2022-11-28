package Vista;
import java.util.Scanner;

//imprime menu principal cuando se llama desde controlador
public class AppView {

    public int menuPrincipal() {
        int opcion = 0;
        System.out.println("BIENVENIDO");
        System.out.println(" ");
            System.out.println("MENU PRINCIPAL");
            System.out.println("___________________________");
            System.out.println("1 Gestionar clientes");
            System.out.println("2 Gestionar productos");
            System.out.println("3 Gestionar pedidos");
            System.out.println("4 Salir");

            opcion = new Scanner(System.in).nextInt();

            return opcion;


    }
}
