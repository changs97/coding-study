fun main() {
    val list: MutableList<MutableList<Int>> = MutableList(100) { MutableList(100) { 0 } }

    val n = readln().toInt()
    repeat(n) {
        val (x, y) = readln().split(" ").map { it.toInt() }

        for (i in x until (x + 10)) {
            for (j in (100 - y) downTo  (90 - y + 1 )) {
                list[j][i] = 1
            }
        }
    }

    val sum = list.sumOf { it.sumOf { num -> num } }
    println(sum)
}