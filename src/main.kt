import javafx.beans.binding.When

fun main(args: Array<String>) {


    print("Enter a State Abbreviation: ")
    val state = readLine()

//    if (state == "CA") {
//        println("The Capital is Sacramento")
//    } else if (state == "OR") {
//        println("The Capital is Salem")
//
//    }

//    val capital: String?
//    when(state){
//        "CA" -> capital = "Sacramento"
//        "OR" -> capital = "Salem"
//        else -> capital="unknown"
//    }


    val capital = when (state) {
        "CA" -> "Sacramento"
        "OR" -> "Salem"
        else -> "unknown"
    }
    println("The capital is $capital")


    when (state) {
        "CA", "OR", "WA" -> println("WEST COAST")
        "NH", "VT", "MA" -> println("NEW ENGLAND")
        else -> println("Somewhere Else")
    }

    val theAnswer = 46
    when (theAnswer) {
        in 1..39 -> println("Not Yet")
        in 40..45 -> println("close enough")
        else -> {
            println("Not Really!")
            println("Definitely Not")
        }

    }

}