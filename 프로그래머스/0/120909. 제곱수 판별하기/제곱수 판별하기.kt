class Solution {
    /// 4 = 2 * 2
    /// 9 = 3 * 3
    /// 16 = 4 * 4
    fun solution(n: Int): Int {
         var answer: Int = 2
        for (i in 1..n) {
            if (i * i == n) {
                answer = 1
                break
            }
        }
  
        return answer
    }
}