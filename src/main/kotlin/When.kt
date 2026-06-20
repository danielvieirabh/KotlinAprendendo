fun bonus( cargo: String): Double {
    return if (cargo == "gerente") {
        2000.0
    } else if (cargo == "coordenador") {
        1500.0
    } else if (cargo == "engenheiro de software") {
        1000.0
    } else if (cargo == "estagiário") {
        500.0
    }
    else{
        0.0;
    }

    //versao when
    return when (cargo) {
        "gerente" -> {
            2000.0
        }
        "coordenador" -> {
            1500.0
        }
        "engenheiro de software" -> {
            1000.0
        }
        "estagiário" -> {
            500.0
        }
        else -> {
            0.0;
        }
    }
}

fun main() {
    val numero = 5

    //When = quando
    when (numero) { //tudo que faz com if else faz com when
        1 -> { //QUando a variavel numero vale 1
            // executa esse corpo
            println("Valor é 1")
        }
        in 2..9 -> { // esta entre 2 e 9
            println("Valor é de 2 a 9")
        }
        else -> { //Se nao assumir nem 1 e nem 2 cai no else

        }
    }
}