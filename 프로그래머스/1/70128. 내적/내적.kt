class Solution {
    fun solution(a: IntArray, b: IntArray): Int {
        var answer: Int = 0
        
        val n = a.size
        for (i in 0 until n) {
            answer += (a[i] * b[i])
        }
        
        return answer
    }
}