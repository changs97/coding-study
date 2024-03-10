import kotlin.math.sqrt

fun main() {
    val br = System.`in`.bufferedReader()
    repeat(br.readLine().toInt()) {
        var n = br.readLine().toLong()

        while (true) {
            if (isPrime(n)) {
                println(n)
                break
            } else n++
        }
    }
}

private fun isPrime(num: Long): Boolean {
    if (num <= 1L) return false

    return (2L..sqrt(num.toDouble()).toLong()).none { num % it == 0L }
}
