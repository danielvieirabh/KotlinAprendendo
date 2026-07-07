package sealed

import java.util.InputMismatchException

sealed class Result { //So permite heranca dentro do pacote , fora dele nao , pois nao pode sorbrescrever outros comportamentos de classes
}

//Nao pode existir meio termo
class Success : Result() {}
class Failure : Result() {}

fun sealedExample(abc: Result) {

}
