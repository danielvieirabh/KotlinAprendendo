package ExercicioEtapa2

import java.util.Locale

fun main() {
    print("Digite os celsius: ")
    val celsius = readLine()
    println("Numero convertido: %.1f F ".format(Locale.US, converteFahrenheit(celsius.toString().toDouble()))) //O Locale.US , Transforma em vez de "," um "."
}

fun converteFahrenheit(celsius: Double): Double {
    val fahrenheit = (celsius * 9/5) + 32;
    return fahrenheit
}