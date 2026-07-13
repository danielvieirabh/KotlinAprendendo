fun main() {
    val list1 = listOf("oi", 1 , 2 , 3 , 4,  5 , 6) // Lista que aceita varios tipos
    val list2 = listOf<Int>(1 , 2 , 3 , 4,  5 , 6) //Lista de inteiros  (FORÇANDO O TIPO DA LISTA)

    val list3 = mutableListOf<Int>(1, 2 , 3 ,4 ,5 ,6)
    list3.removeFirst() //remove o primeiro
    list3.add(0 , 5) // na posicao 0 adicionar o 5
    list3.removeLast() //remove o ultimo
    println(list3)
}