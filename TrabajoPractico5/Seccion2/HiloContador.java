package TrabajoPractico5.Seccion2;

public class HiloContador extends Thread {

    private Contador contador;

    public HiloContador(Contador contador) {
        this.contador = contador;
    }

    @Override
    public void run() {

        for (int i = 0; i < 100000; i++) {
            contador.incrementar();
        }

    }

}