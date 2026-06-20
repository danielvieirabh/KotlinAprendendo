fun ehManha(manha: Boolean) {
    if (manha) {
        println("Acorde!")
    }
}

fun maiorIdade(idade: Int): Boolean {
    if (idade >= 18) {
        return true
    }
    else {
        return false
    }
    // ou fazer isso:
    // return (idade >= 18)
}
// ou assim :
fun maiorDeIdade(idade: Int): Boolean = (idade >= 18)

// outro exemplo:
fun mensalidadeCurso(curso: String): Double {
    if (curso == "informatica") {
        return 500.0;
    }
    else if (curso == "geografia") {
        return 600.0
    }
    else {
        return -1.0 //Se e um outro curso traz -1
    }
}
// ou :
fun mensalidadeCurso2(curso: String): Double {
    var mensalidade = -1.0
    if (curso == "informatica") {
        mensalidade = 500.0
    }
    else if (curso == "geografia") {
        mensalidade = 600.0
    }
    return mensalidade
}


fun main() {
    ehManha(true)
    ehManha(false)

    val str  = "Programacao"
    if (str.contains("Kotlin")) { //SO se tiver kotlin
        println("COntem Kotlin")
    }

    println(maiorIdade(15))
    println(mensalidadeCurso("direito"))

}