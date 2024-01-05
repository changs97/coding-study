import java.util.*

fun main() {
    val s = Scanner(System.`in`)

    val a = s.nextInt()
    val b = s.nextInt()

    if (a < b) {
        println("<")
    } else if (a > b) {
        println(">")
    } else {
        println("==")
    }
}