class Solution {
    fun solution(x: Int): Boolean {
        val nums = x.toString().map { it.toString().toInt() }
    
        
        val sum = nums.sum()
    
         val answer = if(x % sum == 0) true else false
        return answer
    }
}