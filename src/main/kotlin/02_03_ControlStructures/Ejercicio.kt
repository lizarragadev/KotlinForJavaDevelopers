package `02_03_ControlStructures`

// Implemente la función que verifica si una cadena es un identificador válido.
// Un identificador válido es una cadena no vacía que comienza con una letra
// o un guión bajo y consta únicamente de letras, dígitos y guiones bajos.

fun isValidIdentifier(s: String): Boolean {
    fun isValidCharacter(ch: Char) = ch == '_' || ch in '0'..'9'
            || ch in 'a'..'z' || ch in 'A'..'Z'
    if (s.isEmpty() || s[0] in '0'..'9') return false
    for (ch in s) {
        if (!isValidCharacter(ch)) return false
    }
    return true
}

fun isValidIdentifier2(s: String): Boolean {
    fun isValidCharacter(ch: Char) = ch == '_' || ch.isLetterOrDigit()
    if (s.isEmpty() || s[0].isDigit()) return false
    for (ch in s) {
        if (!isValidCharacter(ch)) return false
    }
    return true
}

fun main(args: Array<String>) {
    println(isValidIdentifier("name"))   // true
    println(isValidIdentifier("_name"))  // true
    println(isValidIdentifier("_12"))    // true
    println(isValidIdentifier(""))       // false
    println(isValidIdentifier("012"))    // false
    println(isValidIdentifier("no$"))    // false

}