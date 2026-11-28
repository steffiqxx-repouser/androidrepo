fun main(){
    val isDay=true
    val isNight=false
    
    val isDaytime=isDay && !isNight
    val isNighttime=!isDay && isNight
    println("Is daytime? $isDaytime")
    println("Is nighttime? $isNighttime")
    val isDayOrNight=isDay || isNight   
    println("Is it day or night? $isDayOrNight")
    
}