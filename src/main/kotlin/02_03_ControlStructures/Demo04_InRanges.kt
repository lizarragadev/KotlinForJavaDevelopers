package `02_03_ControlStructures`

import java.util.*

// in se utiliza para definir iteracion
fun iteracion() {
    for (i in 'a'..'z') { }
}

// in tambien se utiliza para comprobar pertenencia
fun pertenencia(c: Char) {
    c in 'a'..'z'
    // lo que es equivalente a
    'a' <= c && c <= 'z'
}

// fusionando con operadores logicos
fun operador(c: Char) {
    c in 'a'..'z' || c in 'A'..'Z'
    // Para definir si algo no esta en el rango de algo colocamos !
    c !in '0'..'9'
}

// in con una condición when
fun reconocer(c: Char) =
    when(c) {
        in '0'..'9' -> { "Es un digito" }
        in 'a'..'z', in 'A'..'Z' -> { "Es una letra" }
        else -> { "No es nada" }
    }

// Diferentes rangos
fun rangos() {
    1..9                // IntRange
    1 until 9           // IntRange
    'a'..'z'            // CharRange
    "ab".."az"                // ClosedRange<String>
    //startDate..endDate      // ClosedRange<MyDate>
}

// Almacenar rangos
fun rangosAlmacenar(){
    val intRange: IntRange = 1..9
    val anotherIntRange: IntRange = 1 until 9
    val charRange: CharRange = 'a'..'z'
    val stringRange: ClosedRange<String> = "ab".."az"
    // val dateRange: ClosedRange<Date> = startDate..endDate
}

// Comparacion de cadenas
fun comparacionCadenas() {
    // Esta instruccion
    "ball" in "a".."k"
    // Internamente seria
    "a" <= "ball" && "ball" <= "k"
    // Y en Java seria algo como:
    // "a".compareTo("ball") <= 0 && "ball".compareTo("k") <= 0

    // Lo que pasa es que se compara la primera letra de cada palabra
    println("ball" in "a".."k")
    println("Kotlin" in "Java".."Scala")
}

// comparando cosas personalizadas
fun customTypes() {
    // if(myDate in startDate..endDate)
}

// IN tambien sirve para saber si un elemento existe en una coleccion de datos
fun existencia(element: Int) {
    val list = listOf(1,2)
    if(element in list) { }

    // Esto seria lo mismo que:
    if(list.contains(element)) {  }
}

fun main() {
    comparacionCadenas()
}