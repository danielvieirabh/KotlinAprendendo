package ExercicioEtapa2

import java.util.Locale

fun main() {
    print("Digite a milha: ")
    val milha = readLine()
    println("Conversao de milha para Km: %.1f ".format(converterKm(milha.toString().toDouble())))
}

fun converterKm(milha: Double): Double {
    return milha * 1.6;
}