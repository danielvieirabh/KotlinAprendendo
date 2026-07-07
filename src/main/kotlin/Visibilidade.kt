open class Visibilidade {
    protected var str: String = ""

    private fun abc() {

    }

    //Classe Interna a outra classe
   private inner class NestedClass() { //NAO TEM ACESSO A class Visibilidade , sem o inner
        var id: Int = 0

        fun teste() {
            abc()
            str
        }
    }

}

private fun soma () {} // So fica disponivel no arquivo


class HerancaVisibilidade() : Visibilidade() {
    fun teste() {
        println(str)
        abc()
    }
}

fun main() {
    Visibilidade()
    HerancaVisibilidade().teste()
}