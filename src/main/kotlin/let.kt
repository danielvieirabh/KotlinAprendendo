fun main() {
    val str: String? = null

    str?.lowercase()
    str?.length
    str?.contains("abc")

    str?.let { //para funcionar o tratamento de excecao de null, executa se nao for nulo
        // scope function  : scopo de funcao
        //str vira it
        it.length
        it.lowercase()
        it.contains("abc")
    }
}