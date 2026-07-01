package ExerciciosForWhile

fun main() {
    val salario = 10000.0
    var patrimonioAna = 0.0
    var patriminioPaula = 0.0
    var meses = 1

    do {                // porcentagem  empresa 0.05
        patrimonioAna += (salario * 0.05) + (salario * 0.05) + (patrimonioAna * 0.002)
        patriminioPaula += (salario * 0.05) +  (patriminioPaula * 0.008)
        println("Ana " + patrimonioAna)
        println("Paula " + patriminioPaula)
        meses++
    }
    while (patriminioPaula < patrimonioAna)

    print("Paula vai ultrapassar o patrimonio de Ana no mês: ${meses}")
}