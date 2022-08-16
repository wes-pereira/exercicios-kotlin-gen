fun main(){

    /*
    * #LAÇO 'PARA' (FOR)
    *
	* 1- A prefeitura de uma cidade fez uma pesquisa entre
	* 20 de seus habitantes, coletando dados sobre o salário e
	* número de filhos. A prefeitura deseja saber:
	* a) média do salário da população;
	* b) média do número de filhos;
	* c) maior salário;
	* d) percentual de pessoas com salário até R$100,00.
	*/

    var habit: Int = 0
    var habitSal: Float = 0.0F
    var habitFilho: Int = 0

    var medSal: Float = 0.0F
    var medFilho: Float = 0.0F

    var maiorSal: Float = 0.0F
    var salTotal: Float = 0.0F
    var filhoTotal: Float = 0.0F

    var salAte100: Int = 0


    for(i in 1..20){
        habit++

        println("${i} ºHABITANTE")

        println("SALÁRIO: ")
        val habitSal = readLine()!!.toFloat()

        salTotal += habitSal

        // Contando a quantidade de salários maiores que 100
        if(habitSal > 100){
            salAte100++
        }

        // Definindo o maior salário
        if(i == 1){
            maiorSal = habitSal
        }else if(habitSal > maiorSal){
            maiorSal = habitSal
        }

        println("NÚMERO DE FILHOS: ")
        val habitFilho: Int = readLine()!!.toInt()

        filhoTotal += habitFilho

    if(i == 20) {
        println("A média salarial da população é de $${salTotal / habit}")
        println("A média de filhos da população é de ${filhoTotal / habit}")
        println("$${maiorSal} é o maior salário")
        println("${(salAte100 * 100) / habit}% dos habitantes recebem mais que $100.")
    }



    }








}