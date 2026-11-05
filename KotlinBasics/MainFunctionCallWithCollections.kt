fun main(){
    var account:Array<Account> =arrayOf(Account("abc"))
    println(account.contentToString())
    
}

data class Account(var name:String)