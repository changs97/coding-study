class Solution {
    fun solution(n: Int): Int {
        val list = mutableListOf<Int>()
        
        for (i in 1..n) {
            if (n % i == 0) {
                list.add(i)
            }
        }
        
        var answer = list.sum()
        return answer
    }
}