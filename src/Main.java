//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
void main() {
    PagoTarjetaDeCredito Credito = new PagoTarjetaDeCredito(50000);
    PagoCriptomonedas criptomoneda = new PagoCriptomonedas(30000);
    PagoBilleteraVirtual billetera = new PagoBilleteraVirtual(20000);

    ModuloCompras compra1 = new ModuloCompras(Credito);
    compra1.realizarCompra(25000);

    ModuloCompras compra2 = new ModuloCompras(criptomoneda);
    compra2.realizarCompra(15000);

    ModuloCompras compra3 = new ModuloCompras(billetera);
    compra3.realizarCompra(25000);
}
