package `02_03_ControlStructures`

// En kotlin throw es una expresion, por lo cual se puede asignar en una variable
// como se ve en el ejemplo, en Java eso no se puede hacer ya que es una construccion especial
fun pruebaThrow() {
    val number = 9
    val percentage =
        if (number in 0..100)
            number
        else
            throw IllegalArgumentException("Mensaje de Throw")

    print(percentage)
}

// try tambien es una expresion e igual podemos almacenarlo en una variable
fun pruebaTry() {
    val string = "5sdsd5"
    val number = try {
        Integer.parseInt(string)
    } catch (e: NumberFormatException) {
        null
    }
    print(number)
}

fun main() {
    pruebaTry()
}