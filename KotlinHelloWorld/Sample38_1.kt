class Car(name:String,model:String,color:String,doors:Int){
    var name=name
    var model=model
    var color=color
    var doors=doors
    fun move(){
        println("Car $name is moving")
    }
    
    fun stop(){
        println("Car $name is stopped")
    }
    
}

fun main(){
    var car=Car("abc","def","ghi",4)
    car.move()
    car.stop()
}