fun main(){
    var result=try{
        "42".toInt()
        println("42 string converted to 42 number")
    }catch(e:NumberFormatException){
        println("not converted to number")
    }
    var result1=runCatching{parseInt("38")}
   // result1.onSuccess{println("Parsed:$it")}
result1.onSuccess{println("Parsed:$it")}
}
fun parseInt(s:String):Int{
    require(s.isNotBlank()){
        "Input must not be blank"
    }
    return s.trim().toInt()
}
