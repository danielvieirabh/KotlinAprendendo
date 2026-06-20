import java.util.Locale

fun main() {
    val nome = "John"
    println("OLa , ${nome}")

    println("Olasss, %s %s".format(nome, nome)) // %s indica uma string que e um placeholder que via trocar por nome

    // %s - String
    // %d - Int
    // %f - Ponto Flutuante
    // %c - Char
    // %b - Boolean

    val value = 5
    val salario = 16855.95 //double


    println("Valor: %d - Salario: %f ".format(value,salario))
    // %02d , para colocar 2 casas decimais no 5 e ficar 05
    println("Valor: %02d - Salario: %.2f ".format(value,salario))

    println("Valor: %02d - Salario: %.2f ".format(Locale.US, value,salario)) //O Locale.US , Transforma em vez de "," um "."
}