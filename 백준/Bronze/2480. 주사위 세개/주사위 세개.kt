import java.util.*

fun main() {
    val s = Scanner(System.`in`)

    val a = s.nextInt()
    val b = s.nextInt()
    val c = s.nextInt()

    val list = listOf(a, b, c)
    var count = 0
    var n = 0

    for (i in 1..6) {
        count = list.count { it == i }
        if (count > 1) {
            n = i
            break
        }
    }

    when (count) {
        2 -> calculatedPrizeMoney(1000, n, 100)
        3 -> calculatedPrizeMoney(10000, n, 1000)
        else -> calculatedPrizeMoney(0, list.max(), 100)
    }


}

fun calculatedPrizeMoney(n1: Int, n2: Int, n3: Int) {
    print(n1 + n2 * n3)
}