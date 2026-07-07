interface Selvagem { // interface , ja traz tudo como abstrato
   // var str: String // nao pode receber nada em interface
    fun atacar()
}

abstract class Mamifero (var nome: String) {
   abstract fun falar() // abstrata sei  que existe mas nao sei como funciona

     fun acordar()  {
         println("Acordei")
     }

    fun dormir() {}

}
class Cachorro(nome: String) : Mamifero(nome) , Selvagem { // implementacao da interface Selvagem
    override fun falar() {
        println("au au")
    }

    override fun atacar() {
        println("Atacou")
    }


}
class Gato(nome: String) : Mamifero(nome) {
    override fun falar() {
        println("miau")
    }
}

fun main() {

}