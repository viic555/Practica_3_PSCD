package ejemplo;
import java.util.concurrent.Semaphore;

/** Una comunicación única entre dos hilos; no es la solución de P3. */
public class MicroSenal {
    private static final Semaphore listo = new Semaphore(1);
    private static int[] dato = {0};

    public static void main(String[] args) throws InterruptedException {
        Thread receptor = new Thread(() -> {
            try {
                listo.acquire();
                System.out.println("dato=" + dato[0]);
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
                System.err.println("Receptor interrumpido");
            }
        }, "receptor");
        Thread emisor = new Thread(() -> {
            dato[0] = 42;
            listo.release();
        }, "emisor");
        receptor.start();
        emisor.start();
        receptor.join();
        emisor.join();
    }
}
