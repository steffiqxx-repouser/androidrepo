class Team<T:Player>(val name:String,private val players:MutableList<T>){
    fun addPlayers(player: T){
        if(players.contains(player)){
            println("Player: ${player.name} is already in the team.")
        } else{
            players.add(player)
            println("Player:${player.name} was added to the team")
        }
    }
}
open class Player(val name:String)
class FootballPlayer(name:String):Player(name)
fun main(){
    val footballPlayer=FootballPlayer("football1")
    val footballPlayer2=FootballPlayer("football2")

    val footballTeam=Team<FootballPlayer>("footballteam",mutableListOf(footballPlayer))
    footballTeam.addPlayers(footballPlayer2)
    }