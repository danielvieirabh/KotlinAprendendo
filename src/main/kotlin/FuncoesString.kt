fun main() { //Nomear de acordo com a funcionalidade da funcao e da variavel


    val str = "Programacao Kotlin"
    println(str[0])
    println(str.length)
    println(str.startsWith("Progra")) //A string comeca com progra?
    println(str.endsWith(".")) //A string termina com "."?
    println(str.substring(6)) //comeca com index 6 e vai ate o final
    println(str.substring(6, 8)) //comeca com index 6 e vai ate a posicao 8
    println(str.replace("o", "a")) //subtitue tudo que e O por A
    println(str.uppercase()) // tudo fica maiuscula
    println(str.lowercase()) // tudo fica minuscula
    println(str.contains("Kotlin")) // COntem  kotlin ?
    println(str.isEmpty()) //Verifica se e vazia
    println("       dadddddd      ".trim()) //tira os espacos no comeco e no fim  , muito usado em espacos
}