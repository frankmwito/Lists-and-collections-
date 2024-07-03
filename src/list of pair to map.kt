
import java.util.Scanner

fun main()  {
    val reader = Scanner(System.`in`)
    println("Enter length of list:")
    val n = reader.nextInt()
    val list = mutableListOf<Pair<String, Int>>()
    for (i in 0 until n) {
        println("Enter pair values")
        val key = reader.next()
        val value = reader.nextInt()
        list.add(Pair(key, value))
    }
    val newList = list

    println(newList.toMap())


}