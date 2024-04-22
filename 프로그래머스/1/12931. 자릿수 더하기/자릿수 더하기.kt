class Solution {
    fun solution(n: Int): Int {
        val str = n.toString()
        val nums = mutableListOf<Int>()
        
        for (i in str) {
            nums.add(i.toString().toInt())
        }
        
        println(nums)
        
        var answer = nums.sum()


        return answer
    }
}