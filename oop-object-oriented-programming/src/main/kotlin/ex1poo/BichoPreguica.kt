package ex1poo

class BichoPreguica(
    nome: String,
    idade: Int,
    val estaChao: Boolean
):Animal(nome, idade) {
    override fun emitirSom() {
        print("Sons de Bicho-preguiça...")
    }

    override fun movimento() {

        if(estaChao == true){
            print("Escalando uma árvore...")
        }else{
            print("Descendo de uma árvore...")
        }
    }
}