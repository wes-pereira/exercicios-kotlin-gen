fun main() {

    print("SELECIONE UMA OPERAÇÃO:\n " +
            "[1]SOMA\n" +
            " [2]SUBTRAÇÃO\n" +
            " [3]MULTIPLICAÇÃO\n" +
            " [4]DIVISÃO\n")
    val resp: Int = readln().toInt()

    if(resp in 1..4) {

        print("Digite o primeiro número: ")
        var n1: Int = readln().toInt()

        print("Digite o segundo número: ")
        var n2: Int = readln().toInt()

        when(resp){
            1 -> {println("$n1 + $n2 = ${soma(n1, n2)}")}
            2 -> {println("$n1 - $n2 = ${subt(n1, n2)}")}
            3 -> {println("$n1 x $n2 = ${mult(n1, n2)}")}
            4 -> {println("$n1 / $n2 = ${divs(n1, n2)}")}

            //     else -> {print("Opção Inválida!")}
        }

    }else{
        print("OPÇÃO INVÁLIDA!")
    }
   // var result: Int = 0



}

