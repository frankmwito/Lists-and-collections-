import java.util.Scanner

fun main()  {
    println("Enter length of list:")
    val reader = Scanner(System.`in`)

    val n = reader.nextInt()
    val list = mutableListOf<Int>()

    for (i in 0 until n){
        println("Enter values of the list")
        list.add(reader.nextInt())
    }
    val newList = list
    println(newList.map { it * it })
}