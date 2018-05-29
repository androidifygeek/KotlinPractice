fun main(args: Array<String>){

    val myInt = 40
    val myLong: Long = myInt.toLong()

    println("the type of myLong is ${myLong::class.simpleName}")

    /*To get the Package Name */
    println("the type of myLong is ${myLong::class.qualifiedName}")


    val myLong2 = 40.9
    val myInt2 = myLong2.toInt() /*downcasting*/

    println("The value of myLong2 is $myLong2")

    println("The value of myInt2 is $myInt2")


    val myInt3 = 420

    /*coverting to Floting type value*/
    val myDouble3 = myInt3.toDouble()

    println("The value of myInt3 is $myInt3")
    println("The value of myDouble3 is $myDouble3")
}