fun main() {
    val (n, m) = readln().split(" ").map { it.toInt() }
    val basketList = IntArray(n) { it + 1 }.toMutableList()

    for (i in 1..m) {
        val (start, end) = readln().split(" ").map { it.toInt() - 1 }
        val subList = basketList.subList(start, end+1)
        subList.reverse()

        var index = 0

        for (j in start..end) {
            basketList[j] = subList[index++]
        }
    }

    println(basketList.joinToString(separator = " "))
}