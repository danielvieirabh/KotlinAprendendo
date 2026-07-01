fun main() {
    try {
        divisao(1, 0)
    }
    catch (e: Exception) {
        println(e.message)
    }
}

fun divisao(n1: Int, n2: Int): Int {
    if (n2 == 0) {
        throw Exception("Divisor não pode ser zero.")
    }

    return n1 / n2
}