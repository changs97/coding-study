class Solution {
    fun solution(numbers: IntArray): Int {
        val nums = IntArray(10) { it } // 0~9
        var answer = 0
        
        for (i in nums) {
            if (!numbers.contains(i)) {
                answer += i
            }
        }
        
        return answer
    }
}