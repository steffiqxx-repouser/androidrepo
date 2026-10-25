fun main(){
    var acc=Account("123456789")
    acc.deposit(7575)
    acc.deposit(9795)
    acc.deposit(2895)
    //acc.deposit(4200)
    acc.withdraw(4200)



}
class Account(val accountNumber:String){
    var balance=0
    var transactions=mutableListOf<Int>()
    fun deposit(amount:Int){
        if(amount>0){
            transactions.add(amount)
            balance+=amount
            println("$amount deposited.Balance is now this ${this.balance}")
        }
        else{
            println("cannot deposit negative amount")
        }
    }
    
    fun withdraw(withdrawal:Int){
        if(-withdrawal<0){
            transactions.add(-withdrawal)
            this.balance+= -withdrawal
            println("$withdrawal deposited.Balance is now ${this.balance}")
        }else{
            println("cannot withdraw negative amount")
        }
    }
}