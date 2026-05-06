package TrabajoPractico4.Seccion3;

public class CuentaBancaria {

    private double saldo;

    public CuentaBancaria(double saldoInicial) {
        this.saldo = saldoInicial;
    }

    public void retirar(double monto) throws SaldoInsuficienteException {

        if (monto > saldo) {
            throw new SaldoInsuficienteException("Saldo insuficiente para retirar " + monto);
        }

        saldo -= monto;
        System.out.println("Retiro realizado. Saldo restante: " + saldo);
    }

}