fun main(args:Array<String>){
    val alarm =8
    
val text=when{
    alarm<=10 ->"The number is in the range of 1..10"
    alarm==8 || alarm==7 -> "The time is $alarm"
    else ->"The time is $alarm"
    
}
    println(text)

}