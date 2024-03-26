import kotlin.math.sqrt

fun main() {
    while (true) {
        val n = readln().toInt()
        if (n == 0) return

        var count = 0
        for (i in n + 1..2 * n) {
            if (isPrime(i.toLong())) count++
        }

        println(count)
    }

}

private fun isPrime(num: Long): Boolean {
    if (num <= 1L) return false

    return (2L..sqrt(num.toDouble()).toLong()).none { num % it == 0L }
}
