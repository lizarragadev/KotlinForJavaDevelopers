package `02_02_Basics`

fun main() {

}
// Al crear una función lo podemos realizar de la siguiente manera.

fun max(a: Int, b: Int): Int {
    return if(a > b) a else b
}

// O tambien podemos volverla en una función inline.
fun max2(a: Int, b: Int) = if(a > b) a else b

