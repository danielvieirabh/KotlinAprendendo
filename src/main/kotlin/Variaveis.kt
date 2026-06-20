fun main() {
    var b: Boolean = false;
    var str: String = "Hello World!"; //Sequencia de caracteres
    var c: Char = 'G'; //so  pode armazenar 1 caracter

    var f: Float = 10.5F; //Forçar o float
    var double = 10.3131135; //com casa decimal e sempre Double

    //Se usar armazenamento atoa pode prejudicar armazenamento

    var abc: Long = 150; //no Kotlin o compilador ele escolhe e ja faz qual variavel ele , e usar sometne VAR
    var i : Int = 150;

    var byte: Byte = 10; //O menor que tem
    var short: Short = 15;

    //o Boolean a JVM escolhe o tamanho dele

    println("${Double.MIN_VALUE} - ${Double.MAX_VALUE} ")
    println("${Float.MIN_VALUE} - ${Float.MAX_VALUE} ")
    println("${Long.MIN_VALUE} - ${Long.MAX_VALUE} ")
    println("${Int.MIN_VALUE} - ${Int.MAX_VALUE} ")
    println("${Short.MIN_VALUE} - ${Short.MAX_VALUE} ")
    println("${Byte.MIN_VALUE} - ${Byte.MAX_VALUE} ")


}