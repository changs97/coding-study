fun main() {
    val (_, x) = readln().split(" ").map { it.toInt() }
    val numbers = readln().split(" ").map { it.toInt() }
    
    for (i in numbers) {
        if (i < x) print("$i ")
    }
}