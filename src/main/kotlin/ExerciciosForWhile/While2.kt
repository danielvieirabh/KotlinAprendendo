package ExerciciosForWhile


fun main() {
    var numero = 1
    while (numero <= 50) {
        if (numero % 3 == 0) {
            print( "Buzz" )
        }
        if (numero % 5 == 0) {
            print( "Fizz" )
        }
        if (numero % 5 == 0 && numero % 3 ==0) {
            print( " FizzBuzz " )
        }
        numero++
    }
}