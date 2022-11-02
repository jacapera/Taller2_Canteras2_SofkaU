import naves.Lanzadera;
import naves.NaveEspacial;
import naves.NoTripuladas;
import naves.Tripuladas;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner seleccion = new Scanner(System.in);
        BaseDatos datos = new BaseDatos();
        datos.crearArrayList();
        int opcion;
        boolean salir = false;

        while(!salir){
            try{
                System.out.println("BIENVENIDO A MI PROGRAMA: 'CREA TU NAVE ESPACIAL'" +
                        "\n---------------------------------------------------" );
                System.out.println("1. Para crear una nave espacial tipo Lanzadera");
                System.out.println("2. Para crear una nave espacial tipo No Tripulada");
                System.out.println("3. Para crear una nave espacial tipo Tripulada");
                System.out.println("4. Ver naves creadas");
                System.out.println("5. Para salir del programa");
                System.out.println("Escoje una de las opciones");
                opcion = seleccion.nextInt();

                switch(opcion){
                    case 1:
                        Scanner ingreso = new Scanner(System.in);
                        System.out.println("Vas a crear una nave espacial tipo Lanzadera" +
                                "\n------------------------------------------------");
                        System.out.println("Ingresa el nombre: ");
                        String nombre = ingreso.nextLine(); //"Saturno V" - "Energia"
                        System.out.println("Ingresa la altura: ");
                        String altura = ingreso.nextLine(); //100 metros - 60 metros
                        System.out.println("Ingresa la potencia: ");
                        String potencia = ingreso.nextLine(); //"32000x5 caballos" -
                        System.out.println("Ingresa tipo de combustible: ");
                        String combustible = ingreso.nextLine(); // "dimetilhidracina-oxido de nitrógeno"
                        System.out.println("ingresa la velocidad: ");
                        String velocidad = ingreso.nextLine(); //"40.300km/h"
                        System.out.println("Ingresa el peso: ");
                        String peso = ingreso.nextLine(); //"2900 toneladas"
                        System.out.println("Ingresa la capacidad de empuje: ");
                        String capacidadEmpuje = ingreso.nextLine(); //"3500 toneladas"
                        System.out.println("Ingresa la nacionalidad: ");
                        String nacionalidad = ingreso.nextLine(); //"EE.UU"
                        NaveEspacial lanzadera = new Lanzadera(nombre, altura, potencia, combustible, velocidad, peso,
                                capacidadEmpuje, nacionalidad);
                        datos.agregar(lanzadera);
                        System.out.println("Nave creada exitosamente");
                        break;
                    case 2:
                        Scanner ingreso2 = new Scanner(System.in);
                        System.out.println("Vas a crear una nave espacial tipo No Tripulada" +
                                "\n------------------------------------------------");
                        System.out.println("Ingresa el nombre: ");
                        String nombre2 = ingreso2.nextLine();
                        System.out.println("Ingresa la velocidad: ");
                        String velocidad2 = ingreso2.nextLine();
                        System.out.println("Ingresa la potencia: ");
                        String potencia2 = ingreso2.nextLine();
                        System.out.println("Ingresa el peso: ");
                        String peso2 = ingreso2.nextLine();
                        System.out.println("Ingresa la capacidad de empuje: ");
                        String capacidadEmpuje2 = ingreso2.nextLine();
                        System.out.println("Ingresa la nacionalidad: ");
                        String nacionalidad2 = ingreso2.nextLine();
                        System.out.println("Ingresa cantidad de Celdas Fotovoltaicas: ");
                        int celdasFotovoltaicas = ingreso2.nextInt();
                        NaveEspacial noTripuladas = new NoTripuladas(nombre2, velocidad2, potencia2, peso2,
                                capacidadEmpuje2, nacionalidad2, celdasFotovoltaicas);
                        datos.agregar(noTripuladas);
                        System.out.println("Nave creada exitosamente");
                        break;
                    case 3:
                        Scanner ingreso3 = new Scanner(System.in);
                        System.out.println("Vas a crear una nave espacial de tipo Tripuladas" +
                                "\n------------------------------------------------");
                        System.out.println("Ingresa el nombre: ");
                        String nombre3 = ingreso3.nextLine();
                        System.out.println("Ingresa la potencia: ");
                        String potencia3 = ingreso3.nextLine();
                        System.out.println("Ingresa la velocidad: ");
                        String velocidad3 = ingreso3.nextLine();
                        System.out.println("Ingresa el peso: ");
                        String peso3 = ingreso3.nextLine();
                        System.out.println("Ingresa la capacidad de empuje: ");
                        String capacidadEmpuje3 = ingreso3.nextLine();
                        System.out.println("Ingresa la nacionalidad: ");
                        String nacionalidad3 = ingreso3.nextLine();
                        System.out.println("Ingresa la capacidad de pasajeros: ");
                        int pasajeros = ingreso3.nextInt();
                        NaveEspacial tripuladas = new Tripuladas(nombre3, velocidad3, potencia3, peso3,
                                capacidadEmpuje3, nacionalidad3, pasajeros);
                        datos.agregar(tripuladas);
                        System.out.println("Nave creada exitosamente");
                        break;
                    case 4:
                        datos.presentarInformacion();
                        break;
                    case 5:
                        salir = true;
                        break;

                    default:
                        System.out.println("Debes escojer una opcion del 1 al 5" +
                                "\n--------------------------------------------------");
                }
            }catch (InputMismatchException e){
                System.out.println("debes ingresar un número entero positivo\n");
                seleccion.next();
            }
        }
    }
}
