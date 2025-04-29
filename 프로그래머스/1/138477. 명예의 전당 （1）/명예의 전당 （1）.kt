
class Solution {
    fun solution(k: Int, score: IntArray): IntArray {
        val answer: MutableList<Int> = mutableListOf()
        val sortedScore: MutableList<Int>  = mutableListOf()

        for (i in score) {
            sortedScore.add(i)
            sortedScore.sort()
            if (sortedScore.size > k) {
                sortedScore.removeFirst()
            }

            answer.add(sortedScore.first())
        }

        return answer.toIntArray()
    }
}