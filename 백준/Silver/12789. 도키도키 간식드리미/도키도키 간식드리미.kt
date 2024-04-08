import java.util.*

fun main() {
    val br = System.`in`.bufferedReader()
    br.readLine().toInt() // 학생 수, 이 경우 사용하지 않음
    val input = br.readLine().split(" ").map { it.toInt() }

    var n = 1 // 다음으로 간식을 받아야 하는 학생 번호
    val stack = Stack<Int>()

    input.forEach { it ->
        while (stack.isNotEmpty() && stack.peek() == n) {
            stack.pop() // 스택의 가장 위에 있는 학생 번호가 현재 순서와 일치하면 간식을 받고 스택에서 제거
            n++ // 다음 순서로 넘어감
        }

        if (it == n) {
            n++ // 현재 학생이 바로 간식을 받을 수 있는 경우
        } else {
            stack.push(it) // 현재 순서가 아니면 스택에 임시 대기
        }
    }

    while (stack.isNotEmpty() && stack.peek() == n) {
        stack.pop() // 마지막 검사, 스택에 남아 있는 학생이 순서대로 간식을 받을 수 있는지 확인
        n++
    }

    if (stack.isEmpty()) println("Nice") // 모든 학생이 순서대로 간식을 받을 수 있으면 Nice
    else println("Sad") // 그렇지 않으면 Sad
}
