fun leituraValorInteiroPositivo(texto: String): Int { //mais robusto , sem duplicar codigo
    while (true) { //Ficar executando sempre
        print(texto)
        val input = readLine()
        if (input != null) { //garante que nao e nulo
            try {
                val numero = input.toInt()
                if (numero >= 0) { //Caso o numero seja positivo
                    return numero
                }
                else {
                    println("Informe um valor positivo! ")
                }
            } catch (e: Exception) {
                println("Informe um valor válido")
            }
        }
        else {
            println("Informe um valor positivo")
        }
    }
}

fun verficaQuadrado() {
    //print("Informe o lado 1: ")
    val lado1 = leituraValorInteiroPositivo("Informe o lado 1: ")
  //  print("Informe o lado 2: ")
    val lado2 = leituraValorInteiroPositivo("Informe o lado 2: ")

    if (lado1 == lado2) {
        println("É um quadrado")
    } else {
        println("Não é um quadrado")
    }
}

fun main() {
    verficaQuadrado()
}