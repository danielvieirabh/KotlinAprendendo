package ExercicioEtapa3

fun quadrado(ladoA: Int, ladoB: Int): String {

    return if (ladoA == ladoB) {
        "Lados Iguais, é um quadrado"
    }
    else {
        "Não é quadrado"
    }
}


fun main() {
    print("Digite o primeir lado: ")
    val ladoA = readLine().toString().toInt()
    print("Digite o segundo lado: ")
    val ladoB = readLine().toString().toInt()
    println(quadrado(ladoA, ladoB))
}