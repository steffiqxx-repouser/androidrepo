fun main(args:Array<String>){
    
    val cats=3
    val longCats=cats.toLong()
    println(longCats::class.java)
    println(cats::class.java)
    println(longCats)
    
    val people=4_590_000L
    val fewPeople=people.toInt()
    println(fewPeople::class.java)
    println(people::class.java)
    println(fewPeople)
     }