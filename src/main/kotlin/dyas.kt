import java.util.*

fun day(){
    println("What's the day?")
}

fun enterDay():String{
    var someText:String = readLine()!!
    return someText
}

fun printCurentDay(){
    var calendar =  Calendar.getInstance()
    var dayOfWeak = calendar.get(Calendar.DAY_OF_WEEK)
    println("current day: ${calendar.get(Calendar.DAY_OF_WEEK)}")
}
//as;dada

fun main(args: Array<String>){
    day()
    var dayVar = enterDay()
    println("You enter day: $dayVar")
    printCurentDay()
}