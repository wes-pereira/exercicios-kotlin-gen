fun main(){

    /*
    1- Informar todos os números de 1000 a 1999 que quando divididos por 11
    obtemos resto = 5. (FOR)
    */

    for(i in 0..1000){
        val divRest: Int = i % 11
        if(divRest == 5){
            println(i)
        }
    }

}