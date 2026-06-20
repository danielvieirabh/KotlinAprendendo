package ExercicioEtapa3

fun main() {
    println(qualASaida(4))
}

fun qualASaida(num: Int) {
    if (num >= 0) {
        if (num == 0) {
            println("Primeira String")
        }
        else {
            println("Segunda String")
        }
    }
    println("Terceira String")
}