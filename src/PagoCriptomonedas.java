public class PagoCriptomonedas {
    double saldo;

    public PagoCriptomonedas(double saldo) {
        this.saldo = saldo;
    }

    public boolean procesarPago(double monto) {

        if (monto > 0 && monto <= saldo) {
            saldo = saldo - monto;
            return true;
        }

        return false;
    }
}
