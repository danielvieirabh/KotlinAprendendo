package ExerciciosForWhile

fun main() {
    print("Digite um texto: ")
    val texto = readLine().toString()
    textoWhile(texto)
}

fun textoWhile(texto: String) {
     print(texto.reversed())
}