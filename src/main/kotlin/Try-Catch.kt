fun main() {

    try {
        val str: String? = null
        println(str!!.length)

        println(10 / 0)

        val string = "dadadadadada"
        print(string[100])
    }
    catch (e: IndexOutOfBoundsException) { //Programa nao quebra
        println("Erro - Index")
    }
    catch (e: NullPointerException) {
        println("Null Pointer")
    }
    catch (e: ArithmeticException) {
        println("Erro na divisão por 0")
    }
    //Excecao generica, tem que ser a ultima tratada:
    catch (e: Exception) {
        println("Exceção generica, trata todos os problemasss")
    }
    finally { //finalmente , garante que vai fechar
        println("Finalmente! ") //Executa se tiver excecao ou nao
    }
}