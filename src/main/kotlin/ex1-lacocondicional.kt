fun main(){

    /*
      1) João, homem de bem, comprou um microcomputador para controlar
      o rendimento diário de seu trabalho. Toda vez que ele traz um peso
      de tomate maior que o estabelecido pelo regulamento do estado de São
      Paulo (50 quilos) deve pagar um multa de R$ 4,00 por quilo excedente.
      João precisa que você faça um sistema que leia a variável P (peso de tomates)
      e verifique se há excesso. Se houver, gravar na variável E (Excesso) e na variável
      M o valor da multa que João deverá pagar. Caso contrário mostrar tais variáveis
      com o conteúdo ZERO.
    */

    var pesoTomate: Float = 0.0F
    var excesso: Float = 0.0F
    var multa: Float = 0.0F

    println("Peso dos tomates: ")
    // var pesoTomate = readLine()!!.toFloat() // não entendi porque colocando "var" no inicio dá erro.
    pesoTomate = readLine()!!.toFloat()

    if(pesoTomate > 50){
        excesso = pesoTomate - 50
        multa = excesso * 4

        println("Valor de excesso: ${excesso}")
        println("Valor de multa: R$${multa}")
    }else{
        println("Valor de excesso: ${excesso}")
        println("Valor de multa: R$${multa}")
    }



}