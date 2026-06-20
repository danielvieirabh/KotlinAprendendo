package ExercicioEtapa2

import java.util.Locale

fun main() {
    // Exercicio 2 :
    print("Digite uma string: ")
    val stringCaracteres = readLine()
    println(quantidadeStringss(stringCaracteres.toString()))

    // Exercicio 3 :
    print("Digite um número: ")
    val numero = readLine()
    println(calculoCubos(numero.toString().toDouble()))

    // Exercicio 4 :
    print("Digite a milha: ")
    val milha = readLine()
    println("Conversao de milha para Km: %.1f ".format(converterKm2(milha.toString().toDouble())))
    
    // Exercicio 5 :
    print("Digite os celsius: ")
    val celsius = readLine()
    println("Numero convertido: %.1f F ".format(Locale.US, converteFahrenheit2(celsius.toString().toDouble())))
}

// Exercicio 2 :
fun quantidadeStringss(string: String): Int = string.length

// Exercicio 3 :
fun calculoCubos(number: Double): Double = Math.pow(number, 3.0) //potencia

// Exercicio 4 :
fun converterKm2(milha: Double): Double = milha * 1.6;

// Exercicio 5 :
fun converteFahrenheit2(celsius: Double): Double = (celsius * 9 / 5) + 32;
