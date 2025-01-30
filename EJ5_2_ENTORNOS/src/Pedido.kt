import java.time.LocalDate

class Pedido(
    val estado: EstadoPedido,
    val tipoPago: tipoPago,
    val listaProducto: MutableMap<Producto, Int>,
    val fechaPedido: LocalDate = LocalDate.now()
) {
    private val pagosRealizados = mutableListOf<Any>()

    fun calcularCoste(): Double {
        return listaProducto.entries.sumOf { (producto, cantidad) -> producto.calcularCoste(cantidad) }
    }

    fun realizarPago(pago: Any) {
        pagosRealizados.add(pago)
    }
}