fun main(args: Array<String>){

    var num1 = 15
    val num2 = 10


    val sum = num1 + num2
    println("The sum is $sum")

    val sum1 = num1.plus(num2)
    println("The Sum is $sum1")

    val diff = num1 - num2
    println("The difference is $diff")

    num1++
    println("num1 = $num1")


    /*Kotlin Increment*/
    val num3 = num1.inc()
    println("The value of num1 is ${num1++}")
    println("num3 = $num3")

    val num4 = num1.inc()
    println("The value of n1 is ${++num1}")
    println("num4 = $num4")
}