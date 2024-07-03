import java.util.Scanner

fun main() {
    println("Enter numbers of your choice:")
    val reader = Scanner(System.`in`)
    val n  = reader.nextInt()

    val list = mutableListOf<Int>()

    for (i in 0..<n){
        list.add(reader.nextInt())
    }
    val newlist = list.filter { it % 2 == 0 }

    if (newlist.isEmpty()) {
        println("There are no even numbers")
    }
    else {
        println("Even numbers are $newlist")
    }
}