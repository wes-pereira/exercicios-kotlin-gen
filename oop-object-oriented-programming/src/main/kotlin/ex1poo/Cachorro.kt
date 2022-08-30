package ex1poo

class Cachorro(
     nome: String,
     idade: Int,
     val raca: String,
     val cor: String

    ):Animal(nome, idade){
    override fun emitirSom() {
        print("Latindo")
    }

    override fun movimento() {
        print("Correndo like a dog...")
    }
}