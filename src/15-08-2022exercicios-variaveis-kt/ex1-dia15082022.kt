
fun main(){

    /*
     1 - O usuário digitará sua idade e o
     programa deverá printar o ano em que ele nasceu.
    */

    print("Digite sua idade: ")
    val idade = readln().toInt()

    println("Caso já tenha feito aniversário em 2022, " +
            "seu ano de nascimento é ${2022 - idade}")

}