class Order(val id:Int){
    val label="Order-$id"
    init{println("init: $label")}
}
fun main(){
    var order=Order(38)
}