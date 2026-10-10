<img width="393" height="94" alt="image" src="https://github.com/user-attachments/assets/a5de36f1-b92a-4048-a7c4-56d44c4def20" />

Pasarelas de Pago Multicanal

 Descripción
Este proyecto consiste en un sistema en Java que permite procesar compras utilizando diferentes medios de pago, como tarjetas de crédito, criptomonedas y billeteras virtuales. Cada medio de pago tiene su propia lógica de validación, pero todos permiten realizar una compra mediante una operación común.

Clases
- **ProcesadorPago:** interfaz que define el método `procesarPago(double monto)`, encargado de procesar un pago y devolver `true` si se aprueba o `false` si se rechaza.
- **PagoTarjetaCredito:** procesa pagos con tarjeta de crédito y verifica que se cumplan las condiciones necesarias para aprobar la operación.
- **PagoCriptomoneda:** simula el procesamiento de pagos mediante criptomonedas.
- **PagoBilleteraVirtual:** procesa pagos mediante una billetera virtual.
- **ModuloCompras:** mantiene una referencia al procesador de pagos y utiliza el método `procesarPago()` para realizar las compras sin depender de un proveedor específico.

Funcionamiento
En el `main` se crean los diferentes procesadores de pago y se realizan compras utilizando cada uno. El módulo de compras envía el monto al procesador correspondiente y muestra por consola un comprobante si el pago es aprobado o un mensaje de rechazo si la operación falla.

Recorrido del mensaje
1. El programa crea los diferentes procesadores de pago.
2. Se crea un módulo de compras asociado al procesador elegido.
3. El módulo recibe una solicitud para realizar una compra.
4. Se envía el monto al método `procesarPago()` del procesador correspondiente.
5. El procesador valida la operación según su propia lógica y devuelve un resultado booleano.
6. El módulo de compras recibe la respuesta y determina si la compra fue aprobada o rechazada.
7. Finalmente, se muestra por consola el resultado de cada transacción.

Validaciones

Cada procesador debe comprobar que el monto sea válido y aplicar sus propias condiciones para aprobar o rechazar el pago. El módulo de compras debe informar correctamente el resultado recibido.

Objetivo

Practicar el uso de interfaces, la abstracción, el polimorfismo y la separación de responsabilidades, permitiendo cambiar el medio de pago sin modificar la lógica principal de las compras.
