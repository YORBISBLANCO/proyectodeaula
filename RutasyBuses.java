package aplicacion;

import java.util.ArrayList;
import java.util.Arrays;
import javax.swing.JOptionPane;

public class RutasyBuses extends Localidades {

    // Buses
    protected ArrayList<String> Caracoles = new ArrayList<>(Arrays.asList(
        localidad3.get(9), localidad3.get(0), localidad3.get(19), localidad3.get(14), 
        localidad2.get(30), localidad1.get(14), localidad2.get(0), localidad1.get(21), 
        localidad1.get(2), localidad1.get(16), localidad3.get(2), localidad3.get(3), 
        localidad1.get(17), localidad1.get(13), localidad3.get(65)
        ));
    protected ArrayList<String> campestre = new ArrayList<>();

    protected ArrayList<String> bayunca = new ArrayList<>();

    protected ArrayList<String> vehitrasn = new ArrayList<>(Arrays.asList(
        localidad1.get(18), localidad2.get(30), localidad1.get(13)
        ));

    protected ArrayList<String> socorro = new ArrayList<>(Arrays.asList(
        localidad1.get(0), localidad3.get(17)
        ));

    protected ArrayList<String> pasacaballo = new ArrayList<>(Arrays.asList(
        localidad3.get(4), localidad3.get(70), localidad3.get(0), localidad3.get(16), 
        localidad3.get(17), localidad1.get(21), localidad1.get(2), localidad3.get(66), 
        localidad3.get(2)
        ));

    protected ArrayList<String> microBus = new ArrayList<>(Arrays.asList(localidad1.get(14)));

    protected ArrayList<String> sanFernando = new ArrayList<>(Arrays.asList(localidad3.get(40)));
}