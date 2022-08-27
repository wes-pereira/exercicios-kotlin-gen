package PooClasses
    /*
    1) Crie uma classe cliente e apresente os atributos e métodos referentes
    esta classe, em seguida crie um objeto cliente, defina as instancias deste
    objeto e apresente as informações deste objeto no console.
     */

class Cliente(
    var nome: String,
    var idade: Int,
    var cpf: String,
    var email: String
) {
    fun cadastrarCliente(){

        print("$nome, $idade, $cpf, $email")


    }

}