fun main() {
    val dados = listaDeDados()

    dados.any() //se existe retorna true
    dados.count() //retorna o numero de elementos na colecao

    println(dados.filter { it.calorias > 500 } ) //so retorna receita com calorias maior que 500

    println(dados.any{it.calorias > 500}) //existe receita com mais de 500 calorias ??
    println(dados.count { it.calorias > 500 }) //quantas receitas possui mais de 500 calorias


    println(dados.first { it.calorias > 500 }) //primeira receita com calorias maior que 500
    println(dados.last { it.calorias > 500 }) //ultima receita com calorias maior que 500
    println(dados.firstOrNull())  // se a lista estiver vazia ja retorna null

    //sum e sumOf
    listOf(1,2,3).sum() //sum precisa de uma colecao numerica
    dados.sumOf { it.calorias } //somar calorias

    //somar calorias do filter :

   val filtrado = dados.filter { it.calorias > 500 }
   println( filtrado.sumOf { it.calorias })

    //max min
    listOf(1,2,3).maxOrNull() //retorna o maior elemento ou retorna null
    listOf(1,2,3).min()

    dados.maxOf { it.calorias }
    dados.minOf { it.calorias }

    println(dados.maxBy { it.calorias }.nome )//usar o or null pois se nao vai dar deprecated

   val a1 = dados.take(20 )
    val a2 =  dados.takeLast(20)//ultimos 2 elementos

    for (x in a1) { // Para x em a1
        print(x.nome)
    }

    dados.take(2).forEach { println(it.nome) } // para cada um dos itens eu vou imprimir

    //map
    println(dados.map {
        Pair(it.nome, it.calorias)
    }) // colecao como nome e calorias de receitas

    //average, distinct, sorted e recersed

    val numbers = listOf(6 ,6,76,22,131,522,563, 1,1,1,1,1,1,1,1,1)
    numbers.average() // aqui tem e uma media
    numbers.distinct() // mostra somente o numero sem repetir
    dados.distinctBy {it.ingredientes}

    println(numbers.sorted())
    println(numbers.sortedDescending())
    println(println(numbers.sorted())) // lista de tras para frente

    dados.filter { it.nome.startsWith("P") }.sortedBy { it.nome }.map { it.nome }.forEach { println(it.uppercase()) } // filtrar dados que começa com a letra P, crio uma colecao com map
}


private fun listaDeDados(): List<Receita> {
    return listOf(
        Receita(
            "Lasanha", 1200,
            listOf(
                Ingrediente("Presunto", 5),
                Ingrediente("Queijo", 10),
                Ingrediente("Molho de tomate", 2),
                Ingrediente("Manjerição", 3)
            )
        ),
        Receita("Panqueca", 500),
        Receita("Omelete", 200),
        Receita("Parmegiana", 700),
        Receita("Sopa de feijão", 300),
        Receita(
            "Hamburguer", 2000,
            listOf(
                Ingrediente("Pão", 1),
                Ingrediente("Hamburguer", 3),
                Ingrediente("Queijo", 1),
                Ingrediente("Catupiry", 1),
                Ingrediente("Bacon", 3),
                Ingrediente("Alface", 1),
                Ingrediente("Tomate", 1)
            )
        )
    )
}


data class Receita(val nome: String , val calorias: Int, val ingredientes: List<Ingrediente> = listOf()) //LISTA DE INGREDIENTES
data class Ingrediente(val nome: String , val quantidade: Int)