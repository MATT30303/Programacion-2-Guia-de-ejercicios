package TrabajoPractico5.Seccion1;

public class TareaRunnable implements Runnable {

    private String nombre;

    public TareaRunnable(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public void run() {

        for (int i = 1; i <= 5; i++) {
            System.out.println(nombre + " -> " + i);

            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

    }

}