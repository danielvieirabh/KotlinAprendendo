fun main() {
    //null safety : segurança de nulo
    val str: String? = null // ? = indica que variavel pode ser nula
    println(str?.length)
    println(str!!.length) //Se tem excecao pode acesar

    val abc = readLine()
    if (abc != null) { //Sair de uma excecao
        abc.toShort()
    }
    else {
        println("Informe um valor válido")
    }


}