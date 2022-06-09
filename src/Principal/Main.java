package Principal;

import java.util.Arrays;

public class Main {
    /**
     * 1. Escribe los otros métodos directos (selección e inserción) de forma polmórfica.
     * 2. Prueba los métodos con arrays de cualquier clase que hayas implementado en las
     * unidades anteriores y a la que hayas dotado de un método compareTo. Usa al menos
     * dos clases distintas.
     * 3. Comprueba cómo, al cambiar el criterio de comparación (modificando el método
     * compareTo) se obtiene una secuencia ordenada diferente.
     * @param args
     */

    public static Comparable[] personas = new Persona[10]; //variable de la interfaz Comparable
    public static Comparable[] perros = new Perro[10]; //variable de la interfaz Comparable

    public static void main(String[] args) {

        personas=Utilidades.cargarPersonas();
        perros=Utilidades.cargarPerros();

        Utilidades.ordenarGenericoBurbuja(perros);
        Utilidades.ordenarGenericoSeleccionDirecta(personas);

        System.out.println("Personas ordenadas de mayor a menor edad");
        System.out.println(Arrays.toString(personas));
        System.out.println("Perros ordenados por orden alfabetico");
        System.out.println(Arrays.toString(perros));

    }
}
