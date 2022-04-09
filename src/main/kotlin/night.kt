fun main(args: Array<String>){
//    println("Good ${
//        when{
//            args[0].toInt() < 12 -> "morning"
//            else -> "night"
//        }
//    }, Kotlin")
    println("Good ${ if(args[0].toInt() < 12){"morning"}else{"night"} }, Kotlin")
}