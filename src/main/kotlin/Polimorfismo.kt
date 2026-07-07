interface Funcionario {
    fun calculaBonus(): Float
}

class Gerente : Funcionario { // gerente herda de funcionario
    override fun calculaBonus(): Float {
        return 5000F
    }

}

class Analista : Funcionario {
    override fun calculaBonus(): Float {
        return 3000F
    }
}

fun imprimeValorBonus(funcionario: Funcionario) {
    println(funcionario.calculaBonus())
}

fun main() {
    //POlimorfismo aqui , espera varias formas
    imprimeValorBonus(Gerente())
    imprimeValorBonus(Analista())
}
