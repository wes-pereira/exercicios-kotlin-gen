package ex2poo

class Cliente (
    var nome: String,
    var telefone: String,
    var endereco: String,
    ) {
    var listaCompras = mutableListOf<String>()

    fun addCompra() {

        println("=".repeat(20))
        print("Produto que deseja adicionar: ")
        var addProduto = readln()
        listaCompras.add(addProduto)

        println("$listaCompras adicionado com sucesso ao carrinho.")
        println("=".repeat(20))
    }

    fun exibirCompras() {

        println("=".repeat(20))
        println(listaCompras)
        println("=".repeat(20))
    }

    fun removerCompras() {

        println("=".repeat(20))
        print("Produto a ser removido: ")
        var produtoRemover: String = readln()

        if (listaCompras.contains(produtoRemover)) {
            listaCompras.remove(produtoRemover)
            print("$produtoRemover removido com sucesso!")
        } else {
            print("OPÇÃO INVÁLIDA!")
        }
        println("=".repeat(20))
    }
}
