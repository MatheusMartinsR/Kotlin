fun main(){

    val numbers = intArrayOf(8,3,12,6,20)
    var min = numbers[0]
    var max = numbers[0]

    for (number in numbers){
        if (number < min){
            min = number 
        }
        if (number > max){
            max = number
        }

        println("O menor elemento é: $min")
        println("O maior elemento é: $max")
    }
