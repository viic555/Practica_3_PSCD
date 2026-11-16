import java.util.HashMap;
import java.util.Map;

public class Trabajador extends Thread{
    private int id = 0;
    Map <Integer, Integer> resultados = new HashMap<>();

    public Map<Integer, Integer> getResultados() {
        return resultados;
    }

    private final ColaTrabajos cola;

    public Trabajador (int id, ColaTrabajos cola) {
        this.id = id;
        this.cola = cola;
    }

    public void run(){
        
    }
}
