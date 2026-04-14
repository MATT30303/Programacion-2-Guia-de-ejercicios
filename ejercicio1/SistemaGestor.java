package ejercicio1;
/**
 * 
 */
public class SistemaGestor {
    public static final int MAX_CLIENTES=10;

    public static void main(String[] args) {
        printMaxClientes(MAX_CLIENTES);
    }
    
    public static void printMaxClientes(int max){
        System.out.println("La maxima cantidad de clientes es de: " + max);
        /*
        La variable max_clientes pertenece a la clase porque esta declarada dentro de la misma
        Ademas, no puede editarse gracias al -final- que contiene su declaracion.
        */
    }


}