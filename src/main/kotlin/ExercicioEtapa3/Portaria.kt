package ExercicioEtapa3

fun main() {
    print("Digite a idade: ")
    val idade = readLine().toString().toInt()
    print("Digite o tipo de Convite: ")
    val convite = readLine().toString().lowercase()
    print("Digite o Código de Convite: ")
    val codigoConvite = readLine().toString().lowercase()
    println(portariaEvento(idade, convite, codigoConvite))
}

fun portariaEvento(idade: Int, convite: String, codigoConvite: String ) : String {
    if (idade >= 18) {
        if ((convite == "luxo" || convite == "premium" && codigoConvite.startsWith("XL") || (convite == "comum" && codigoConvite.startsWith("XT")))) {
            return  "Acesso permitido seu bucetudo"
        }
        else {
            return  "Negado. COnvite Inválido"
        }
    }
    else {
        return "Acesso negado. Menores de idade não sao permitidos!"
    }

}


//
//fun portariaEvento2() : String {
//    print("Digite a idade: ")
//    val idade = readLine().toString().toInt()
//    if (idade >= 18) {
//        print("Digite o tipo de Convite: ")
//        val convite = readLine().toString().lowercase()
//        print("Digite o Código de Convite: ")
//        val codigoConvite = readLine().toString().lowercase()
//        if ((convite == "luxo" || convite == "premium" && codigoConvite.startsWith("XL") || (convite == "comum" && codigoConvite.startsWith("XT")))) {
//            return  "Acesso permitido seu bucetudo"
//        }
//        else {
//            return  "Negado. COnvite Inválido"
//        }
//    }
//    else {
//        return "Acesso negado. Menores de idade não sao permitidos!"
//    }
