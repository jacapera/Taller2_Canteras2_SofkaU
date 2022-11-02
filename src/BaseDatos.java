import naves.Lanzadera;
import naves.NaveEspacial;
import naves.NoTripuladas;
import naves.Tripuladas;

import java.util.ArrayList;

public class BaseDatos {

    private ArrayList<NaveEspacial> navesEspaciales;
    private Lanzadera lanzadera = new Lanzadera();
    private NoTripuladas noTripuladas = new NoTripuladas();
    private Tripuladas tripuladas = new Tripuladas();

    public BaseDatos() {
    }

    public void crearArrayList(){
        navesEspaciales = new ArrayList<>();
    }
    public void agregar(NaveEspacial naveEspacial){
        navesEspaciales.add(naveEspacial);
    }

    public String presentarInformacion(){
        String presentacion = "";
        for(int i = 0; i<navesEspaciales.size(); i++){
            presentacion = navesEspaciales.get(i).toString();
            System.out.println("--------------\n" +"     " + (i+1)
                           + "\n--------------");
            System.out.println(presentacion);
            System.out.println("-----------------------------------------------------------------------------------"
                    + "\nFuncionalidad: ");
            System.out.println("1. despegar: " + navesEspaciales.get(i).despegar() +
                    "\n2. empujar: " + navesEspaciales.get(i).empujar());
            if(navesEspaciales.get(i).identificador() == 1){
                System.out.println("3. Lanzar Satelites: " + lanzadera.lanzarSatelite());
                System.out.println("4. Lanzar Zonda: " + lanzadera.lanzarZonda());
                System.out.println("5. Lanzar Nave Tripulada: " + lanzadera.lanzarNaveTripulada() +
                             "\n-----------------------------------------------------------------------------------\n");
            }else if(navesEspaciales.get(i).identificador() == 2){
                System.out.println("3. Estudiar cuerpos celestes: " + noTripuladas.estudiarCuerposCelestes());
                System.out.println("4. Viajar a otros planetas: " + noTripuladas.desplazarsePlanetas() +
                             "\n-----------------------------------------------------------------------------------\n");
            }else if(navesEspaciales.get(i).identificador() == 3){
                System.out.println("3. Transportar astronautas: " + tripuladas.transportarAstronautas());
                System.out.println("4. Misiones Lunares: " + tripuladas.misionesLunares());
                System.out.println("5. Experimentaciones: " + tripuladas.comportamientoHumano());
                System.out.println("6. Mantenimientos: " + tripuladas.mantenimientos() +
                        "\n-----------------------------------------------------------------------------------\n");
            }
        }
        return presentacion;
    }
}
