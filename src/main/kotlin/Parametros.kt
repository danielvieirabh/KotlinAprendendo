fun endereco(rua: String, cidade: String, estado: String, cep: String = "") { //Instancia "" se eu nao pssar ela
}
fun main() {
    endereco("", "", "")

    "".equals("", false) //Esse boolean e opcional do metodo equals()

    endereco("rua", estado = "estado", cidade =  "cidade") //Posso mudar a ordem dos parametros, colocando =

    media(10, 8F, 10F , 5F) // posso colocar quantos parametros eu quiser em uma somente variavel

    media2(10, 8F, 10F , 5F , 10.0) // Se usa Any

}

fun abc(): Nothing { //Nao tem retorno
    throw Exception() //Somente consigo isso
}

fun media(valor: Int, vararg n: Float): Float { //vararg so pode ser o ultimo
    var soma = 0F
    for (i in n) {
        soma += i
    }
    return soma / n.size //Quantos valores tem
}

fun media2( vararg n: Any): Float { //Any = aceita tudo que eu quiser , qualquer tipo de dado , int , double e etc
    var soma = 0F
    for (i in n) {
        when(i) {
         is Int -> print("Int")
         is Float -> println("Floar")
        }
    }
    return soma / n.size //Quantos valores tem
}
