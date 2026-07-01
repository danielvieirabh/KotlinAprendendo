class Animal( var nome: String) { // ja tem getter e setter criados aqui , com rpivado somente a classe pode acessar
//    var nome: String = ""
        //Ja vem como padrao por isso
//        get() { //em relacao ao nome
//            return field //field : e minha variavel
//        }
//        set(value) {
//            field = value
//        }
}
fun main() {
    GetterSetterJava()
    calculaBonus(CargoEnum.DIRETOR)
    Prioridade.ALTA.id
    for (p in Prioridade.entries) {//mostra todos os valores de propriedade
        println(p)
    }

    val p = Pessoa("Junior", 2029)
    p.acordar()
    p.dormir()
    p.doc
    //Segunda maneira de chamar pelo "p"
    with(p) {  // with (com)
        acordar()
        dormir()
        doc
        "with pode retornar tambem"
    }

   // apply (aplicar)
    p.nome = "Daniel"
    // ou
    p.apply { // vou aplicar os seguintes valores 
        nome = "alteracao de nome"
        doc = "Daniel"
    }
}


fun calculaBonus(cargoEnum:  CargoEnum): Float {
    if (cargoEnum == CargoEnum.DIRETOR) {
        return 5000F
    }
    else if (cargoEnum == CargoEnum.GERENTE) {
      return  3000F
    }
    else {
       return 2000F
    }
}

