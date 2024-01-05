import java.util.Scanner

fun main() {
    val s = Scanner(System.`in`)

    var h = s.nextInt()
    var m = s.nextInt()

    m -= 45

    if (m < 0) {
        m += 60

        if (h > 0) {
            h -= 1
        } else {
            h = 23
        }
    }

    println("$h $m")
}