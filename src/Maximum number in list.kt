import java.util.Scanner


fun main() {
    val reader = Scanner(System.`in`)
    println("Enter number of choice")
    val n = reader.nextInt()
    val list = mutableListOf<Int>()
    for (i in 0 until n){
        list.add(reader.nextInt())
    }

    val newList = list
    println(newList.max())

}