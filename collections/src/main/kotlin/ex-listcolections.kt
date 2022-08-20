
fun main(){

    /*
    Crie uma um programa para trabalhar com estoque de uma loja, o programa deverá
    trabalhar com Collection do tipo List do Kotlin para manipular os dados desse estoque, o
    programa deverá atender as seguintes funcionalidades:

    Armazenar dados da List;
    Remover dados da list;
    Atualizar dados da list;
    Apresentar todos os dados da list.
     */

    var produtos = mutableListOf<String>()

    while(true){

        println("         --MENU--")
        println("#".repeat(25))
        println("| [1] CADASTRAR PRODUTO |")
        println("| [2] LISTA DE PRODUTOS |")
        println("| [3] REMOVER PRODUTO   |")
        println("| [4] ATUALIZAR PRODUTO |")
        println("| [5] SAIR              |")
        println("#".repeat(25))

        val opc = readln().toString()

        println("\n".repeat(3))

        when(opc){
            "1" ->{
                print("Nome do produto a ser cadastrado: ")
                var cadProd: String = readln().toString()
                println()
                produtos.add(cadProd)
            }
            "2" ->{
                println("LISTA DE PRODUTOS:")
                println(produtos)

                println("\n".repeat(3))
            }
            "3" ->{
                print("Nome do produto a ser removido: ")
                var removProd: String = readln().toString()

                if(removProd in produtos == true) {
                    produtos.remove(removProd)
                    println("< $removProd > removido da lista com sucesso!")
                }else{
                    println("Produto não identificado")
                }
                println("\n".repeat(3))
            }
            "4" ->{
                print("Nome do produto a ser atualizado: ")
                var updateProd: String = readln().toString()

                if(updateProd in produtos){ //expressão booleana simplificada pela IDE
                    print("Nome do novo produto: ")
                    var posiProd = produtos.indexOf(updateProd)

                    produtos[posiProd] = readln().toString()

                    println("> ${updateProd} < atualizado para > ${produtos[posiProd]} <.")

                    println("\n".repeat(3))
                }else{
                    println("OPÇÃO INVÁLIDA!")
                }


            }
            "5" ->{
                break
            }else ->{
                println("OPÇÃO INVÁLIDA!")
            }

        }
    }

}