
    /*
    2) Crie uma classe avião e apresente os atributos e métodos referentes
    esta classe, em seguida crie um objeto avião, defina as instancias deste
    objeto e apresente as informações deste objeto no console.
     */


    class Aviao(
        var modelo: String,
        var classe: String,
        var companhia: String,
        var cor: String
        ){

        fun selecAviao(){
            print("$modelo $classe $companhia $cor")

    }



}