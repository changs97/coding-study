import java.util.*

fun main() {
    val s = Scanner(System.`in`)

    var h = s.nextInt()
    var m = s.nextInt()
    val t = s.nextInt()

    val a = t / 60
    val b = t % 60

    h += a
    m += b

    if (m >= 60) {
        m %= 60
        h++
    }

    h %= 24

    println("$h $m")
}