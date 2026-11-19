public class Generador extends Thread {
    private final int id;
    private final ColaTrabajos cola;
    private final int inicioTrabajos;
    private final int finTrabajos;
    int generados;

    public int getGenerados() {
        return generados;
    }

    public Generador (int id, ColaTrabajos cola, int inicioTrabajos, int finTrabajos){
        this.id = id;
        this.cola = cola;
        this.inicioTrabajos = inicioTrabajos;
        this.finTrabajos = finTrabajos;
    }

    @Override
    public void run() {
        try {
            for (int trabajo = inicioTrabajos; trabajo <= finTrabajos; trabajo++) {
                cola.insertar(trabajo);
                generados++;
            }
        } catch (InterruptedException e) {
        Thread.currentThread().interrupt();
        }
    }
    
}
