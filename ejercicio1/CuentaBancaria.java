package ejercicio1;

/**
 *
 * @author pollo
 * en esta clase van a estar los metodos y atributos de la base Cuenta Bancaria
 * 
 */
public class CuentaBancaria {
    private double saldo = 350; //se encarga de guardar el saldo de manera privada para no ser expuesto
    private int numeroCuenta = 35359359; // este es el numero de cuenta tambien privado para no ser expuesto
    private String nombre = ""; // nombre de la cuenta, agregado extra tambien privado

    public static void main(String[] args) {
        CuentaBancaria cuenta = new CuentaBancaria();
        cuenta.setNombre("fabian");
        System.out.println("El nombre de la cuenta es: "+cuenta.getNombre());
        System.out.println("El numero de la cuenta es: "+cuenta.getNumeroCuenta());
        System.out.println("Su saldo actual es: "+cuenta.getSaldo());
        cuenta.depositar(500);
        System.out.println("Su saldo actual es: "+cuenta.getSaldo());
    }

    public void depositar(double  monto){
        /*
        en este metodo se puede depositar (colocar saldo) de manera que no expone datos
        */
        double saldo_actual = getSaldo();
        this.saldo = (monto >= 0 ? monto + saldo_actual : saldo_actual);
        if (monto < 0) System.out.println("no se puede ingresar monto negativo");
    }

    public double getSaldo() {
        return saldo;
    }

    public int getNumeroCuenta() {
        return numeroCuenta;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }


}
