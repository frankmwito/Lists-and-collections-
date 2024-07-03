import java.util.Scanner

fun main()  {
    println("Enter any number of your choice")
    val reader = Scanner(System.`in`)
    val n = reader.nextInt()

    val list = mutableListOf<Int>()

    for (i in 0 until n)
    {
        println("Enter values of List:")
        list.add(reader.nextInt())
    }
    val newList = list
    val sum = newList.sum()

    println("Sum of list values is $sum")
}