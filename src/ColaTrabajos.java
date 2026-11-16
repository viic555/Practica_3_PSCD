import java.util.ArrayDeque;
import java.util.concurrent.Semaphore;

/**
 * ColaTrabajos
 */
public class ColaTrabajos {
    private final ArrayDeque<Integer> buffer;

    final Semaphore mutex;
    final Semaphore huecosLibres;
    final Semaphore datosDisponibles;

    public ColaTrabajos(int capacidad){
        this.buffer = new ArrayDeque<>();

        this.mutex= new Semaphore(1);
        this.huecosLibres = new Semaphore(capacidad);
        this.datosDisponibles = new Semaphore(0);
    }

    void insertar(int idTrabajo) throws InterruptedException{
        // TODO

    }

    int extraer () throws InterruptedException{
        
        
        
        return 0;
    }

}

