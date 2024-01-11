import java.util.*

fun main() {
    val scan = Scanner(System.`in`)

    while (scan.hasNextLine()) {
        val str: String = scan.nextLine()
        if (str.isEmpty() || str.length > 1000) break
        println(str)
    }

    scan.close()
}