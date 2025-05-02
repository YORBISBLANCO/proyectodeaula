package aplicacion;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class MenudeUsuario extends RutasyBuses {

    Scanner scanner = new Scanner(System.in);

    // Destinos anteriores y el mejor vehículo
    ArrayList<String> anterior = new ArrayList<>();
    ArrayList<String> vehiculo = new ArrayList<>(Arrays.asList("no existe informacion para esa ruta"));

    // eleccion1 . vehiculo
    public void eleccion1(){
        System.out.print("Escribe el nombre del barrio en el que te encuentras: ");
        String ubicacion = scanner.next().toLowerCase();

        // Destino
        System.out.print("Hacia dónde te diriges?: ");
        String destino = scanner.next().toLowerCase();
        anterior.add(destino);

        // Lógica de vehículos (simplificada como ejemplo)
        if (ubicacion.equals(Caracoles) && destino.equals(Caracoles)) {
            vehiculo.set(0, "Caracoles");
        } else if (ubicacion.equals(bayunca) && destino.equals(bayunca)) {
            vehiculo.set(0, "Bayunca");
        } else if (ubicacion.equals(socorro) && destino.equals(socorro)) {
            vehiculo.set(0, "Socorro");
        } else if (ubicacion.equals(pasacaballo) && destino.equals(pasacaballo)) {
            vehiculo.set(0, "Pasacaballo");
        } else if (ubicacion.equals(microBus) && destino.equals(microBus)) {
            vehiculo.set(0, "Microbus");
        } else if (ubicacion.equals(sanFernando) && destino.equals(sanFernando)) {
            vehiculo.set(0, "San Fernando");
        } else if (ubicacion.equals(vehitrasn) && destino.equals(vehitrasn)) {
            vehiculo.set(0, "Vehitrasn");
        } else {
            vehiculo.set(0, "No existe información para esa ruta");
        }
        System.out.println("\n+===========================================+");
        System.out.println("|        Esta es su mejor opcion              |");
        System.out.println("+===========================================+");
    }

    // eleccion2. horarios 
    public void eleccion2(){
        System.out.println("\n+==================================================================+");
                System.out.println("|              Horarios de transporte público                      |");
                System.out.println("+==================================================================+");
                System.out.println("|   Lunes a viernes = 6:15 a 21 horas                              |");
                System.out.println("|   Sábados = 6:30 a 12:00, y de 14:15 a 17:45 h                   |");
                System.out.println("|   Domingos = de 8:15 a 12:00, y de 13:45 a 18:00 horas.          |");
                System.out.println("| Fuente: https://www.cartagena.es/plantillas/1.asp?pt_idpag=1482  |");
                System.out.println("+==================================================================+\n");
    }

    // eleccion3. tarifas
    public void eleccion3(){
        String tarifa = "$3.400";
        System.out.println("\n+============================+");
        System.out.println("|          Vehículos         |");
        System.out.println("+============================+");
        System.out.println("|            1. Buses        |");
        System.out.println("+============================+\n");

        System.out.println("El costo es de: " + tarifa);
    }

    // eleccion4. historial
    public void eleccion4(){
        System.out.println("\n+========================================+");
        System.out.println("|            Destinos anteriores         |");
        System.out.println("+========================================+");
        System.out.println(anterior);
        System.out.println();
    }

    // eleccion5. busqueda
    public void eleccion5(){
        System.out.print("Por cuál barrio te gustaría preguntar?: ");
        String busqueda = scanner.next().toLowerCase();
        if (localidad1.contains(busqueda) || localidad2.contains(busqueda) || localidad3.contains(busqueda)) {
            System.out.println("True: Sí se encuentra");
        } else {
            System.out.println("False: No se encuentra");
        }
    }

    // eleccion6. salir
    public void eleccion6(){
        System.out.println("\n+========================================+");
        System.out.println("|          Gracias por su tiempo          |");
        System.out.println("+========================================+\n");
    }

    public void Menu1(){
        while (true) {
            // Bienvenida
            System.out.println("\n+=====================================================+");
            System.out.println("| ¡Bienvenido a \"BusTracker\", tu aplicación de confianza! |");
            System.out.println("+=====================================================+\n");

            // Menú
            System.out.println("*=====================================================*");
            System.out.println("|                       Opciones                      |");
            System.out.println("|                                                     |");
            System.out.println("|            1. Qué vehículo pasa por aquí?           |");
            System.out.println("|            2. Ver horarios de transporte            |");
            System.out.println("|            3. Ver tarifas                           |");
            System.out.println("|            4. Historial                             |");
            System.out.println("|            5. Búsqueda                              |");
            System.out.println("|            6. Salir                                 |");
            System.out.println("|                                                     |");
            System.out.println("*=====================================================*");

            // Entrada del usuario
            System.out.print("Qué prefieres?: ");
            int eleccion = scanner.nextInt();
            switch (eleccion) {
                case 1:
                    eleccion1();
                    break;
                case 2:
                    eleccion2();
                    break;
                case 3:
                    eleccion3();
                    break;
                case 4:
                    eleccion4();
                    break;
                case 5:
                    eleccion5();
                    break;
                case 6:
                    eleccion6();
                    break;
                default:
                    System.out.println("Opción no válida");
                    break;
                }
            }
        }
    }