package TrabajoPractico5;

import TrabajoPractico5.Seccion1.TareaHilo;
import TrabajoPractico5.Seccion1.TareaRunnable;
import TrabajoPractico5.Seccion2.Contador;
import TrabajoPractico5.Seccion2.HiloContador;
import TrabajoPractico5.Seccion3.ContadorSincronizado;
import TrabajoPractico5.Seccion3.HiloContador2;
import TrabajoPractico5.Seccion4.TareaLarga;
import TrabajoPractico5.Seccion4.TareaPrioridad;

public class App {

    public static void main(String[] args) throws InterruptedException {

        {
            System.out.println("=== Ejercicio 1.1 - Thread ===");

            TareaHilo hilo1 = new TareaHilo("Hilo A");
            TareaHilo hilo2 = new TareaHilo("Hilo B");
            TareaHilo hilo3 = new TareaHilo("Hilo C");

            hilo1.start();
            hilo2.start();
            hilo3.start();


            System.out.println("=== Ejercicio 1.2 - Runnable ===");

            TareaRunnable tarea = new TareaRunnable("Runnable");

            Thread hilo4 = new Thread(tarea);
            Thread hilo5 = new Thread(tarea);

            hilo4.start();
            hilo5.start();
        }
        
        {
            System.out.println("=== Seccion 2 - Condicion de carrera ===");

            Contador contador = new Contador();

            HiloContador hiloContador1 = new HiloContador(contador);
            HiloContador hiloContador2 = new HiloContador(contador);

            hiloContador1.start();
            hiloContador2.start();

            hiloContador1.join();
            hiloContador2.join();

            System.out.println("Valor final: " + contador.getValor());
        }

        {
            System.out.println("=== Seccion 3 - Metodo sincronizado ===");

            ContadorSincronizado contador = new ContadorSincronizado();

            HiloContador2 hilo1 = new HiloContador2(contador);
            HiloContador2 hilo2 = new HiloContador2(contador);

            hilo1.start();
            hilo2.start();

            try {
                hilo1.join();
                hilo2.join();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

            System.out.println("Valor final: " + contador.getValor());

        }
        {
            System.out.println("=== Seccion 4 - Identidad y prioridad ===");
            // =========================
            // EJERCICIO 4.1
            // Identidad y prioridad
            // =========================


            TareaPrioridad hilo1 = new TareaPrioridad();
            TareaPrioridad hilo2 = new TareaPrioridad();

            hilo1.setName("Hilo-Bajo");
            hilo2.setName("Hilo-Alto");

            hilo1.setPriority(1);
            hilo2.setPriority(10);

            hilo1.start();
            hilo2.start();

            // =========================
            // EJERCICIO 4.2
            // join() e interrupt()
            // =========================

            TareaLarga hiloLargo = new TareaLarga();

            hiloLargo.start();

            try {

                hiloLargo.join();

            } catch (InterruptedException e) {

                e.printStackTrace();

            }

            System.out.println("El hilo largo terminó, sigue el main.");


        }






    }

}