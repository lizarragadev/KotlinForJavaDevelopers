package `02_02_Basics`

fun main() {
    // Y para llamar a la funcion podemos llamarlo de la forma clasica
    displaySeparator('#', 5)
    // o solamente enviando un argumento
    displaySeparator('#')
    // o no enviando ningun argumento
    displaySeparator()
    // Pero ten en cuenta que el orden importa, si solo quieres enviar
    // el parametro del segundo ahi ya debes escribir el nombre del parametro
    displaySeparator(size = 5)
    // En caso que quieras cambiar el orden de los parametros se lo hace
    // pero nombrando a cada uno de los parametros y ahi no se necesita orden.
    displaySeparator(size = 5, character = 'g')
}

// Para crear una funciones con parametros nombrados lo hacemos de la siguiente manera
// Al momento de colocar los parametros y el tipo, le asignamos automaticamente un valor
// y ese valor sera el que se tome en caso que se lo llame o solo a algun parametro.
fun displaySeparator(character: Char = '*', size: Int = 10) {
    repeat(size) {
        print(character)
    }
    println()
}