package `02_02_Basics`

// Pero para probar podemos enviar tambien argumentos
fun main(args: Array<String>) {
    // If en Kotlin es una expresión y puede asignar su resultado
    // a una variable o retornarla a traves de una funcion.
    val name = if (args.isNotEmpty()) args[0] else "Kotlin"

    // En caso que no lleguen argumentos podemos controlarlo
    println("Hello 2, ${args.getOrNull(0)}!")

    println("Hello, $name!")
}