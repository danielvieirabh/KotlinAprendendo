fun calculaBonus(tempo: Int): Float {
    //Ma pratica :
    if (tempo == 0) {
        return 500F
    }
    else{
        if (tempo == 1) {
            return 2000F
        }
        else {
            if (tempo == 2) {
                return 2000F
            }
            else {
                if (tempo ==3) {
                    return 2000F
                }
                else {

                }
            }
        }
    }
    return 0F
}

fun calculaBonus2(tempo: Int): Float {
    if (tempo ==0) {
        return 500F
    }
    //Ou usar
    else if (tempo in 1 .. 3) {  //Tempo de 1 a 3
        return 2000F
    }
//    else if (tempo >= 1 && tempo <= 3) {
//        return 2000F
//    }

    else if (tempo >= 4) {
        return 5000F
    }

    return 0F
}

fun calculaBonus3(tempo: Int): Float {
    var bonus = 0F
    if (tempo ==0) {
        bonus =  500F
    }
    else if (tempo in 1 .. 3) {  //Tempo de 1 a 3
        bonus = 2000F
    }
    else if (tempo >= 4) {
        bonus = 5000F
    }
    return bonus
}

fun calculaBonus4(tempo: Int, cargo: String): Float {
    if (cargo == "Diretor") {
        return 10000F
    }
    else { //So executa isso se nao for diretor
        var bonus = 0F

        if (tempo ==0) {
            bonus =  500F
        }
        else if (tempo in 1 .. 3) {  //Tempo de 1 a 3
            bonus = 2000F
        }
        else if (tempo >= 4) {
            bonus = 5000F
        }
        return bonus
    }
}

fun calculaBonus5(tempo: Int, cargo: String): Float {
    //Assim que tenho um valor ja retorno ele sem else = EARLY RETURN
    if (cargo == "Diretor") {
        return 10000F
    }
    if (tempo == 0) {
        return 500F
    }
    if (tempo in 1..3) {  //Tempo de 1 a 3
        return 2000F
    }
    if (tempo >= 4) {
        return 5000F
    }
    return 0F
}

fun main() {
   println( calculaBonus2(-5))
}