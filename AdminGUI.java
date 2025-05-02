package aplicacion;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JButton;
import javax.swing.JOptionPane;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import javax.swing.SwingUtilities;

public class AdminGUI extends JFrame {

    // Listas de localidades
        // Localidad 1
    ArrayList<String> localidad1 = new ArrayList<>(Arrays.asList(
    "bocagrande", "castillogrande", "centro", "chambacu", "crespo", "el cabrero",
        "el laguito", "getsemani", "la matuna", "manga", "marbella", "pie de la popa",
        "san diego", "los ejecutios", "cuatro vientos", "la bodeguita", "bazurto", 
        "mercado", "espana", "maria auxiliadora", "villa olympica", "el centro",
        "patio portal", "madre bernarda", "delicias", "lo amador", "el prado",
        "la popa", "terminal", "terminal de transporte", "crisanto luque", 
        "crisantoluque", "los angeles", "cuidad jardin", "universidad tecnologia",
        "Barcelona", "Las Americas"
        ));
        
    // Localidad 2
    ArrayList<String> localidad2 = new ArrayList<>(Arrays.asList(
    "alcibia", "boston", "la candelaria", "la esperanza", "la maria", "la quinta",
        "chiquinquira", "olaya st. central", "olaya st. rafael nunez", 
        "olaya st. ricaurte", "olaya st. 11 de noviembre", "olaya villa olimpica", 
        "republica del libano", "tesca", "el pozon", "fredonia", "flor del campo", 
        "la india", "nuevo paraiso", "olaya st. la magdalena", "olaya st. stella", 
        "olaya st. zarabanda", "urbanizacion colombiaton", "villa estrella", 
        "olaya st. la puntilla", "olaya st. playa blanca", "olaya st. progreso", 
        "chapacua", "chipre", "el gallo", "la castellana", "la floresta", 
        "las gaviotas", "las palmeras", "los alpes", "nuevo porvenir", 
        "republica de venezuela", "san antonio", "san jose obrero", "13 de junio", 
        "viejo porvenir", "arroyo grande", "las europas", "arroyo de las canoas", 
        "arroyo de piedra", "punta canoa", "pontezuela", "manzanillo del mar", 
        "puerto rey", "tierra baja", "la boquilla", "bayunca", "palmarito", "el consulado"
        ));
        
        // Localidad 3
        ArrayList<String> localidad3 = new ArrayList<>(Arrays.asList(
        "albornoz", "antonio jose de sucre", "arroz barato", "bellavista", "ceballos", 
        "el libertador", "policarpa", "puerta de hierro", "santa clara", 
        "20 de julio sur", "villa barraza", "villa rosa", "almirante colon", 
        "blas de lezo", "el campestre", "el carmelo", "el milagro", "el socorro", 
        "la central", "los caracoles", "los corales", "san pedro", "santa monica", 
        "anita", "el recreo", "la concepcion", "providencia", "san jose de los campanos", 
        "santa lucia", "ternera", "villa rosita", "alameda", "la victoria", 
        "camilo torres", "cesar florez", "ciudadela 11 de nov", "ciudadela 2000", 
        "jorge eliecer gaitan", "la esmeralda i", "la esmeralda ii", "san fernando", 
        "sectores unidos", "urbanizacion simon bolivar", "la florida", "la sierrita", 
        "los santanderes", "maria cano", "nazareno", "nelson mandela", "nueva delhi", 
        "nueva jerusalen", "rossedal", "villa fanny", "villa hermosa", "villa rubia", 
        "el educador", "el reposo", "henequen", "jaime pardo leal", "la consolata", 
        "la victoria", "los jardines", "luis carlos galan", "manuela vergara de curi", 
        "san pedro martir", "vista hermosa", "pasacaballo", "recreo", "membrillal", 
        "nuevo bosque", "bosque"
        ));
        
        // Buses
        ArrayList<String> caracoles = new ArrayList<>(Arrays.asList(
            localidad3.get(9), localidad3.get(0), localidad3.get(19), localidad3.get(14), 
            localidad2.get(30), localidad1.get(14), localidad2.get(0), localidad1.get(21), 
            localidad1.get(2), localidad1.get(16), localidad3.get(2), localidad3.get(3), 
            localidad1.get(17), localidad1.get(13), localidad3.get(65)
            ));
            
            ArrayList<String> bayunca = new ArrayList<>();
            ArrayList<String> vehitrasn = new ArrayList<>(Arrays.asList(
                localidad1.get(18), localidad2.get(30), localidad1.get(13)
                ));
            
