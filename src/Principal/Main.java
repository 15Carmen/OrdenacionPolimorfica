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

    public static void main(String[] args) {

        Persona [] personas = { new Persona("Carmen", 19,"123L"),
                new Persona("Jesus", 20,"456K"),
                new Persona("Eva", 42,"789J"),
                new Persona("Manu", 20,"567M") };


        System.out.println(Arrays.toString(personas));
    }
}
