class Team<T:Player>(val name:String,private val players:Mutable<out T>){
    fun addPlayers(player:T){
        if(players.contains(player)){
            println("Player: ${player.name} is already in the team")
        } else{
            players.add(player)
            println("Player:${player.name} was added to the team")
        }
    }
}

open class Player(val name:String)
class FootballPlayer(name:String): Player(name)
class BaseballPlayer(name:String): Player(name)
open class GamesPlayer(name:String): Player(name)
class CounterStrikePlayer(name: String): GamesPlayer(name)

fun main(){
    val footBallTeam=Team<Player>("Football Team",mutableListOf<FootballPlayer>(FootballPlayer("Player 1"),FootballPlayer("Player 2")))
val gamesTeam=Team<CounterStrikePlayer>("Games Team",mutableListOf<GamesPlayer>(GamesPlayer("Player 1"),GamesPlayer("Player 2")))
    }
    /**
     * 
     * PS C:\Users\STEFFI\Downloads\KotlinHelloWorld> kotlinc Sample28.kt -include-runtime -d sample28.jar
Sample28.kt:1:58: error: unresolved reference 'Mutable'.
class Team<T:Player>(val name:String,private val players:Mutable<out T>){
                                                         ^^^^^^^
Sample28.kt:6:21: error: unresolved reference 'add'.
            players.add(player)
                    ^^^
     */