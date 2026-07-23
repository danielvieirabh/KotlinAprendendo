fun main() {

    val  map1 = mapOf(Pair("chave", "valor"))
    println(map1)
    val  map2 = mutableMapOf(Pair("chave", "valor"), Pair("chave", "valor2"))

    map2["Brasil"] = "Btrasilia"
    map2.remove("Brasil")

    Pair("dada", 2)

    println(map1.keys)
    println(map1.values)
    map1.containsKey("chave")
    map2.size

    val config = mapOf(
        "URL" to "www.google.com"
    )
}