fun main() {
    for (i in 0..10) { //0 ate 10

        if (i == 5) { // vai do 0 ate o 4 , porque ele para
            break
        }

        if (i == 5) { // imprime todos os numero menos 5 , porque encntra ele e pula ele
            continue
        }
        print("$i ")
    }

    for (i in 0..20) {
        for (j in 0 .. 5) { //imprime do 0 ao 5, 20 vezes
            println("j: $j ")
        }
        println()
        print("i: $i ")
    }

    for (i in 0..20 step 2) { //pula de 2 em 2
        print("$i ")
    }

    for (i in 20 downTo 0 step 5) { // step = pula de 5 em 5 , downTo = do 20 ao 0
        print("$i ")
    }

    val str = "Programacao Kotlin"
    for (j in str) {
        print(j)
    }
//
//    for (x = 0; x <= 10; x++ ) {
//
//    }
}