            ArrayList<String> socorro = new ArrayList<>(Arrays.asList(
                localidad1.get(0), localidad3.get(17)
                ));
            
            ArrayList<String> pasacaballo = new ArrayList<>(Arrays.asList(
                localidad3.get(4), localidad3.get(70), localidad3.get(0), localidad3.get(16), 
                localidad3.get(17), localidad1.get(21), localidad1.get(2), localidad3.get(66), 
                localidad3.get(2)
                ));

            ArrayList<String> microBus = new ArrayList<>(Arrays.asList(localidad1.get(14)));

            ArrayList<String> sanFernando = new ArrayList<>(Arrays.asList(localidad3.get(40)));

    // Variables globales necesarias para la lógica
    private ArrayList<String> anterior = new ArrayList<>();
    private ArrayList<String> vehiculo = new ArrayList<>(Arrays.asList("No existe información para esa ruta"));
    private JButton btnModificar;

    public AdminGUI() {
        setTitle("Menú de Administrador");
        setSize(600, 600);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLayout(null);
        setLocationRelativeTo(null);
        
        JLabel lblTitulo = new JLabel("Menú de Administrador");
        lblTitulo.setFont(new java.awt.Font("Arial", 1, 20));
        lblTitulo.setBounds(200, 20, 500, 30);
        add(lblTitulo);
        
        // Crear botones para cada opción

        JButton btnUsuario = new JButton("usuario");
        btnUsuario.setFont(new java.awt.Font("Arial", 1, 10));
        btnUsuario.setBackground(new java.awt.Color(230, 210, 230));
        btnUsuario.setBounds(450, 15, 110, 30);
        add(btnUsuario);

        JButton btnHorarios = new JButton("Editar horarios");
        btnHorarios.setFont(new java.awt.Font("Arial", 1, 15));
        btnHorarios.setBackground(new java.awt.Color(50, 100, 200));
        btnHorarios.setBounds(320, 350, 200, 60);
        add(btnHorarios);

        JButton btnTarifas = new JButton("Editar tarifas");
        btnTarifas.setFont(new java.awt.Font("Arial", 1, 15));
        btnTarifas.setBackground(new java.awt.Color(20, 100, 200));
        btnTarifas.setBounds(70, 350, 200, 60);
        add(btnTarifas);

        JButton btnHistorial = new JButton("Editar Historial");
        btnHistorial.setFont(new java.awt.Font("Arial", 1, 15));
        btnHistorial.setBackground(new java.awt.Color(0, 255, 200));
        btnHistorial.setBounds(320, 275, 200, 60);
        add(btnHistorial);

        JButton btnBusqueda = new JButton("Editar barrios");
        btnBusqueda.setFont(new java.awt.Font("Arial", 1, 15));
        btnBusqueda.setBackground(new java.awt.Color(0, 255, 200));
        btnBusqueda.setBounds(70, 275, 200, 60);
        add(btnBusqueda);

        JButton btnSalir = new JButton("Salir de la aplicación");
        btnSalir.setFont(new java.awt.Font("Arial", 1, 15));
        btnSalir.setBackground(new java.awt.Color(255, 200, 200));
        btnSalir.setBounds(195, 450, 200, 60);
        add(btnSalir);

        btnModificar = new JButton("Modificar ruta ");
        btnModificar.setFont(new java.awt.Font("Arial", 1, 15));
        btnModificar.setBackground(new java.awt.Color(40, 100, 25));
        btnModificar.setForeground(java.awt.Color.WHITE);
        btnModificar.setBounds(70, 200, 200, 60);
        add(btnModificar);

        JButton btnEliminar = new JButton("Eliminar ruta");
        btnEliminar.setFont(new java.awt.Font("Arial", 1, 15));
        btnEliminar.setBackground(new java.awt.Color(255, 30, 50));
        btnEliminar.setForeground(java.awt.Color.WHITE);
        btnEliminar.setBounds(320, 200, 200, 60);
        add(btnEliminar);
        
        JButton btnAgregar = new JButton("Agregar nueva ruta");
        btnAgregar.setFont(new java.awt.Font("Arial", 1, 17));
        btnAgregar.setBackground(new java.awt.Color(50, 20, 40));
        btnAgregar.setForeground(java.awt.Color.WHITE);
        btnAgregar.setBounds(70, 70, 220, 100);
        add(btnAgregar);

        JButton btnprueba = new JButton("Realizar Prueba");
        btnprueba.setFont(new java.awt.Font("Arial", 1, 17));
        btnprueba.setBackground(new java.awt.Color(50, 20, 40));
        btnprueba.setForeground(java.awt.Color.WHITE);
        btnprueba.setBounds(305, 70, 219, 100);
        add(btnprueba);
        
        // accion de horario
        btnHorarios.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {

                String semana1 = "6:15", semana2 = "21:00";
                String sabado1 = "6:30 ", sabado2 = "17:45";
                String domingo1 = "8:15", domingo2 = "18:00";

                JOptionPane.showMessageDialog(null, 
                    "Horarios de transporte público:\n" +
                    "Lunes a viernes: "+semana1+" a "+semana2+"\n"+
                    "Sábados: "+sabado1+" a "+sabado2+"\n" +
                    "Domingos: "+domingo1+" a "+domingo2);
                    
                String[] opciones = {"Lunes a viernes", "Sábados", "Domingos"};
                String opcion = (String) JOptionPane.showInputDialog(null, "Seleccione una opción", "Horarios de transporte público", JOptionPane.QUESTION_MESSAGE, null, opciones, null);

                if(opcion == null){
                    JOptionPane.showMessageDialog(null,"Ningun valor ingresado: "+opcion);
                } else if (opcion.equals("Lunes a viernes")){
                        // semanal 
                        String lunesyviernes_inicio = JOptionPane.showInputDialog(null,"A que hora se inicia la semana?: ");
                        String lunesyviernes_final = JOptionPane.showInputDialog(null,"A que hora se termina la semana?: ");
                        semana1 = lunesyviernes_inicio;
                        semana2 = lunesyviernes_final;
                } else if (opcion.equals("Sábados")){
                        // sabados 
                        String sabados_inicio = JOptionPane.showInputDialog(null,"A que hora se inicia el sabado?: ");
                        String sabados_final = JOptionPane.showInputDialog(null,"A que hora se termina el sabado?: ");  
                        sabado1 = sabados_inicio;
                        sabado2 = sabados_final;
                } else if (opcion.equals("Domingos")){
                        // domingos 
                        String domingos_inicio = JOptionPane.showInputDialog(null,"A que hora se inicia el domingos?: ");
                        String domingos_final = JOptionPane.showInputDialog(null,"A que hora se termina el domingos?: "); 
                        domingo1 = domingos_inicio;
                        domingo2 = domingos_final;    
                } else {
                    JOptionPane.showMessageDialog(null,"Opcion no valida: "+opcion);
                }
                JOptionPane.showMessageDialog(null, 
                    "Horarios de transporte público:\n" +
                    "Lunes a viernes: "+semana1+" a "+semana2+"\n"+
                    "Sábados: "+sabado1+" a "+sabado2+"\n" +
                    "Domingos: "+domingo1+" a "+domingo2);
            }
        });
        // accion de tarifas
        btnTarifas.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String tarifa = "La tarifa es de: $3.400";
                JOptionPane.showMessageDialog(null, tarifa);
                String tarifaNueva = JOptionPane.showInputDialog(null, "Cual es la nueva tarifa?: ");
                if(tarifaNueva == null){
                    JOptionPane.showMessageDialog(null,"Ningun valor ingresado: "+tarifa);
                } else {
                    JOptionPane.showMessageDialog(null,"La tarifa actual es de: "+"$"+tarifaNueva);
                }
            }
        });
        // accion de historial
        btnHistorial.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(null, "Destinos anteriores: " + anterior.toString());
                String elemento = JOptionPane.showInputDialog("Que nombre tiene el elemento que sea eliminar?", e);
            for(String i: anterior){
                if(i == elemento){
                    anterior.remove(elemento);
                    JOptionPane.showMessageDialog(null, "Elemento eliminado de la Lista");
                    break;
                    } else if (i.equals(anterior)) {
                        JOptionPane.showMessageDialog(null, "El elemento no se encuentra entra en la Lista");
                        break;
                    } else {
                        break;
                    }
                }
            }
        });
        // accion de usuario 
        btnUsuario.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                    JOptionPane.showMessageDialog(null, "Menu de Usuario");
                    MenuGUI usuario = new MenuGUI();
                    usuario.setVisible(true);
                
            }
        });
        // accion busqueda
        btnBusqueda.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String busqueda = JOptionPane.showInputDialog(null, "¿Por qué barrio te gustaría preguntar?").toLowerCase();
                // Aquí podrías incluir tus listas de localidades y compararlas
                if (localidad1.contains(busqueda) || localidad2.contains(busqueda) || localidad3.contains(busqueda)) {
                    JOptionPane.showMessageDialog(null, "Sí, se encuentra en las rutas.");
                } else {
                    JOptionPane.showMessageDialog(null, "No se encuentra en las rutas.");
                }
            }
        });
        // accion de salir
        btnSalir.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                System.exit(0);
            }
        });
        // accion de agregar 
        btnAgregar.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                // Crear el HashMap para relacionar el bus con los barrios
                HashMap<String, ArrayList<String>> rutas = new HashMap<>();
        
                // Solicitar el nombre del nuevo bus
                String nuevoBus = JOptionPane.showInputDialog(null, "Ingrese el nombre del bus de la nueva ruta:");
                if (nuevoBus == null || nuevoBus.trim().isEmpty()) {
                    JOptionPane.showMessageDialog(null, "El nombre del bus no puede estar vacío.");
                    return;
                }
        
                // Crear la lista de barrios para el nuevo bus
                ArrayList<String> barrios = new ArrayList<>();
        
                while (true) {
                    
                    // Solicitar el nombre del barrio
                    String barrio = JOptionPane.showInputDialog(null, "Ingrese el nombre del barrio (o escriba 'salir' para finalizar):").toLowerCase();
                    if (barrio == null || barrio.equals("salir")) {
                        break;
                    }

                    // Verificar si el barrio pertenece a alguna localidad
                    if (localidad1.contains(barrio)) {
                        JOptionPane.showMessageDialog(null, "El barrio '" + barrio + "' se encuentra en Localidad 1, posición: " + localidad1.indexOf(barrio));
                    } else if (localidad2.contains(barrio)) {
                        JOptionPane.showMessageDialog(null, "El barrio '" + barrio + "' se encuentra en Localidad 2, posición: " + localidad2.indexOf(barrio));
                    } else if (localidad3.contains(barrio)) {
                        JOptionPane.showMessageDialog(null, "El barrio '" + barrio + "' se encuentra en Localidad 3, posición: " + localidad3.indexOf(barrio));
                    } else {
                        JOptionPane.showMessageDialog(null, "El barrio '" + barrio + "' no se encuentra en ninguna localidad.");
                        continue; 
                    }
        
                    barrios.add(barrio);
                }
    
                rutas.put(nuevoBus, barrios);
        
                // Mostrar la ruta creada
                JOptionPane.showMessageDialog(null, "Ruta agregada exitosamente:\nBus: " + nuevoBus + "\nBarrios: " + barrios);
            }
        });
        // aacion de modificar
        btnModificar.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                
            }   
        });
        // accion de eliminar
        btnEliminar.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String rutaEliminar = JOptionPane.showInputDialog(null, "Ingrese la ruta a eliminar:");
                JOptionPane.showMessageDialog(null, "Ruta modificada exitosamente");
                }
            });
        // accion de prueba
        btnprueba.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String ubicacion = JOptionPane.showInputDialog(null, "Escribe el nombre del barrio donde te encuentras:").toLowerCase();
                String destino = JOptionPane.showInputDialog(null, "Hacia dónde te diriges?").toLowerCase();
                anterior.add(destino);

                // Aquí implementamos tu lógica de vehículos (simplificada como ejemplo)
                if (caracoles.contains(ubicacion) && caracoles.contains(destino)) {
                    vehiculo.set(0, "Caracoles");
                } else if (bayunca.contains(ubicacion) && bayunca.contains(destino)) {
                    vehiculo.set(0, "Bayunca");
                } else if (pasacaballo.contains(ubicacion) && pasacaballo.contains(destino)) {
                    vehiculo.set(0, "Pasacaballo");
                } else if (socorro.contains(ubicacion) && socorro.contains(destino)) {
                    vehiculo.set(0, "Socorro");
                } else if (vehitrasn.contains(ubicacion) && vehitrasn.contains(destino)) {
                    vehiculo.set(0, "Vehitrasn");
                } else if (microBus.contains(ubicacion) && microBus.contains(destino)) {
                    vehiculo.set(0, "MicroBus");
                } else if (sanFernando.contains(ubicacion) && sanFernando.contains(destino)) {
                    vehiculo.set(0, "San Fernando");
                } else {
                    vehiculo.set(0, "No existe información para esa ruta");
                }

                JOptionPane.showMessageDialog(null, "Mejor opción: " + vehiculo.get(0));
                }
            });
        }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
        AdminGUI menu = new AdminGUI();
        menu.setVisible(true);
        });
    }
}

