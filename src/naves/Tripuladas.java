package naves;

import interfaces.ComportamientoTripuladas;

public class Tripuladas extends NaveEspacial implements ComportamientoTripuladas {
    private int pasajeros;

    //Constructores
    public Tripuladas(String nombre, String velocidad, String potencia, String peso, String capacidadEmpuje, String nacionalidad, int pasajeros) {
        super(nombre, velocidad, potencia, peso, capacidadEmpuje, nacionalidad);
        this.pasajeros = pasajeros;
    }
    public Tripuladas(){}

    //Métodos abstractos
    @Override
    public String despegar() {
        return "Mi forma de despegar hacia el espacio es por medio de la nave Lanzadera y ademas transporto pasajeros";
    }
    @Override
    public String empujar() {
        return "Mi empuje es el menor de todos ya que la mayor parte del tiempo voy a orbitar";
    }

    @Override
    public int identificador() {
        return 3;
    }

    //Métodos implementados de la interface ComportamientoTripuladas
    @Override
    public String transportarAstronautas() {
        return "Soy una nave diseñada para albergar tripulantes por largos periodos de tiempo en misiones espaciales";
    }

    @Override
    public String misionesLunares() {
        return "Transporto astronautas y equipos especializados hasta la luna";
    }

    @Override
    public String comportamientoHumano() {
        return "Estoy adecuado para que los astronautas vivan un largo periodo de tiempo para el estudio de su comportamiento en condiciones ingravidas";
    }

    @Override
    public String mantenimientos() {
        return "Para satelites, probar acoplamientos con otras naves y equipos electrónicos ";
    }

    @Override
    public String toString(){
        return "Nave Tripulada: " + getNombre() + "\nCantidad de Pasajeros= " + getPasajeros() +
                "\nVelocidad= " + getVelocidad() + "\nPotencia= " + getPotencia() + "\nPeso= " + getPeso() +
                "\nCapacidad de Empuje= " + getCapacidadEmpuje() + "\nNacionalidad= " + getNacionalidad();
    }

    //Getters y Setters

    public int getPasajeros() {
        return pasajeros;
    }

    public void setPasajeros(int pasajeros) {
        this.pasajeros = pasajeros;
    }
}
