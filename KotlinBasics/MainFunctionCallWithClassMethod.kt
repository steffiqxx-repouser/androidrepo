fun main(){
    var cal = Calculator(55,75)
    println(cal.add())
    
}

class Calculator(var a:Int,var b:Int){
    
    fun add(var sum:Int){
         sum=a+b //val cannot be reassigned we have finally encountered
         //will check from here,dont worry bubbu
        // return sum
    }
}
/**
 * PS C:\Users\STEFFI\Downloads\KotlinBasics> kotlinc MainfunctionCallWithClassMethod.kt -include-runtime -d MainfunctionCallWithClassMethod.jar
PS C:\Users\STEFFI\Downloads\KotlinBasics> java -jar MainfunctionCallWithClassMethod.jar                              
kotlin.Unit            
PS C:\Users\STEFFI\Downloads\KotlinBasics> kotlinc MainfunctionCallWithClassMethod.kt -include-runtime -d MainfunctionCallWithClassMethod.jar
MainfunctionCallWithClassMethod.kt:3:17: error: no value passed for parameter 'sum'.
    println(cal.add())
                ^^^
MainfunctionCallWithClassMethod.kt:9:13: error: 'var' on function parameter is prohibited.
    fun add(var sum:Int){
            ^^^
MainfunctionCallWithClassMethod.kt:10:10: error: 'val' cannot be reassigned.
         sum=a+b
         ^^^
MainfunctionCallWithClassMethod.kt:11:17: error: return type mismatch: expected 'Unit', actual 'Int'.
         return sum
                ^^^
PS C:\Users\STEFFI\Downloads\KotlinBasics> kotlinc MainfunctionCallWithClassMethod.kt -include-runtime -d MainfunctionCallWithClassMethod.jar
MainfunctionCallWithClassMethod.kt:3:17: error: no value passed for parameter 'sum'.
    println(cal.add())
                ^^^
MainfunctionCallWithClassMethod.kt:9:13: error: 'var' on function parameter is prohibited.
    fun add(var sum:Int){
            ^^^
MainfunctionCallWithClassMethod.kt:10:10: error: 'val' cannot be reassigned.
         sum=a+b
         ^^^
 */