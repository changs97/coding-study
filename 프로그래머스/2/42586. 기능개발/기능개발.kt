import java.util.*

class Solution {
    fun solution(progresses: IntArray, speeds: IntArray): IntArray {
        val answer = arrayListOf<Int>()
        val queue = LinkedList<Int>()

        // 각 기능이 배포될 때까지 걸리는 일수를 큐에 추가
        for (i in progresses.indices) {
            val remaining = 100 - progresses[i]
            val speed = speeds[i]

            queue.add(remaining / speed + if (remaining % speed == 0) 0 else 1)
        }

        // 배포할 수 있는 기능을 한꺼번에 큐에서 제거하고 개수를 정답 배열에 추가
        while (queue.isNotEmpty()) {
            var count = 0
            val first = queue.peek()

            for (day in queue) {
                if (first < day) break
                else count++
            }

            repeat(count) { queue.remove() }
            answer.add(count)
        }

        return answer.toIntArray()
    }
}