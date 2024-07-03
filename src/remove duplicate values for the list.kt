import java.util.Scanner

fun main()  {
    println("Enter length of list:")
    val reader = Scanner(System.`in`)
    val n = reader.nextInt()

    var list = mutableListOf<Int>()
    for (i in 0 until n){
        println("Enter value of list:")
        list.add(reader.nextInt())
    }
    val newList = list
    println(newList.distinct())

}