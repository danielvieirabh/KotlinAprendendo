fun main() {
    val str: String? = null

    if (str == null) {
        println("Nulo")
    }
    else  {
        print(str)
    }
    // Maneira com operador Elvis , vai cair em nulo se for null
    println(str ?: "nulo")
}