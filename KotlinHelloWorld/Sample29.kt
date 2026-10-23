class Team<T:Player>(val name:String,val players:MutableList<out T>){
    fun addPlayers(player: T){
        //42 is like fine,fine,lets go ,said the same a hell lot of time before too :P
        if(players.contains(player)){
            println("Player: ${player.name} is already in the team")
        }
        else{
            println("Player: ${player.name} was added to the team")
        }
    }
}
inline fun <reified T> getSpecificTypes(list: List<Any>): List<T> {
    return list.filterIsInstance<T>()
}

open class Player(val name:String)

class FootballPlayer(name:String):Player(name)
class BaseballPlayer(name:String):Player(name)
open class GamesPlayer(name:String):Player(name)
class CounterStrikePlayer(name:String):GamesPlayer(name)

fun main(){
    val mixedList=mutableListOf<Any>(1,42,37,38,"a","b","c","hello","world")
    
    val specificList=getSpecificTypes<Int>(mixedList)
    for(element:Int in specificList){
        println(element)
    }
}