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
