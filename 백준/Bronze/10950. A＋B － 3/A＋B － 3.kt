import java.lang.Exception
import java.util.Scanner

fun main() {
    val n = readln().toInt()
    try {
        Scanner(System.`in`).use { s ->
            for (i in 1..n) {
                println(s.nextInt() + s.nextInt())
            }
        }
    } catch (e: Exception) {
        println(e.message)
    }
}