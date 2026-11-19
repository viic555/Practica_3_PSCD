public class Practica3 {

    private static int enteroEnRango(String texto, String nombre, int maximo) {
        final int numero;
        try {
            numero = Integer.parseInt(texto);
        } catch (NumberFormatException ex) {
            throw new IllegalArgumentException(nombre + " debe ser un entero entre 1 y " + maximo);
        }
        if (numero < 1 || numero > maximo) {
            throw new IllegalArgumentException(nombre + " debe estar entre 1 y " + maximo);
        }
        return numero;
    }

    private static void mostrarUso() {
        System.err.println("Uso: java Practica3 <N> <P> <W> <C>");
        System.err.println("N: 1..1000; P: 1..8; W: 1..8, C: 1..32");
    }

    public static void main(String[] args) throws InterruptedException {
        try{
            if(args.length != 4){
                throw new IllegalArgumentException("El numero de argumentos debe ser exactamente 4.");
            }
            int trabajos = enteroEnRango(args[0], "N", 1000);
            int generadores = enteroEnRango(args[1], "P", 8);
            int trabajadores = enteroEnRango(args[2],"W", 8);
            int capacidadCola= enteroEnRango(args[3],"C", 32);

            // Generar tantos generadores como se pasen por argumento.
            Generador[] genArray = new Generador[generadores];
            // Generar tantos trabajadores como se pasen por argumento.
            Trabajador[] trabArray = new Trabajador[trabajadores];
            // Generar una cola con la capacidad de trabajos que se pase por argumento.
            ColaTrabajos cola = new ColaTrabajos(capacidadCola);
            
            // Distribuir entre los generadores la cantidad de trabajos que tienen que generar.
            // autoincrementar id de cada generador
            // dividir número de trabajos entre número de generadores
            // si la división no es exacta, que del resto se encargue otro
            
            // encolar los trabajos que se vayan generando (semaforos en espera cuando la capacidad de la cola esté al máximo)

            // Que el trabajador recoja el trabajo y eleve al cuadrado el trabajo.
            // Mostrar el hilo trabajador y su resultado
            // Mostrar resumen

        } catch (IllegalArgumentException ex) {
            System.err.println("Error: " + ex.getMessage());
            mostrarUso();
            System.exit(2);
        } catch (UnsupportedOperationException ex) {
            System.err.println("Plantilla pendiente: " + ex.getMessage());
            System.exit(3);
        }
    }


}
