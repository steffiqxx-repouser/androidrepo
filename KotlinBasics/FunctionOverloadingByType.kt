fun describe(v:Int)="Int: $v"
fun describe(v:String)="Text: $v"
fun describe(v:Double)="Dec: $v"

fun main(){
    println(describe(42))
    println(describe("Alex"))
    println(describe(3.14))
}