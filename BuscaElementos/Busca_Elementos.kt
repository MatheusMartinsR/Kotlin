fun main(){

    val names = arrayOf("Alice","Bob", "Charlie", "Maria", "Matheus")
    val searchName = "Matheus"
    var found = false

    for (name in names){
        if (name == searchName){

            found = true
            break
        }
    {
        if (found){
            println("$searchName foi encontrado no array")
        } else{
            println("$searchName não foi encontrado no array")
    }
}