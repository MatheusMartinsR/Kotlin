fun main(){

    println("Digite seu nome:")
    val nome = readLine()

    println("Digite sua idade:")
    val idade = readLine()!!.toInt()

    println("Digite seu email:")
    val email = readLine()!

    println("O usuário está ativo?(true/false): ")
    val usuarioAtivo = readLine()!!.toBoolean()

    println("Nome: $nome")
    println("Idade: $idade")
    println("Email: $email")
    println("Ativo: $usuarioAtivo")
}