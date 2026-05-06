package TrabajoPractico5.Seccion1;


public class TareaHilo extends Thread {

    private String nombre;

    public TareaHilo(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public void run() {

        for (int i = 1; i <= 5; i++) {
            System.out.println(nombre + " -> " + i);

            try {
                Thread.sleep(500); // pausa para ver la concurrencia
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

    }
}