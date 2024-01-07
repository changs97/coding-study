fun main() {
    val (n, m) = readln().split(" ").map { it.toInt() }
    val basketList = IntArray(n) { it + 1 }
    var temp = 0

    for (i in 1..m) {
        val (num1, num2) = readln().split(" ").map { it.toInt() - 1 }
        temp = basketList[num1]
        basketList[num1] = basketList[num2]
        basketList[num2] = temp
    }

    val result = basketList.joinToString(separator = " ")
    println(result)
}