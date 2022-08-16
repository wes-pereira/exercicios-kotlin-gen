fun main(){

    /*
     2) Elabore um sistema que leia as variáveis C e N,
     respectivamente código e número de horas trabalhadas de um operário.
     E calcule o salário sabendo-se que ele ganha R$ 10,00 por hora.
     Quando o número de horas exceder a 50 calcule o excesso de pagamento armazenando-o
     na variável E, caso contrário zerar tal variável. A hora excedente de trabalho
     vale R$ 20,00. No final do processamento imprimir o salário total e o salário excedente.
     */

    var codOP: Int = 0
    var horaTrab: Int = 0
    var horaExtra: Int = 0
    var salExtra: Float = 0.0F

    println("Código do operário: ")
    codOP = readLine()!!.toInt()

    println("Horas trabalhadas: ")
    horaTrab = readLine()!!.toInt()

    if(horaTrab > 50){
        horaExtra = horaTrab - 50
        // salExtra = (horaExtra * 20).toFloat()
        salExtra = (horaExtra * 20.0F)

        println("Total de horas trabalhadas: ${horaTrab}")
        println("Total de horas EXTRAS trabalhadas: ${horaExtra}")
        println("Valor por horas extras a receber: R$${salExtra}")
        println("Salário total com horas extras: R$${salExtra + (horaTrab * 10)}")
    }else{
        println("Total de horas trabalhadas: ${horaTrab}")
        println("Total de horas EXTRAS trabalhadas: ${horaExtra}")
        println("Valor por horas extras a receber: R$${salExtra}")
        println("Salário total com horas extras: R$${salExtra + (horaTrab * 10)}")
    }


}