//fun empacotar(id: Int) {}
//fun empacotar(str: String) {}
//fun empacotar(b: Boolean) {}
fun <T> empacotar(x: T) : T {// tipo generico  e o que eu quiser
    return x
}

class ClasseGenerics<T> { //Pode fazer com classe tambe o generics
    fun save(value: T) {}
}

fun main() {
    listOf(10)

    val abc = empacotar(10)  // escolhe o tipo que eu quiser

    empacotar(false)
    empacotar(10F)
}