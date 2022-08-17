fun main(){

    /*
    6- Escrever um programa que receba vários números inteiros no teclado. E no
    final imprimir a média dos números múltiplos de 3. Para sair digitar
    0(zero).(DO...WHILE)
    */

    var somaMult3: Int = 0
    var cont: Int = 0

    do{
        println("Digite um número (ou 0 para encerrar)")
        var num: Int = readln().toInt()

        if(num % 3 == 0){
            somaMult3 += num
            cont ++
        }
    }while(num != 0)

    println("A média da soma ($somaMult3) dos número multiplos de 3 é |${somaMult3 / cont}|")

}