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

// Implemente la función que verifica si una cadena es un identificador válido.
// Un identificador válido es una cadena no vacía que comienza con una letra
// o un guión bajo y consta únicamente de letras, dígitos y guiones bajos.

fun isValidIdentifier3(s: String): Boolean {
    if(s != "")
        if(s[0] !in '0'..'9') {
            for (i in s) if (!(i in 'a'..'z' || i in 'A'..'Z' || i in '0'..'9' || i == '_')) return false
        } else return false
    else return false
    return true
}

fun main(args: Array<String>) {
    println(isValidIdentifier3("name"))   // true
    println(isValidIdentifier3("_name"))  // true
    println(isValidIdentifier3("_12"))    // true
    println(isValidIdentifier3(""))       // false
    println(isValidIdentifier3("012"))    // false
    println(isValidIdentifier3("no$"))    // false

}