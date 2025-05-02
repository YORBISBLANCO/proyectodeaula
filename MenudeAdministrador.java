package aplicacion;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class MenudeAdministrador extends RutasyBuses {

    // Destinos anteriores y el mejor vehículo
    ArrayList<String> anterior = new ArrayList<>();
    ArrayList<String> vehiculo = new ArrayList<>(Arrays.asList("no existe informacion para esa ruta"));

    Scanner scanner = new Scanner(System.in);
    // 1. Agregar ruta
    public void opcion1 (Scanner scanner, ArrayList<String> anterior) {
        System.out.print("Qué ruta te gustaría agregar?: ");
        String agregar = scanner.next().toLowerCase();
        anterior.add(agregar);
        System.out.println("\n+===========================================+");
        System.out.println("|        Ruta agregada con éxito              |");
        System.out.println("+===========================================+\n");
    }

    // 2. Eliminar ruta
    public void opcion2 (Scanner scanner, ArrayList<String> anterior) {
        System.out.print("Qué ruta te gustaría eliminar?: ");
        String eliminar = scanner.next().toLowerCase();
        anterior.remove(eliminar);
        System.out.println("\n+===========================================+");
        System.out.println("|        Ruta eliminada con éxito            |");
        System.out.println("+===========================================+\n");
    }

    // 3. Modificar ruta
    public void opcion3 (Scanner scanner, ArrayList<String> anterior) {
        System.out.print("Qué ruta te gustaría modificar?: ");
        String modificar = scanner.next().toLowerCase();
        System.out.print("Por cuál barrio te gustaría cambiarlo?: ");
        String cambiar = scanner.next().toLowerCase();
        anterior.set(anterior.indexOf(modificar), cambiar);
        System.out.println("\n+===========================================+");
        System.out.println("|        Ruta modificada con éxito           |");
        System.out.println("+===========================================+\n");
    }

    // 4. Editar horarios de transporte
    public void opcion4 (Scanner scanner) {
        System.out.println("\n+===========================================+");
        System.out.println("|        Horarios de transporte público      |");
        System.out.println("+===========================================+");
        System.out.println("|   Lunes a viernes = 6:15 a 21 horas        |");
        System.out.println("|   Sábados = 6:30 a 12:00, y de 14:15 a 17:45 h |");
        System.out.println("|   Domingos = de 8:15 a 12:00, y de 13:45 a 18:00 horas. |");
        System.out.println("| Fuente: https://www.cartagena.es/plantillas/1.asp?pt_idpag=1482 |");
        System.out.println("+===========================================+\n");
    }

    // 5. Editar tarifas
    public void opcion5 (Scanner scanner) {
        // Tarifas de transporte
        String tarifa = "$3.400";
        System.out.println("Cual sería el costo de la tarifa?: ");
        tarifa = scanner.next();
        System.out.println("+============================+\n");
        System.out.println("|          Vehículos         |");
        System.out.println("+============================+");
        System.out.println("|            1. Buses        |");
        System.out.println("+============================+\n");

        System.out.println("El costo es de: " + tarifa);
    }

    // 6. Editar Historial
    public void opcion6 (Scanner scanner, ArrayList<String> anterior) {
        System.out.print("Qué ruta te gustaría agregar al historial?: ");
        String historial = scanner.next().toLowerCase();
        anterior.add(historial);
        System.out.println("\n+===========================================+");
        System.out.println("|        Historial actualizado con éxito     |");
        System.out.println("+===========================================+\n");
    }

    // 7. Búsqueda
    public void opcion7 (Scanner scanner, ArrayList<String> localidad1, ArrayList<String> localidad2, ArrayList<String> localidad3) {
        System.out.print("Por cuál barrio te gustaría preguntar?: ");
        String busqueda = scanner.next().toLowerCase();
        if (localidad1.contains(busqueda) || localidad2.contains(busqueda) || localidad3.contains(busqueda)) {
            System.out.println("True: Sí se encuentra");
        } else {
            System.out.println("False: No se encuentra");
        }
    }

    public void Menu2(){
        while (true) {
            // Bienvenida
            System.out.println("\n+=====================================================+");
            System.out.println("|¡Bienvenido a \"BusTracker\", tu aplicación de confianza! |");
            System.out.println("+=====================================================+\n");

            // Menú
            System.out.println("*=====================================================*");
            System.out.println("|                       Opciones                      |");
            System.out.println("|                                                     |");
            System.out.println("|            1. Agregar ruta                          |");
            System.out.println("|            2. Eliminar ruta                         |");
            System.out.println("|            3. Modificar ruta                        |");
            System.out.println("|            4. Editar horarios de transporte         |");
            System.out.println("|            5. Editar tarifas                        |");
            System.out.println("|            6. Editar Historial                      |");
            System.out.println("|            7. Búsqueda                              |");
            System.out.println("|            8. Salir                                 |");
            System.out.println("|                                                     |");
            System.out.println("*=====================================================*");

            // Entrada del usuario
            System.out.print("Qué prefieres?: ");
            int eleccion = scanner.nextInt();

            switch (eleccion) {
                case 1:
                    opcion1(scanner, anterior);
                    break;
                case 2:
                    opcion2(scanner, anterior);
                    break;
                case 3:
                    opcion3(scanner, anterior);
                    break;
                case 4:
                    opcion4(scanner);
                    break;
                case 5:
                    opcion5(scanner);
                    break;
                case 6:
                    opcion6(scanner, anterior);
                    break;
                case 7:
                    opcion7(scanner, localidad1, localidad2, localidad3);
                    break;
                case 8:
                    System.out.println("\n+========================================+");
                    System.out.println("|          Gracias por su tiempo          |");
                    System.out.println("+========================================+\n");
                    break;
                default:
                    System.out.println("Eso no se encuentra entre las opciones");
                    break;
                }
            }
        }
    }