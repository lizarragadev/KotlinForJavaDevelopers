package `02_03_ControlStructures`

fun main() {

    // El for cambia con relacion a java, se tiene la variable iteradora
    // llamada s, y con la intruccion in definimos el lote de datos que debemos
    // iterar, si gusta la variable iteradora puede colocarle el tipo de dato
    // s: String, pero como sabemos, kotlin automaticamente sabra el tipo de dato
    // gracias al lote de elementos en la lista.
    val list = listOf("a", "b", "c")
    for (s in list) {
        print(s)
    }

    // EN kotlin tambien puedes iterar sobre el contenido dfe un map
    val map = mapOf(1 to "one", 2 to "two", 3 to "three")
    for ((key, value) in map) {
        println("$key = $value")
    }

    // Tambien se puede iterar sobre una coleccion con indice
    val list2 = listOf("a", "b", "c")
    for ((index, element) in list2.withIndex()) {
        println("$index: $element")
    }

    // Para un for necesitamos manejar rangos
    for(i in 1..9) {
        print(i)
    }
    // O tambien utilizando la palabra until pero significa un menor que
    for(i in 1 until 9) {
        print(i)
    }

    // Tambien podemos iterar por ejemplo decrementando con la instruccion downTo
    // y a su vez decrementando de 2 en 2 con la instruccion step
    for(i in 9 downTo 1 step 2) {
        print(i)
    }

    // Incluso se puede iterar sobre una cadena
    for(ch in "abcde") {
        println(ch)
    }

    // Si le aumentamos un + 1 al caracter se apoya en su codigo ascii y mostrara
    // el siguiente numero que de el codigo ascii
    for(ch in "abcde") {
        println(ch + 1)
    }

}