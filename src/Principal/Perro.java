package Principal;

import java.util.Objects;

public class Perro implements Comparable <Perro>{

    /**
     * Atributos
     */
    private String nombre;
    private String color;
    private int chip;


    /**
     * Constructor por defecto
     */

    public Perro(){}

    /**
     * Constructor con parametros
     * @param nombre
     * @param color
     * @param chip
     */

    public Perro(String nombre, String color,int chip) {
        this.nombre = nombre;
        this.color = color;
        this.chip = chip;

    }

    /**
     * constructor copia
     * @param copyPerro
     */

    public Perro(Perro copyPerro) {
        this.nombre = copyPerro.nombre;
        this.color = copyPerro.color;
        this.chip = copyPerro.chip;
    }

    /**
     * getters y setters
     * @return
     */

    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getColor() {
        return color;
    }
    public void setColor(String color) {
        this.color = color;
    }

    public int getChip() {
        return chip;
    }
    public void setChip(int chip) {
        this.chip = chip;
    }

    @Override
    public String toString() {
        return String.format("%S, %S, %d \n", nombre, color, chip);
    }

    @Override
    public int compareTo(Perro perro) {
        return perro.getNombre().compareTo(getNombre());
    }
}

