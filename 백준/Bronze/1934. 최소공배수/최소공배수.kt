import java.util.*

fun main() {
    val t = readln().toInt()

    repeat(t) {
        val (a, b) = readln().split(" ").map { it.toInt() }

        val aPrimeFactors = factorization(a)
        val bPrimeFactors = factorization(b)

        val union = hashMapOf<Int, Int>()

        (aPrimeFactors + bPrimeFactors).run {
            forEach { (k, v) ->
                val aValue = aPrimeFactors.getOrDefault(k, 0)
                val bValue = bPrimeFactors.getOrDefault(k, 0)

                if (aValue < bValue) {
                    union[k] = bValue
                } else {
                    union[k] = aValue
                }
            }
        }
        
        var sum = 1

        union.forEach { (k, v) ->
            repeat(v) {
                sum *= k
            }
        }

        println(sum)
    }
}

private fun factorization(n: Int): Map<Int, Int> {
    var temp: Int = n
    var cnt = 2
    val primeFactors = sortedMapOf(1 to 1)

    while (temp > 1) {
        if (temp % cnt == 0) {
            primeFactors[cnt] = primeFactors.getOrDefault(cnt, 0) + 1
            temp /= cnt
        } else {
            cnt++
        }
    }
  
    return primeFactors
}


