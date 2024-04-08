import java.util.*

fun main() {
    val br = System.`in`.bufferedReader()
    val n = br.readLine().toInt()

    repeat(n) {
        val stack = Stack<Char>()
        val input = br.readLine()

        input.forEach {
            if (it == '(') {
                stack.push(it)
            } else {
                if (!stack.empty() && stack.peek() == '(') {
                    stack.pop()
                } else {
                    stack.push(it)
                }
            }
        }
        if (stack.size > 0) println("NO")
        else println("YES")
    }
}

