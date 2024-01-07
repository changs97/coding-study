fun main() {
    val (n, m) = readln().split(" ").map { it.toInt() }
    val basketList = IntArray(n)

    for (i in 1..m) {
        val (start, end, k) = readln().split(" ").map { it.toInt() }
        for (j in start-1 until end) {
            basketList[j] = k
        }
    }

    val result = basketList.joinToString(separator = " ")
    println(result)
}