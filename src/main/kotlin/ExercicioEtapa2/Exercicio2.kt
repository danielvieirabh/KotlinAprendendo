package ExercicioEtapa2

fun main() {
    print("Digite uma string: ")
    val stringCaracteres = readLine()

    println(quantidadeStrings(stringCaracteres.toString()))
}

fun quantidadeStrings(string: String): Int {
    return string.length
}