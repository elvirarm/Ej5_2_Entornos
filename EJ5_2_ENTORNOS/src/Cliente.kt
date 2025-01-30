class Cliente(
    val nombre: String,
    val email: String
) {
    val listaPedido = mutableListOf<Pedido>()

    fun realizarPedido(pedido: Pedido) {
        listaPedido.add(pedido)
    }
}