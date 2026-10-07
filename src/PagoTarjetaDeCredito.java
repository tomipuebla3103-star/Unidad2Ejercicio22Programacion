public class PagoTarjetaDeCredito {
    double limite;

    public PagoTarjetaDeCredito(double limite) {
        this.limite = limite;
    }

    public boolean procesarPago(double monto) {

        if (monto > 0 && monto <= limite) {
            return true;
        }

        return false;
    }
}
