
val br = System.`in`.bufferedReader()
val bw = System.out.bufferedWriter()

fun main() {
    val n = br.readLine().toInt()

    val deque = ArrayDeque<Int>()

    repeat(n) {
        val command = br.readLine().split(" ").map { it.toInt() }

        when (command[0]) {
            1 -> {
                deque.addFirst(command[1])
            }

            2 -> {
                deque.addLast(command[1])
            }

            3 -> {
                if (deque.isEmpty()) bufferedPrintln(-1)
                else bufferedPrintln(deque.removeFirst())
            }

            4 -> {
                if (deque.isEmpty()) bufferedPrintln(-1)
                else bufferedPrintln(deque.removeLast())
            }

            5 -> bufferedPrintln(deque.size)

            6 -> {
                if (deque.isEmpty()) bufferedPrintln(1)
                else bufferedPrintln(0)
            }

            7 -> {
                if (deque.isEmpty()) bufferedPrintln(-1)
                else bufferedPrintln(deque.first())
            }

            else -> {
                if (deque.isEmpty()) bufferedPrintln(-1)
                else bufferedPrintln(deque.last())
            }
        }
    }

    bw.flush()
    bw.close()
    br.close()
}

fun bufferedPrintln(int: Int) {
    bw.write(int.toString())
    bw.newLine()
}