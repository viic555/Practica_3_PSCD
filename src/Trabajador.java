import java.util.HashMap;
import java.util.Map;

public class Trabajador extends Thread {
    private final int id;
    private final Map<Integer, Integer> resultados = new HashMap<>();

    public Map<Integer, Integer> getResultados() {
        return resultados;
    }

    private final ColaTrabajos cola;

    public Trabajador(int id, ColaTrabajos cola) {
        this.id = id;
        this.cola = cola;
    }

    @Override 
    public void run() {
        try {
            while (true) {
                int trabajo = cola.extraer();
                if (trabajo == -1) {
                    break;
                }
                int cuadrado = trabajo * trabajo;
                resultados.put(trabajo, cuadrado);
            }
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }
    }
}
