package naves;

import interfaces.ComportamientoNoTripuladas;
import interfaces.ComportamientoTripuladas;
import interfaces.NaveLanzadera;

public abstract class  NaveEspacial {
    private String nombre;
    private String velocidad;
    private String potencia;
    private String peso;
    private String capacidadEmpuje;
    private String nacionalidad;


    //Constructor
    public NaveEspacial(String nombre, String velocidad, String potencia, String peso, String capacidadEmpuje, String nacionalidad) {
        this.nombre = nombre;
        this.velocidad = velocidad;
        this.potencia = potencia;
        this.peso = peso;
        this.capacidadEmpuje = capacidadEmpuje;
        this.nacionalidad = nacionalidad;
    }
     public NaveEspacial(){

     }

    //Métodos abstractos
    public  abstract String despegar();

    public abstract String empujar();

    public abstract int identificador();


    //Getters and Setters
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getVelocidad() {
        return velocidad;
    }

    public void setVelocidad(String velocidad) {
        this.velocidad = velocidad;
    }

    public String getPotencia() {
        return potencia;
    }

    public void setPotencia(String potencia) {
        this.potencia = potencia;
    }

    public String getPeso() {
        return peso;
    }

    public void setPeso(String peso) {
        this.peso = peso;
    }

    public String getCapacidadEmpuje() {
        return capacidadEmpuje;
    }

    public void setCapacidadEmpuje(String capacidadEmpuje) {
        this.capacidadEmpuje = capacidadEmpuje;
    }

    public String getNacionalidad() {
        return nacionalidad;
    }

    public void setNacionalidad(String nacionalidad) {
        this.nacionalidad = nacionalidad;
    }


}

