fun main(args: Array<String>){

    val num1 = 15
    val num2 = 10

    val match = (num1 == num2)
    println("Match = $match")

    val match1 = num1.equals(num2)
    println("Match1 = $match1")

    println("Comparison Result = ${num1.compareTo(num2)}")
}