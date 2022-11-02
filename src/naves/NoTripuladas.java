package naves;


import interfaces.ComportamientoNoTripuladas;

public class NoTripuladas extends NaveEspacial implements ComportamientoNoTripuladas {
    private int celdasFotovoltaicas;

    //Constructores
    public NoTripuladas(String nombre, String velocidad, String potencia, String peso, String capacidadEmpuje, String nacionalidad, int celdasFotovoltaicas) {
        super(nombre, velocidad, potencia, peso, capacidadEmpuje, nacionalidad);
        this.celdasFotovoltaicas = celdasFotovoltaicas;
    }
    public NoTripuladas(){

    }

    //Métodos abstractos
    @Override
    public String despegar() {
        return "Mi forma de despegar hacia el espacio es por medio de la nave Lanzadera";
    }

    @Override
    public String empujar() {
        return "Como soy una nave no tripulada mi empuje es menor";
    }

    @Override
    public int identificador() {
        return 2;
    }

    //Métodos implementados de la interface ComportamientoNoTripuladas
    @Override
    public String estudiarCuerposCelestes() {
        return "Tengo la mision de observar otros planetas para estudios científicos";
    }

    @Override
    public String desplazarsePlanetas() {
        return "Gracias a mi paneles solares puedo viajar a una gran velocidad para visitar otros planetas cercanos";
    }

    @Override
    public String toString(){
        return "Nave No Tripulada: " + getNombre() + "\nCantidad de Celdas Fotovoltaicas= " + getCeldasFotovoltaicas() +
                "\nVelocidad= " + getVelocidad() + "\nPotencia= " + getPotencia() + "\nPeso= " + getPeso() +
                "\nCapacidad de Empuje= " + getCapacidadEmpuje() + "\nNacionalidad= " + getNacionalidad();
    }

    //Getter y Setters
    public int getCeldasFotovoltaicas() {
        return celdasFotovoltaicas;
    }

    public void setCeldasFotovoltaicas(int celdasFotovoltaicas) {
        this.celdasFotovoltaicas = celdasFotovoltaicas;
    }
}
