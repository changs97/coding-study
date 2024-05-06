class Solution {
    fun solution(s: String): String {
        return s.toMutableList().sorted().reversed().joinToString(separator = "")
    }
}