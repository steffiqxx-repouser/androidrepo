class BankAccount(val owner:String,val bal:Double){
    init{
        require(owner.isNotBlank()){
            "Name needed"
        }
        require(bal>=0){
            "Balance negative"
        }
    }
}

fun main(){
    val ok =BankAccount("Alex",995.00)
    println(ok.bal)
}