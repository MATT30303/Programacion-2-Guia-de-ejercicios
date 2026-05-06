package TrabajoPractico5.Seccion4;

public class TareaLarga extends Thread {

    @Override
    public void run() {

        try {

            for (int i = 1; i <= 5; i++) {

                System.out.println("Procesando paso " + i);

                Thread.sleep(1000);

            }

        } catch (InterruptedException e) {

            System.out.println("El hilo fue interrumpido");

        }

    }

}