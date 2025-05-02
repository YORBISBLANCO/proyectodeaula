package aplicacion;

import java.util.Scanner;

public class BusTracker {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        // Bienvenida
        System.out.println("\n+=====================================================+");
        System.out.println("| ¡Bienvenido a \"BusTracker\", tu aplicación de confianza! |");
        System.out.println("+=====================================================+\n");
        System.out.println("*=====================================================*");
        System.out.println("|                       Opciones                      |");
        System.out.println("|                                                     |");
        System.out.println("|            1. Ingresar como Usuario                 |");
        System.out.println("|            2. Ingresar como Administrador           |");
        System.out.println("*=====================================================*");
        System.out.print("Ingrese una opcion: ");
        int Ingreso = teclado.nextInt();

        switch (Ingreso) {
            case 1:
                // Menú del usuario
                MenudeUsuario menu = new MenudeUsuario();
                menu.Menu1();
                break;
            case 2:
                // Mensaje de advertencia
                System.out.println("Demuestra que eres administrador.");
                // Usuario y contraseña del administrador
                String Usuari = "proyecto123";
                String Contra = "123456";

                // Ingreso del usuario 
                System.out.print("Ingrese el usuario: ");
                String usuario = teclado.next();
                if(!usuario.equals(Usuari)){
                    System.out.println("Usuario incorrecto");
                    break;
                }
                // Ingreso de la contraseña
                System.out.print("Ingrese su contraseña: ");
                String contraseña = teclado.next();
                if(!contraseña.equals(Contra)){
                    System.out.println("Contraseña incorrecta");
                    break;
                }
                // Menú del administrador
                MenudeAdministrador menu2 = new MenudeAdministrador();
                menu2.Menu2();
                break;
            default:
                System.out.println("Opcion no valida");
                break;
        }
        teclado.close();
    }
}

