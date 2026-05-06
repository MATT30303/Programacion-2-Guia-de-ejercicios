package TrabajoPractico5.Seccion3;

public class ContadorSincronizado {

    
    private int valor = 0;

    public void incrementar() {

        synchronized(this) {
            valor++;
        }

    }

    public int getValor() {
        return valor;
    }
}

