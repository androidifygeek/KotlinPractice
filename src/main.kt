import kotlin.math.PI
import kotlin.math.abs
import kotlin.math.round

fun main(args: Array<String>){

    val num1 = 15
    val num2 = 10


    val sum = num1.plus(num2)
    println("The diff is $sum")


    val difference = num1.minus(num2)
    println("The difference is $difference")

    val product = num1.times(num2)
    println("Product = $product")


    val quotient: Double = num1.toDouble().div(num2)
    println("Quotient = $quotient")


    val remainder = num1.rem(num2)
    println("Remainder = $remainder")

    val neg = -234.5
    val absolute = abs(neg)
    println("Absolute = $absolute")
    println("Rounded = ${round(absolute)}")


    println("Have a piece of $PI")

}