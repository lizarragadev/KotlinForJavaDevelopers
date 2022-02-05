package `02_01_FromJavatoKotlin`

import java.awt.Color
import java.awt.Color.*

class Demo01 {
    // Si utilizamos una conversión común de Java a Kotlin con el
    // convertidor de IntelliJ nos llegará a algo como esto

    fun updateWeather(degrees: Int) {
        val description: String
        val color: Color
        if(degrees < 10) {
            description = "cold"
            color = BLUE
        } else if (degrees < 25) {
            description = "mild"
            color = ORANGE
        } else {
            description = "hot"
            color = RED
        }
    }

    // Pero la misma función de puede simplificar a lo siguiente:
    // Utilizamos la clase Pair para poder manejar dos variables.

    fun updateWeather2(degrees: Int) {
        val (description: String, color: Color) =
            if(degrees < 10) {
                Pair("cold", BLUE)
            } else if (degrees < 25) {
                Pair("mild", ORANGE)
            } else {
                Pair("hot", RED)
            }
    }

    // Además gracias a la inferencia de datos, en Kotlin no es
    // necesario dar el tipo de dato ya que el compilador directamente
    // lo infiere. También podemos cambiar el if anidado por la
    // estructura when que es similar a switch en Java.

    fun updateWeather3(degrees: Int) {
        val (description, color) =
            when {
                degrees < 10 -> Pair("cold", BLUE)
                degrees < 25 -> Pair("mild", ORANGE)
                else -> Pair("hot", RED)
            }
    }

    // Y finalmente podemos podemos crear el Pair de otra forma
    // que es utiliando el operador "to".

    fun updateWeather4(degrees: Int) {
        val (description, color) =
            when {
                degrees < 10 -> "cold" to BLUE
                degrees < 25 -> "mild" to ORANGE
                else -> "hot" to RED
            }
    }


}