package `02_03_ControlStructures`

fun main() {
    val a = 2
    val b = 3

    // Un ejemplo de una estructura condicional if la cual es inline
    // quiere decir que se puede ejecutar en una sola linea
    val max = if (a > b) a else b

    // En Kotlin no existen los operadores ternarios como en Java
    // (a > b) ? a : b
    // Si quiere hacer algo similar a lo anterior, debe utilizar
    // un if inline.
}