fun main(){

    /*
    2- Faça um programa que entre com três números e coloque em ordem crescente.
    */

    var numMaior: Int = 0
    var numMedio: Int = 0
    var numMenor: Int = 0

    print("Digite um número: ")
    val num1: Int = readln().toInt()

    print("Digite outro número: ")
    val num2: Int = readln().toInt()

    print("Digite somente mais um número: ")
    val num3: Int = readln().toInt()

    //if(num1 >= num2 && num1 >= num3 && num2 > num3){
    if(num2 in num1..num3){
        numMenor = num1
        numMedio = num2
        numMaior = num3
    }else if (num2 in num3..num1){
        numMenor = num3
        numMedio = num2
        numMaior = num1
    }else if (num3 in num1..num2){
        numMenor = num1
        numMedio = num3
        numMaior = num2
    }else if(num3 in num2..num1){
        numMenor = num2
        numMedio = num3
        numMaior = num1
    }else if(num1 in num2..num3){
        numMenor = num2
        numMedio = num1
        numMaior = num3
    }else{
        numMenor = num3
        numMedio = num1
        numMaior = num2
    }

    println("$numMenor | $numMedio | $numMaior")
}