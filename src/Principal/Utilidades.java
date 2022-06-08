package Principal;

public class Utilidades {

    public static Comparable[] cargarPersonas() {
        Comparable[] personas = new Persona[]{
                new Persona("Carmen", 19, "54578462L"),
                new Persona("Jesus", 20, "96547812K"),
                new Persona("Pedro", 20, "78451296M"),
                new Persona("Eva", 42, "32145698B"),
                new Persona("David", 13, "98562321M"),
                new Persona("Candela", 15, "85417562G"),
                new Persona("Maria", 36, "35789512F")
        };
        return personas;
    }

    /**
     * Ordenamos la edad de las personas de menor a mayor
     * @param comparables
     */
    public static void ordenarGenericoBurbuja(Comparable[] comparables) {

        Comparable aux = null;
        for (int i = 0; i < comparables.length - 1; i++) {
            for (int j = i + 1; j < comparables.length; j++) {
                if (comparables[i].compareTo(comparables[j]) < 0) {
                    aux = comparables[i];
                    comparables[i] = comparables[j];
                    comparables[j] = aux;
                }
            }
        }
    }

    public static void ordenarGenericoInsercionDirecta(Comparable[] comparables){

        Comparable aux = null;
        for (int p = 1; p < comparables.length; p++){
            aux = comparables[p];
            int j = p - 1;
            while ((j >= 0) &&
                    (comparables[p].compareTo(comparables[j]) < 0)){

                comparables[j + 1] = comparables[j];
                j--;
            }
            comparables[j + 1] = aux;
        }


    }

}
