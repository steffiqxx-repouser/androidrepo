interface Listener{
    fun listen()
}
class FootballPlayer(name:String):Player(name),Listener{
    override fun listen(){
        
    }
}

class BaseballPlayer(name:String):Player(name)
open class GamesPlayer(name:String):Player(name)
class CounterStrikePlayer(name:String):GamesPlayer(name)

fun main(){
    val footballTeam=Team<BaseballPlayer>{
        "FootballTeam",mutableListOf<BaseballPlayer>(BaseballPlayer("Player 1"),BaseballPlayer("Player 2"))
    }
    
    val gamesTeam=Team<BaseballPlayer>{
        "GamesPlayer",mutableListOf<BaseballPlayer>(BaseballPlayer("Player 1"),BaseballPlayer("Player 2"))
    }
    addPlayer(FootballPlayer("Player1"))
}

fun <T> addPlayer(player:T) where T:PLayer,T:Listener{
    
}
/*
 * 
 * 
 * 
 * > kotlinc Sample38.kt -include-runtime -d sample38.jar
Sample38.kt:4:35: error: unresolved reference 'Player'.
class FootballPlayer(name:String):Player(name),Listener{
                                  ^^^^^^
Sample38.kt:10:35: error: unresolved reference 'Player'.
class BaseballPlayer(name:String):Player(name)
                                  ^^^^^^
Sample38.kt:11:37: error: unresolved reference 'Player'.
open class GamesPlayer(name:String):Player(name)
                                    ^^^^^^
Sample38.kt:15:22: error: unresolved reference 'Team'.
    val footballTeam=Team<Player>{
                     ^^^^
Sample38.kt:15:27: error: unresolved reference 'Player'.
    val footballTeam=Team<Player>{
                          ^^^^^^
Sample38.kt:16:23: error: syntax error: Unexpected tokens (use ';' to separate expressions on the same line).
        "FootballTeam",mutableListOf<FootballPlayer>(FootballPlayer("Player 1"),FootballPlayer("Player 2"))
                      ^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^
Sample38.kt:19:19: error: unresolved reference 'Team'.
    val gamesTeam=Team<Player>{
                  ^^^^
Sample38.kt:19:24: error: unresolved reference 'Player'.
    val gamesTeam=Team<Player>{
                       ^^^^^^
Sample38.kt:20:22: error: syntax error: Unexpected tokens (use ';' to separate expressions on the same line).
        "GamesPlayer",mutableListOf<GamesPlayer>(GamesPlayer("Player 1"),GamesPlayer("Player 2"))
                     ^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^
Sample38.kt:22:5: error: cannot infer type for type parameter 'T'. Specify it explicitly.
    addPlayer(FootballPlayer("Player1"))
    ^^^^^^^^^
Sample38.kt:22:5: error: inapplicable candidate(s): fun <T : ??? (Unresolved qualified name: PLayer), Listener> addPlayer(player: T): Unit
    addPlayer(FootballPlayer("Player1"))
    ^^^^^^^^^
Sample38.kt:25:37: error: unresolved reference 'PLayer'.
fun <T> addPlayer(player:T) where T:PLayer,T:Listener{
                                    ^^^^^^
PS C:\Users\STEFFI\Downloads\KotlinHelloWorld> 
 */