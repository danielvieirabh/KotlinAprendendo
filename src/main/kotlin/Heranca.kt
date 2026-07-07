fun main() {
   val mic =  Microfone("Logiteck", 500F)
    val computador = Computador("ASUS", 1000F, "blue" )

}

class Computador(marca: String, preco: Float, var cor: String) : Eletronico(marca, preco) {

    override fun ligar() { //sobrescreve o ligar , posso alterar a qualquer momento
        super.ligar()
        println("Carregar o sistema operacional!!")
    }

    fun instalarSoftware() { //Pode ter suas proprias funcionalidades
        super.ligar() //usando funcionamentos da classe superior
        println("Instalando")
        println("Instalanado")
        super.desligar()
    }
}

class Microfone(marca: String, preco: Float) : Eletronico(marca, preco) { //heranca aqui
    fun gravar() {

    }
}

open class Eletronico(var marca: String, var preco: Float) { //Classe aberta para heranca colocando o open

    private var correnteEletrica = false

    open fun ligar() {
       correnteEletrica = true
    }
    fun desligar() {
       correnteEletrica = false
    }

}


//Posso fazer a mesma funcao com parametros diferentes
fun mesmo() {}
fun mesmo(str: String) {}
fun mesmo(int : Int) {}
