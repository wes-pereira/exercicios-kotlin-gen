fun main(){

        /*
         * LAÇO 'ENQUANTO' (while)
         *
         1- Elaborar um programa que efetue a leitura
		 * sucessiva de valores numéricos e apresente no
		 * final o total do somatório, a média e o total de
		 * valores lidos. O programa deve fazer as leituras dos
		 * valores enquanto o usuário estiver fornecendo valores
		 * positivos. Ou seja, o programa deve parar quando o usuário
		 * fornecer um valor negativo.
		 */

    var num: Int = 0
    var soma: Int = 0
    var contNum: Int = 0
    // var media: Float = 0.0F

    while(num >= 0) {

        println("Digite um número positivo (ou negativo para encerrar): ")
        val num = readLine()!!.toInt()

        if(num >= 0){
            contNum++
            soma += num

        }

        if(num < 0){
            println("${contNum} valores lidos.")
            println("Média dos valores: ${soma / contNum}")
            println("Soma total dos valores: ${soma}")
            break
        }
    }



}

