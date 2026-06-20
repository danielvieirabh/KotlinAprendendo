package ExercicioEtapa2

fun main() {
    print("Digite um número: ")
    val numero = readLine()
    println(calculoCubo(numero.toString().toDouble()))
}

fun calculoCubo(number: Double): Double {
    val cubo = Math.pow(number, 3.0) //potencia
    return cubo
}