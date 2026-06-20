fun main() {
    val str: String = "abc"
    println(str)

    val linguagem = "Kotlin"
    val caracteristica = "é show!"

    println(linguagem + " " + caracteristica)
    // ou INterpolacoes
    println("${linguagem.length} ${caracteristica}")
    //ou esse se for somente uma variavel para cada
    println("$linguagem $caracteristica")
}


//value = val / valor que nao muda nunca
//variable = var / pode alterar seu valor