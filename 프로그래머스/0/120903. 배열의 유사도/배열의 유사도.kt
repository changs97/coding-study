class Solution {
    fun solution(s1: Array<String>, s2: Array<String>): Int {
        val set1 = s1.toSet()
        val set2 = s2.toSet()

        var answer: Int = set1.intersect(set2).size
        return answer
    }
}