package ExercicioEtapa3

fun triangulo(ladoA: Int, ladoB: Int, ladoC: Int): String {
    return if (ladoA == ladoB && ladoA == ladoC && ladoB == ladoC) {
        "Lados Iguais, é um triângulo"
    }
    else {
        "Não é triângulo"
    }
}


fun main() {
    print("Digite o primeir lado: ")
    val ladoA = readLine()
    print("Digite o segundo lado: ")
    val ladoB = readLine()
    print("Digite o terceiro lado: ")
    val ladoC = readLine()
    println(triangulo(ladoA.toString().toInt(), ladoB.toString().toInt(), ladoC.toString().toInt()))
}