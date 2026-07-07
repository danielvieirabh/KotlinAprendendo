class  Matematica {
    var id: Int = 10

    companion object {
        val PI = 3.141592653589793

        fun abc() {
            println("Sou a classe matematica")
        }

        init {
            println("FUI CHAMADO")
        }
    }

    object OBJ1 {
        fun abc() {
            println("OI")
        }

        init {
            println("FUI CHAMADO 2")
        }
    }

    object OBJ2 {
        init {
            println("FUI CHAMADO 3")
        }
    }
}

fun main() {
    //EStatico
    Math.PI
    println(Matematica.PI)// aqui vira estatico , no que eu criei
    Matematica.abc()
    Matematica().id //sem o  companion object
    Matematica.OBJ1.abc()
}