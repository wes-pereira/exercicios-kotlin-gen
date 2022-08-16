
fun main(){

    /*
     2 - Faça um programa em que o usuário digite o diâmetro
     de um círculo e calcule a área e o perímetro dele.
    */


    /*
    ###########################
    TUTORIAL CALCULAR ÁREA DO CÍRCULO A PARTIR DO DIÂMETRO,
    FONTE (ACESSO EM 15/08/2022):
    https://educacao.umcomo.com.br/artigo/como-calcular-a-area-conhecendo-o-diametro-1966.html
    ###########################

     Passo 1: Para poder calcular a área com um diâmetro, tem que dividir
     o número pi por 4. O número Pi é aproximadamente 3,14, portanto dividido
     por 4 equivale aproximadamente a 0,785.
     */
    val numPI: Double = 3.141592653589793
    val piPOR4: Double = numPI / 4

    // Passo 2: Faça o quadrado da medição do diâmetro.
    print("Diâmetro: ")
    var diam = readln().toDouble()

    var quadDiam = diam * diam

    // Passo 3: Multiplique o diâmetro ao quadrado por um quarto de Pi.
    var area: Double = quadDiam * piPOR4

    print("A área do círculo é: ")
    print("%.2f".format(area) + "m²")

}
