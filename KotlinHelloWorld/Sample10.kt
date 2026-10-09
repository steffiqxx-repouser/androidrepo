fun main(){
    val source=mutableListOf("A","B","C")
    println(source)
    val abc=mutableListOf(1,4,2)
    val abc1=abc.sorted()
    println(abc1)
    val products=mutableMapOf("Phone" to "Samsung galaxy s24 ultra")
    for((name,model) in products){
        println("$name: $model")
    }
    println(products["Phone"])
     }