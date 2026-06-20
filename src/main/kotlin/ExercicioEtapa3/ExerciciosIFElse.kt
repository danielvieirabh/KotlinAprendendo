package ExercicioEtapa3

//Exercicio 1
fun bonusFuncionarios( cargo: String): Double {
    if (cargo == "gerente") {
        return 2000.0
    }
    if (cargo == "coordenador") {
        return 1500.0
    }
    if (cargo == "engenheiro de software") {
        return 1000.0
    }
    if (cargo == "estagiário") {
        return 500.0
    }
    return 0.0;
}

//Exercicio 2
fun bonusFuncionarios2(exp: Int , cargo: String): Double { //exp = ano de experiencia
    if (cargo == "gerente") {
       return if (exp < 2) {
             2000.0
        }
        else {
             3000.0
        }
    }
    if (cargo == "coordenador") {
       return if (exp < 1) {
           1500.0 //nao precisa de return aqui
       }
        else {
            1800.0
        }
    }
    if (cargo == "engenheiro de software") {
        return 1000.0
    }
    if (cargo == "estagiário") {
        return 500.0
    }
    return 0.0;
}

fun main() {
    println(bonusFuncionarios("analista"))


    //Exercicio 3
    val a = false
    val b = false
    val c =  true
    val d = true

    // Ordem de prioridade e sempre parenteses ()
    println(a && b && c && d) // false
    println(!a && !b && (c && d)) //true
    println(a && ((b || c) || d)) // false
    println(a || ((!b && c)|| !d)) //true
}
