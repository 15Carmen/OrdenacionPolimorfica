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

    public static Comparable[] cargarPerros() {
        Comparable[] perros = new Perro[]{
                new Perro("Choco", "rubio", 12),
                new Perro("Thor", "negro", 23),
                new Perro("Moraima", "blanco y marron", 34),
                new Perro("Alma", "marron", 45),
                new Perro("Moqueta", "negro y marron", 56),
                new Perro("Turron", "marron", 67),
        };
        return perros;
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

    public static void ordenarGenericoSeleccionDirecta(Comparable[] comparables){

        Comparable aux = null;
        int minimo=0;
        for (int i = 0; i < comparables.length; i++){
            minimo=i;
           for (int j = i+1; j < comparables.length; j++){
               if (comparables[minimo].compareTo(comparables[j])>0){
                   minimo=j;
               }
           }
            aux = comparables[i];
            comparables[i] = comparables[minimo];
            comparables[minimo] = aux;

        }
    }

}
