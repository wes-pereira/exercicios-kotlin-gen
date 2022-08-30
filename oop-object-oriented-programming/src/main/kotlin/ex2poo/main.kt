package ex2poo

fun main() {

        /*
        1. Cria uma Classe Cliente, contendo os atributos encapsulados,
        um construtor padrão nome (String), endereço (String), telefone
        (String), listaDeCompras (mutableListOf<Strings>()).
        A classe precisará de métodos para adicionar, remover e listar
        os itens do atributo listaDeCompras. Crie um método para verificar
        o nome ao inicializar a classe e, caso esteja vazio, jogue uma exceção.
        Ao instanciar a classe cliente na função main(), não esquecer de colocar
        dentro de um bloco try catch.
         */

    try {
        print("Nome: ")
        var nome: String = readln()

        print("Telefone: ")
        var telefone: String = readln()

        print("Endereco: ")
        var endereco: String = readln()

        val cliente1 = Cliente(nome, telefone, endereco)

        while (true) {
            println(
                "Selecione uma opção:\n" +
                        "[1] ADCIONAR PRODUTO\n" +
                        "[2] EXIBIR CARRINHO\n" +
                        "[3] REMOVER DO CARRINHO\n" +
                        "[4] SAIR"
            )
            var resp = readln().toInt()

            when (resp) {

                1 -> cliente1.addCompra()
                2 -> cliente1.exibirCompras()
                3 -> cliente1.removerCompras()
                4 -> break
                else -> print("OPÇÃO INVÁLIDA!")
            }
        }
    }catch (e: Exception){
        println(e.message)
    }
}




