package ExercicioEtapa2

fun main() {
    print("Digite a palavra para a troca: ")
    val palavra = readLine()
    print(trocaLetras(palavra.toString()))
}

fun trocaLetras(palavra: String): String {
   return palavra.replace("a", "x").uppercase()
}