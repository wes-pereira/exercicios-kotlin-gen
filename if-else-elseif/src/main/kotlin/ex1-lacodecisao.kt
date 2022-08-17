fun main(){

    /*
    1- Faça um programa que receba três inteiros e diga qual deles é o maior.
    */

    print("Digite um número: ")
    val num1: Int = readln().toInt()

    print("Difite outro número: ")
    val num2: Int = readln().toInt()

    print("Digite somente mais um número: ")
    val num3: Int = readln().toInt()

    if(num1 >= num2 && num1 >= num3){
        println("O maior número digitado foi ${num1}")
    }else if(num2 >= num1 && num2 >= num3){
        println("O maior número digitado foi ${num2}")
    }else if(num3 >= num1 && num3 >= num2){
        println("O maior número digitado foi ${num3}")
    }

}