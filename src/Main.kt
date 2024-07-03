import java.util.Scanner


fun main()  {

    val reader = Scanner(System.`in`)
    val n = reader.nextInt()

    val list = mutableListOf<Int>()
    println("Enter numbers of your choice:")

    for (i in 0..<n){
        list.add(reader.nextInt())
    }

    val reverse = list.reversed()
    println(reverse)

}