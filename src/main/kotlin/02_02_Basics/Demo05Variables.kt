package `02_02_Basics`

fun main() {
    // Existen dos tipos de listas en Kotlin

    // Las listas mutables, es decir que podemos agregar mas contenido
    val languages = mutableListOf("Uno")
    languages.add("Dos")

    // Y las listas inmutables que solamente es una lista estatica.
    val list = listOf("Java")
    // list.add("Kotlin")
}