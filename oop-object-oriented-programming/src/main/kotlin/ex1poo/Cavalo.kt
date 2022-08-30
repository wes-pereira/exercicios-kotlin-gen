package ex1poo

class Cavalo(
    nome: String,
    idade: Int,
    var porte: String,
    var ragiao: String

    ):Animal(nome, idade){
    override fun emitirSom() {
        print("Relinchando...")
    }

    override fun movimento() {
        print("Galopando...")
    }


}