class Producto(
    val nombre: String,
    val descripcion: String,
    val precio: Double,
    val impuestos: Double,
    var stock: Int
) {
    fun calcularCoste(cantidad: Int): Double {
        return (precio + impuestos) * cantidad
    }

    fun consultarStock(): Int {
        return stock
    }
}