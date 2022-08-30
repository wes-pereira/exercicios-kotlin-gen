package ex1poo

abstract class Animal(
    val nome: String,
    val idade: Int
    ){

    abstract fun emitirSom()

    abstract fun movimento()
}

