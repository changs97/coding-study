import java.util.Scanner

fun main() {
    val totalPrice = readln().toInt()
    val n = readln().toInt()

    val s = Scanner(System.`in`)
    var sum = 0

    for (i in 1..n) {
        val price = s.nextInt()
        val count = s.nextInt()

        sum += price * count
    }

    val result = if (sum == totalPrice) "Yes" else "No"
    println(result)
}