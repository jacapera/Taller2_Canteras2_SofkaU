package naves;

import interfaces.NaveLanzadera;

public class Lanzadera extends NaveEspacial implements NaveLanzadera {
    private String altura;
    private String combustible;

    //Contructor
    public Lanzadera(String nombre, String velocidad, String potencia, String peso, String capacidadEmpuje, String nacionalidad, String altura, String combustible) {
        super(nombre, velocidad, potencia, peso, capacidadEmpuje, nacionalidad);
        this.altura = altura;
        this.combustible = combustible;
    }
    public Lanzadera(){

    }

    //Métodos abstractos de la clase Padre
    @Override
    public String despegar() {
        return "Escapar de la atracción gravitatoria";
    }

    @Override
    public String empujar() {
        return "Como soy una nave tipo lanzadera mi empuje equivale a muchas toneladas";
    }

    @Override
    public int identificador() {
        return 1;
    }

    //Métodos implementados de la Inteface NaveLanzadera
    @Override
    public String lanzarSatelite() {
        return "Mi objetivo principal es poner un satelite artificial en orbita";
    }

    @Override
    public String lanzarZonda() {
        return "Mi objetivo principal es enviar una zonda al espacio para una misión";
    }

    @Override
    public String lanzarNaveTripulada() {
        return "Mi objetivo principal es poner en orbita una nave tripulada para misiones espaciales";
    }

    @Override
    public String toString(){
        return "Nave lanzadera: " + getNombre() + "\nAltura= " + getAltura() +
                "\nCombustible= " + getCombustible() + "\nVelocidad= " + getVelocidad() +
                "\nPotencia= " + getPotencia() + "\nPeso= " + getPeso() +
                "\nCapacidad de Empuje= " + getCapacidadEmpuje() + "\nNacionalidad= " + getNacionalidad();
    }

    //Getters y Setters
    public String getAltura() {
        return altura;
    }

    public void setAltura(String altura) {
        this.altura = altura;
    }

    public String getCombustible() {
        return combustible;
    }

    public void setCombustible(String combustible) {
        this.combustible = combustible;
    }

}
