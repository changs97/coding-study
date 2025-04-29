
// a개 미만일 때가 루프 해제 조건

class Solution {
    fun solution(a: Int, b: Int, n: Int): Int {
        var answer: Int = 0
        var i = n
        
        while (i >= a) {
            i -= a
            answer += b
            i += b
        }
        
        return answer
    }
}