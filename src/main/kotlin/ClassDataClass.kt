class ClassDataClass {
}

fun endereco(endereco: Endereco) {}

class Endereco(var rua: String, var cidade: String) {
    override fun toString(): String {
        return "Endereco: rua:${this.rua} -cidade:${this.cidade}"
    }

    override fun hashCode() : Int {
        return super.hashCode()
    }

    override fun equals(other: Any?) : Boolean {
        if (other is Endereco) {
            return (this.rua == other.rua && this.cidade == other.cidade)
        }
        else {
            return false
        }
    }
}
data class DataEndereco(var rua: String, var cidade: String)

fun main() {
    val e1 = DataEndereco("rua 1", "cidade 1")
    val e2 = DataEndereco("rua 1", "cidade 1")
    //ISSO para copiar em outra variavel :
  // val e3 = Endereco(e1.rua, e1.cidade)
    // OU isso :
    val e3 = e1.copy()

    e3.rua = "alteracao"
    println(e1.rua)
    println(e3.rua)


    println(e1.toString())
    println(e1.hashCode())
    println(e1.equals(e2))
}