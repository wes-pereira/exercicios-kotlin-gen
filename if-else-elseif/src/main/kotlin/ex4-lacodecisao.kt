import kotlin.math.pow
// import kotlin.math.sqrt
fun main(){

    /*
    4- Faça um programa em que permita a entrada de um número qualquer e exiba se este
    número é par ou ímpar. Se for par exiba também a raiz quadrada do mesmo; se for
    ímpar exiba o número elevado ao quadrado.
    */

    print("Digite um número: ")
    val num: Int = readln().toInt()

    if(num % 2 == 0){
        print("A raiz quadrada de $num é ${num.toDouble().pow(0.5).toLong()}")
    }else{
        print("O quadrado de $num é ${num.toDouble().pow(2).toLong()}")
    }
}