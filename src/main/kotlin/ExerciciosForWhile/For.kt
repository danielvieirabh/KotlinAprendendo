package ExerciciosForWhile

fun main() {
    //EXERCICIO 1
    for (i in 1 .. 50) {
        print("${i} ")
    }
    println()
    //EXERCICIO 2
    for (decrescente in 50 downTo 1) {
        print("${decrescente} ")
    }
    //EXERCICIO 3
    println()
    for (i in 1 .. 50) {
        if (i % 5 == 0) {
            continue //Pula pro proximo se for multiplo de 5
        }
        print("Multiplos: ${i} ")
    }
    //EXERCICIO 4
    println()
    var  soma = 0
    for (somando in 1 .. 500) {  //Escopo do codigo
        soma += somando
    }
    print("Soma: ${soma} ") //Soma dos 500
}

