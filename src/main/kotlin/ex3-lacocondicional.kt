import kotlin.math.pow

fun main(){

    /*
    3) Desenvolva um sistema em que:
 Leia 4 (quatro) números;
 Calcule o quadrado de cada um;
 Se o valor resultante do quadrado do terceiro for >= 1000, imprima-o e finalize;
 caso contrário, imprima os valores lidos e seus respectivos quadrados.
    */


    // declarando como Double p/ usar a função Math.pow
    var num1: Double = 0.0
    var num2: Double = 0.0
    var num3: Double = 0.0
    var num4: Double = 0.0

    println("Primeiro número: ")
    num1 = readLine()!!.toDouble()

    println("Segundo número: ")
    num2 = readLine()!!.toDouble()

    println("Terceiro número: ")
    num3 = readLine()!!.toDouble()

    println("Quarto número: ")
    num4 = readLine()!!.toDouble()

    if(Math.pow(num3, 2.0) >= 1000){  //if(Math.pow(num3, 2.0) >= 1000000000000 ) p/ testes

        // (?) quando insere 50000 ou maior (testei a partir de 50000),
        // retorna um valor inesperado/errado (acredito que seja o valor limite da variável).
        println("O valor do quadrado do terceiro número é ${Math.pow(num3, 2.0).toInt()}")

    }else{

        // (?) quando insere 50000 ou maior (testei a partir de 50000), 
        // retorna um valor inesperado/errado (acredito que seja o valor limite da variável).
        println("O valor do quadrado do primeiro número é ${Math.pow(num1, 2.0).toInt()}")
        println("O valor do quadrado do segundo número é ${Math.pow(num2, 2.0).toInt()}")
        println("O valor do quadrado do terceiro número é ${Math.pow(num3, 2.0).toInt()}")
        println("O valor do quadrado do quarto número é ${Math.pow(num4, 2.0).toInt()}")
    }

}