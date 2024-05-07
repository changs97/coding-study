// 45을 3으로 나눈 값의 몫, 나머지 -> 15, 0
// 15를 3으로 나눈 값의 몫, 나머지 -> 5, 0
// 5를 3으로 나눈 값의 몫, 나머지 -> 1, 2
// 1을 3으로 나눈 값의 몫, 나머지 -> 0, 1

// n이 3보다 같거나 작으면?
// n = 3일 때
// 3을 3으로 나눈 값의 몫, 나머지 -> 1, 0 -> 10

// n = 2일 때
// 2를 3으로 나눈 값의 몫, 나머지 0, 2

// 몫이 0이 될때까지 계산

class Solution {
    fun solution(n: Int): Int {
        var answer: Int = 0
        var temp = n
        val list = mutableListOf<Int>()
        
        while (true) {
            list.add(temp % 3)
            temp /= 3

            if (temp == 0) break
        }

        val num = list.reversed()

        var sum = 0

        for ((count, i) in num.withIndex()) {
            var k = 1
            repeat(count) {
                k *= 3
            }

            sum += k * i

        }

        answer = sum

        return answer
    }
}
