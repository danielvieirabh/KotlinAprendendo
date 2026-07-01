package ExerciciosForWhile

fun main() {
    print("Digite um texto: ")
    val texto = readLine().toString()
    println(countXO(texto))
}

fun countXO(texto: String): Boolean {
    var countX = 0
    var countO = 0
   for (i in texto.lowercase()) {
       if (i == 'x') {
           countX++
       }
       if (i == 'o') {
           countO++
       }
   }

    if (countX == 0 && countO == 0) {
        return false
    }

   return countO == countX

}

fun abc () {
    throw IndexOutOfBoundsException()
}