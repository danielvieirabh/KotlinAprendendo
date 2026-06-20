package ExercicioEtapa2

fun main() {
    print("Digite a quantidade de anos: ")
    val anos = readLine()
    println("${anos} anos correspondem a: ")
    println("${transformaMeses(anos.toString().toInt())} meses")
    println("${transformaDias(anos.toString().toInt())} dias")
    println("${transformaHoras(anos.toString().toInt())} horas")
    println("${transformaMinutos(anos.toString().toInt())} minutos")
    println("${transformaSegundos(anos.toString().toLong())} segundos")
}

fun transformaMeses(anos: Int): Int {
    return anos * 12
}

fun transformaDias(anos: Int): Int {
    return anos * 365
}
fun transformaHoras(anos: Int): Int {
    return anos * 8760
}

fun transformaMinutos(anos: Int): Int {
    return anos * 525600
}

fun transformaSegundos(anos: Long): Long {
    return anos * 365 * 24 * 60 * 60
}