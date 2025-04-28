class Solution {
    fun solution(num1: Int, num2: Int): Int {
        var answer: Int = num1.equal(num2)
        return answer
    }
    
    fun Int.equal(other: Int): Int {
    return if (this == other) 1 else -1
}
}