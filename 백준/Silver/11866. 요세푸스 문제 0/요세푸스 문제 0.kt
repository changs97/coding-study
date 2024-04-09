import java.util.*

fun main() {
    val (n, k) = readln().split(" ").map { it.toInt() }
    val queue: Queue<Int> = LinkedList()

    for (i in 1..n) {
        queue.offer(i)
    }

    val result = mutableListOf<Int>()

    while (queue.isNotEmpty()) {
        for (i in 1 until k) {
            queue.offer(queue.poll())
        }
        result.add(queue.poll())
    }

    println("<${result.joinToString(", ")}>")
}