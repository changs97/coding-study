class Solution {
    fun solution(s: String): Boolean {
        var answer = true

        try {
            s.toInt()
        } catch (
            e: NumberFormatException
        ) {
            return false
        }

        answer = s.length == 4 || s.length == 6

        return answer
    }
}