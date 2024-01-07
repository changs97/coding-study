fun main() {
    readln().toInt()
    val numbers = readln().split(" ").map { it.toInt() }
    val v = readln().toInt()
    println(numbers.count { it == v } )
}