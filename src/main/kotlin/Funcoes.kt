// Cada conteudo em seu escopo de funcao
fun helloWorl() {
    println("Hello World!")
}

fun funcao(nome: String) {
    println("OLa, ${nome} !")
}

fun media(n1: Int, n2: Int): Int { // :Int e o retorno que e inteiro
    val media = (n1 + n2) / 2; //media
    return media
}

fun main() {
    helloWorl()
    funcao("Danzin")
    println(media(10, 8))
}

