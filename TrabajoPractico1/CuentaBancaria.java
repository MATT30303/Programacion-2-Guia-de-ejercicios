package TrabajoPractico1;

public class CuentaBancaria {
    
    private double saldo;

    private int numeroCuenta;

    public void depositar(double monto){
        if (monto <= 0) {
            System.out.println("No se puede depositar un monto negativo.");
            return;
        }
        saldo = saldo + monto;
    }

    public double getSaldo(){
        return saldo;
    }
    public int getNumeroCuenta() {
        return numeroCuenta;
    }
}
