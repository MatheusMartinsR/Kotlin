fun main({
    var idade = println("Digite a sua idade: ")
    var idade = readline()

    if(idade == null){
        println("Entrada inválida")
        return
    }

    var idade= idadeInput.toIntorNull()

    if(idade == null){
        println("Idade inválida!")
        return
    }

    if(idade >= 18) println("Você é maior de idade")
    else println("Você é menor de idade")

}