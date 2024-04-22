class Solution {
    fun solution(n: Long): Long {
        var answer: Long = 0
        
        val nums = mutableListOf<Int>()
        
        for (i in n.toString()) {
            nums.add(i.toString().toInt())
        }
        
        nums.sort()
        answer = nums.reversed().joinToString("").toLong()
        
        
        return answer
    }
}