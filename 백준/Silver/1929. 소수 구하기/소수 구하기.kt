import kotlin.math.sqrt

fun main() {
    val bw = System.out.bufferedWriter()
    
    val (m, n) = readln().split(" ").map { it.toInt() }
    
    for (i in m..n) {
        if (isPrime(i.toLong())) bw.write("$i\n")
    }
    
    bw.flush()
    bw.close()
    
}

private fun isPrime(num: Long): Boolean {
    if (num <= 1L) return false

    return (2L..sqrt(num.toDouble()).toLong()).none { num % it == 0L }
}
