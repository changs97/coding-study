fun main() {
    val (x, y, w, h) = readln().split(" ").map { it.toInt() }
    val diffList = listOf(y, h - y, x, w - x)

    println(diffList.min())
}