class Solution {
    fun solution(strlist: Array<String>): IntArray {
        var answer: IntArray = IntArray(strlist.size) {
            strlist[it].length
        }
        return answer
    }
}