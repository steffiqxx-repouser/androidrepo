//fun main(args:Array<Int>){
 // var input=readlnOrNull()?:0
  //var bankAccountBalance=(input*3).toInt()
  fun main() {
    val input = readlnOrNull()?.toIntOrNull()
    if (input == null) {
        println("Please enter a valid whole number.")
        return
    }

    val bankAccountBalance = input * 3
    println("Bank account balance is $bankAccountBalance")
}

//}