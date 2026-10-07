public class ModuloCompras {
    PagoTarjetaDeCredito tarjeta;
    PagoCriptomonedas criptomoneda;
    PagoBilleteraVirtual billetera;

    public ModuloCompras(PagoTarjetaDeCredito tarjeta) {
        this.tarjeta = tarjeta;
    }

    public ModuloCompras(PagoCriptomonedas criptomoneda) {
        this.criptomoneda = criptomoneda;
    }

    public ModuloCompras(PagoBilleteraVirtual billetera) {
        this.billetera = billetera;
    }

    public void realizarCompra(double monto) {
        System.out.println("Compra realizada por $" + monto);
    }
}