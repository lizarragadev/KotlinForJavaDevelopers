package `02_02_Basics`

fun foo(): String {
    println("Calculating foo...")
    return "foo"
}

// Podriamos pensar que en este ejemplo solo se llamara una vez
// pero no, la funcion foo será llamada dos veces ya que en cada
// llamada de la función puede dar un resultado diferente.
fun main(args: Array<String>) {
    println("First ${foo()}, second ${foo()}")
}