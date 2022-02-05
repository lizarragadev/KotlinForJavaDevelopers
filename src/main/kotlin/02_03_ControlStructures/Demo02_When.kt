package `02_03_ControlStructures`

enum class Color {
    BLUE, ORANGE, RED, YELLOW, VIOLET, INDIGO, GREEN
}

// La estructura When nos ayuda al igual que la estructura Switch en Java
// En este caso con un parámetro de ingreso.
fun whenSimple(color: Color) =
    when (color) {
        Color.BLUE -> "cold"
        Color.ORANGE -> "mild"
        Color.RED -> "hot"
        else -> "Other"
    }

// Para una accion por defecto utilizamos la palabra reservada else
fun compareUno(color: Color) =
    when (color) {
        Color.BLUE -> println("cold")
        Color.ORANGE -> println("mild")
        else -> println("hot")
    }

// Otro tipo de When es el comparar con uno o varios valores
fun compare(valor: String) =
    when (valor) {
        "y", "yes" -> "Respuesta 1"
        "n", "No" -> "Respuesta 2"
        else -> "Respuesta defecto"
    }

// Se puede utilizar cualquier expresion no solo constantes
fun mix(col1: Color, col2: Color) =
    when(setOf(col1, col2)) {
        setOf(Color.RED, Color.YELLOW) -> Color.ORANGE
        setOf(Color.YELLOW, Color.BLUE) -> Color.GREEN
        setOf(Color.BLUE, Color.VIOLET) -> Color.INDIGO
        else -> throw Exception("No color")
    }
// También se puede utilizar para comparar objetos con la sentencia IS
fun types(pet: Pet) =
    when(pet) {
        is Cat -> pet.meow()
        is Dog -> pet.woof()
        else -> "error"
    }

// Tambien acepta condiciones sin argumentos, en este caso las condiciones
// pueden ser la que quiera pero debe ser una expresion booleana
fun updateWerther(degrees: Int) {
    val (description, colour) = when {
        degrees < 5 -> "cold" to Color.BLUE
        degrees < 23 -> "mild" to Color.ORANGE
        else -> "hot" to Color.RED
    }
}

fun main() {
    println(mix(Color.YELLOW, Color.INDIGO))
}


open class Pet() {
    var name = ""
    var age = 0

    fun meow() {
    }
    fun woof() {
    }
}

class Cat : Pet() {
}

class Dog: Pet() {
}