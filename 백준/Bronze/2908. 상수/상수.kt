fun main() {
    val nums = readln().split(" ").map { it.reversed() }.map { it.toInt() }
    println(nums.max())
}