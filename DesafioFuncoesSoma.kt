fun somaDosQuadrados(a: int, b: int): Int{

    val quadradoA = a * a 

    val quadradoB = b * b

    return quadradoA + quadradoB
}

fun main(){

    val numero1 = 6


    val numero2 = 5

    val resultado = somaDosQuadrados(numero1, numero2)

    println("A soma dos quadrados de $numero1 e $numero2 é: $resultado")
}