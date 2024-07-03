import java.util.Scanner

fun main()  {
    val reader = Scanner(System.`in`)
    println("Enter the length of first list:")
    val n2 = reader.nextInt()
    val list2 = mutableListOf<Int>()
    for (i in 0 until n2){
        println("Enter values of first list:")
        list2.add(reader.nextInt())
    }

    println("Enter the length of second list:")
    val n1 = reader.nextInt()
    val list1 = mutableListOf<Int>()
    for (i in 0 until n1){
        println("Enter values of second list:")
        list1.add(reader.nextInt())
    }
    println(list1.intersect(list2.toSet()).toList())

}
