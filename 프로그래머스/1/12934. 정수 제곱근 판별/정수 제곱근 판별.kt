import kotlin.math.sqrt

class Solution {
    fun solution(n: Long): Long {
        val sqrt = sqrt(n.toDouble())
        var answer: Long = 0
        
        if (sqrt == sqrt.toInt().toDouble()) {
            answer = ((sqrt+1) * (sqrt+1)).toLong()
        } else {
            answer = -1
        }
        
        
        
        return answer
    }
}