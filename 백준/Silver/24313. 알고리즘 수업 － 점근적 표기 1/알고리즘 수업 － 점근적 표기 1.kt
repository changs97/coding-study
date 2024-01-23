fun main() {
    val (a1, a0) = readln().split(" ").map { it.toInt() }
    val c = readln().toInt()
    val n0 = readln().toInt()

    val fn = a1*n0+a0
    val gn = n0

    if (fn <= c*gn && a1 <= c) println(1) else println(0)
}