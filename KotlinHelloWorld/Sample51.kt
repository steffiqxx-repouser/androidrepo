fun main(){
    //var input=readlnOrNull().toIntOrNull()?:0
   // var balanceAfter5years=(input*1.05).toInt()
        val input = readlnOrNull()?.toIntOrNull()
    if (input == null) {
        println("Please enter a valid whole number.")
        return
    }
    val balanceAfter5years = (input * 1.05).toInt()
    println("Balance after 5 years: $balanceAfter5years")
}