class Solution {
    fun solution(t: String, p: String): Int {
        var answer: Int = 0

        val size = p.length
        val list = mutableListOf<String>()

        for (i in 0..t.length-size) {
            list.add(t.substring(i, i+size))
        }

        answer = list.count { it <= p }

        return answer
    }
}