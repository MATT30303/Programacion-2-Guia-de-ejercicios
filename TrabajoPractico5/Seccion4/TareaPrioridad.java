package TrabajoPractico5.Seccion4;

public class TareaPrioridad extends Thread {

    @Override
    public void run() {

        for (int i = 1; i <= 5; i++) {

            System.out.println(
                "Hilo: " + Thread.currentThread().getName() +
                " | Prioridad: " + Thread.currentThread().getPriority() +
                " | Numero: " + i
            );

        }

    }
}