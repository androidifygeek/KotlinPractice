fun main(args: Array<String>) {

    val nullValue: String? = null
    println(nullValue)

    val l: Int? = nullValue?.length
    println(l)

    if (l == null) {
        println("Length is null")
    }

    val msg = if (l != null) {
        "Length: $l"
    } else {
        "l is null"
    }
    println(msg)


    val l2 = l ?: -1
    println("The value of l2 is $l2")


    try {
        val l3 = l!!
        println("The value of l3 $l3 ")

    } catch (e: KotlinNullPointerException) {
        println("l3 is null")
    }
}