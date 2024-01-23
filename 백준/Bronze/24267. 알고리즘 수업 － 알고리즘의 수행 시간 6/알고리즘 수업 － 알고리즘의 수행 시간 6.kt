fun main() {
    val n = readln().toLong()

    var sum: Long = 0

    for (i in (n - 2) downTo 1) {
        sum += i * (i + 1) / 2
    }

    println(sum)

    println(3)
}