package `02_02_Basics`

fun main() {
    // Los named arguments es la forma en la que enviamos argumentos para una funcion a traves del
    // nombre de su parametro en la funcion.
    println(listOf('a', 'b', 'c').joinToString(separator = "---", prefix = "(", postfix = ")"))

    // Podemos simplemente a un parametro de la funcion y los demas se asignaran por defecto
    println(listOf(1, 2, 3).joinToString(postfix = "."))
}