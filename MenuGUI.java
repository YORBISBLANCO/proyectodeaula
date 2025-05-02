package aplicacion;

import javax.swing.*;
import java.awt.TextArea;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;  
import java.util.Arrays;

public class MenuGUI extends JFrame {
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

    public MenuGUI() {
        // Configuración de la ventana
        setTitle("Menú de Transporte");
        setSize(600, 600);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        // Diseño absoluto
        setLayout(null);
        // Centrar ventana
        setLocationRelativeTo(null); 

        // titulo
        JLabel lblTitulo = new JLabel("Menú de Transporte");
        lblTitulo.setFont(new java.awt.Font("Arial", 1, 20));
        lblTitulo.setBounds(200, 20, 500, 30);
        add(lblTitulo);

        //textos informativos
        TextArea lbltransporte = new TextArea("Ingresa para saber que bus te es de mayor utilidad y asi lograr mucho\n                                          más rapido llegar a tu destino");
        lbltransporte.setFont(new java.awt.Font("Comic Sans MS",1,13));
        lbltransporte.setBounds(70, 60, 450, 50);
        add(lbltransporte);

        // Crear botones para cada opción
        JButton btnVehiculo = new JButton("Mejor alternativa de transporte");
        btnVehiculo.setFont(new java.awt.Font("Arial", 1, 15));
        btnVehiculo.setBackground(new java.awt.Color(200, 200, 100));
        btnVehiculo.setBounds(70, 120, 450, 100);
        add(btnVehiculo);

        JButton btnadministrador = new JButton("Administrador");
        btnadministrador.setFont(new java.awt.Font("Arial", 1, 10));
        btnadministrador.setBackground(new java.awt.Color(230, 210, 230));
        btnadministrador.setBounds(450, 15, 110, 30);
        add(btnadministrador);

        JButton btnHorarios = new JButton("Ver horarios");
        btnHorarios.setFont(new java.awt.Font("Arial", 1, 15));
        btnHorarios.setBackground(new java.awt.Color(50, 100, 200));
        btnHorarios.setBounds(320, 250, 200, 80);
        add(btnHorarios);

        JButton btnTarifas = new JButton("Ver tarifas");
        btnTarifas.setFont(new java.awt.Font("Arial", 1, 15));
        btnTarifas.setBackground(new java.awt.Color(20, 100, 200));
        btnTarifas.setBounds(70, 250, 200, 80);
        add(btnTarifas);

        JButton btnHistorial = new JButton("Historial de destinos");
        btnHistorial.setFont(new java.awt.Font("Arial", 1, 15));
        btnHistorial.setBackground(new java.awt.Color(0, 255, 200));
        btnHistorial.setBounds(320, 350, 200, 80);
        add(btnHistorial);

        JButton btnBusqueda = new JButton("Búsqueda de barrios");
        btnBusqueda.setFont(new java.awt.Font("Arial", 1, 15));
        btnBusqueda.setBackground(new java.awt.Color(0, 255, 200));
        btnBusqueda.setBounds(70, 350, 200, 80);
        add(btnBusqueda);

        JButton btnSalir = new JButton("Salir de la aplicación");
        btnSalir.setFont(new java.awt.Font("Arial", 1, 15));
        btnSalir.setBackground(new java.awt.Color(255, 200, 200));
        btnSalir.setBounds(195, 450, 200, 50);
        add(btnSalir);

        // Añadir funcionalidad a los botones
        btnVehiculo.addActionListener(new ActionListener() {
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

        btnHorarios.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(null, 
                    "Horarios de transporte público:\n" +
                    "Lunes a viernes: 6:15 a 21:00\n" +
                    "Sábados: 6:30 a 12:00 y 14:15 a 17:45\n" +
                    "Domingos: 8:15 a 12:00 y 13:45 a 18:00");
            }
        });

        btnTarifas.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(null, "La tarifa es de: $3.400");
            }
        });

        btnHistorial.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(null, "Destinos anteriores: " + anterior.toString());
            }
        });

        btnadministrador.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                // constantes de usuario y contraseña
                String adminUsuario = "proyecto123";
                String adminContraseña = "123456";

                String usuario = JOptionPane.showInputDialog(null, "Ingrese su usuario:").toLowerCase();
                String contraseña = JOptionPane.showInputDialog(null, "Ingrese su contraseña:").toLowerCase();

                if (usuario.equals(adminUsuario) && contraseña.equals(adminContraseña)) {
                    JOptionPane.showMessageDialog(null, "Bienvenido administrador");
                    AdminGUI admin = new AdminGUI();
                    admin.setVisible(true);
                } else if (usuario == null || contraseña == null) {
                    JOptionPane.showMessageDialog(null, "Operación cancelada.");
                    return;
                } else {
                    JOptionPane.showMessageDialog(null, "Usuario o contraseña incorrectos");
                }
            }
        });

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

        btnSalir.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                System.exit(0);
            }
        });
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            MenuGUI menu = new MenuGUI();
            menu.setVisible(true);
        });
    }
}