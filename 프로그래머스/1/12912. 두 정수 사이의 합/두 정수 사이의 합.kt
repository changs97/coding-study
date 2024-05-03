class Solution {
    fun solution(a: Int, b: Int): Long {
        var answer: Long = 0L
        if (a < b) {
            var sum = 0L
            answer = a.toLong()
            repeat(b-a+1) {
                sum += answer++
            }
            
            answer = sum
        } else if (b < a) {
            var sum = 0L
            answer = b.toLong()
            
            repeat(a-b+1) {
                sum += answer++
            }
            answer = sum
        } else {
            answer = b.toLong()
        }
        
        return answer
    }
}