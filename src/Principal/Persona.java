package Principal;

public class Persona implements Comparable<Persona>{

    /**
     * Atributos
     */
    private String nombre;
    private int edad;
    private String dni;


    /**
     * Constructor por defecto
     */

    public Persona(){}

    /**
     * Constructor con parametros
     * @param nombre
     * @param edad
     * @param dni
     */

    public Persona(String nombre, int edad, String dni) {
        this.nombre = nombre;
        this.edad = edad;
        this.dni = dni;

    }

    /**
     * constructor copia
     * @param copyPerson
     */

    public Persona(Persona copyPerson) {
        this.nombre = copyPerson.nombre;
        this.edad = copyPerson.edad;
        this.dni = copyPerson.dni;
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


    public int getEdad() {
        return edad;
    }
    public void setEdad(int edad) {
        this.edad = edad;
    }


    public String getDni() {
        return dni;
    }
    public void setDni(String dni) {
        this.dni = dni;
    }

    @Override
    public String toString() {
        return String.format("s%, d%, s%", nombre, edad, dni);
    }

    @Override
    public int compareTo(Persona personita) {
        if (this.edad != personita.getEdad()) {
            return this.edad - personita.getEdad();
        }
        return this.nombre.compareTo(personita.getNombre());
    }
}

