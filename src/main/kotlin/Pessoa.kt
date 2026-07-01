class Pessoa(var nome: String, val anoNascimento: Int = 0) { //valor padrao 0 , se eu nao passar nada la no NEW()
    //pode passar parametros nos () ou em baixo , nos () ele se torna obrigatorio
    var doc: String = "Documento"

    // executado quando a classe e instanciada
    init {
        if (anoNascimento < 0) {
            throw Exception("Ano nascimento não pode ser negatico")
        }
    }
    init {
        println("Classe criada.")
    }

    //secundário
    constructor(nome: String, anoNascimento: Int, doc: String) : this(nome, anoNascimento) //Chama o primario
    {
        println("Construtor secundario.")
        this.doc = doc
    }
    fun acordar() : String {
        return "acordei"
    }

    fun dormir() : String {
        return "dormir"
    }
}


//class Pessoa2 private constructor()

fun main() {
    var p : Pessoa = Pessoa("daniel", 2007) //usar tipos que eu criei , mesma coisa que new Pessoa
    p.nome //acessando o nome de pessoa
    p.acordar() // acessando o comportamento da classe
    p.anoNascimento
   // p.doc
    print(p.dormir())


    val novaPessoa: Pessoa = Pessoa("Danzo", -22, "Danzoooooo")

    //this - instancia da classe / Objeto / CLasse

    throw Exception("dasswswsdada")
}