fun main(){

    /*
    3- Solicitar a idade de várias pessoas e imprimir: Total de pessoas com menos de
    21 anos. Total de pessoas com mais de 50 anos. O programa termina quando
    idade for =-99. (WHILE)
    */

    var idade21mais: Int = 0
    var idade50mais: Int = 0

    while(true){

        println("Idades (digite -99 para encerrar): ")
        var idade: Int = readln().toInt()

        if(idade < 21 && idade != -99){
            idade21mais ++
            println("\n".repeat(3))
            println("TOTAL PESSOAS COM MENOS DE 21 ANOS: $idade21mais")
            println("TOTAL PESSOAS COM MAIS DE 50 ANOS: $idade50mais \n")

        }else if(idade > 50 && idade != -99){
            idade50mais ++
            println("\n".repeat(3))
            println("TOTAL PESSOAS COM MENOS DE 21 ANOS: $idade21mais")
            println("TOTAL PESSOAS COM MAIS DE 50 ANOS: $idade50mais \n")

        }else{
            break
        }

    }

}