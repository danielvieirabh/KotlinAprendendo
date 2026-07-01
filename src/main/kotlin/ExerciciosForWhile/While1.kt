package ExerciciosForWhile

fun while1 () {
    val capacidadeCaixa = 2000
    val volumeBalao = 7 // val =  a variavel nao pode ser alterada
    var numeroBaloes = 0 //var pode ser alterado
    //enquanto
    while((volumeBalao * numeroBaloes) + volumeBalao <= capacidadeCaixa) {
        numeroBaloes++
    }
    print("Cabem ${numeroBaloes} baloes")
}

fun main() {
    while1()
}