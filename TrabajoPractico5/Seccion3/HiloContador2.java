package TrabajoPractico5.Seccion3;

public class HiloContador2 extends Thread {

    private ContadorSincronizado contador;

    public HiloContador2(ContadorSincronizado contador) {
        this.contador = contador;
    }

    public void run() {
        for(int i = 0; i < 100000; i++){
            contador.incrementar();
        }
    }
}