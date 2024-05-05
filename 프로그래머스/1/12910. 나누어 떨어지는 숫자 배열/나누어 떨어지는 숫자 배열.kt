class Solution {
    fun solution(arr: IntArray, divisor: Int): IntArray {
        val answer = arr.filter { it % divisor == 0 }.toIntArray().sortedArray()
        return if (answer.size == 0) {
                    intArrayOf(-1)
        } else answer
    }
}