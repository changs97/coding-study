
class Solution {
    fun solution(n: Int, m: Int): IntArray {
        var answer = intArrayOf()
        val nMeasure = sortedSetOf<Int>()
        val mMeasure = sortedSetOf<Int>()

        for (i in 1..n) {
            if (n % i == 0) {
                nMeasure.add(i)
            }
        }

        for (i in 1..m) {
            if (m % i == 0) {
                mMeasure.add(i)
            }
        }

        val intersection = nMeasure.intersect(mMeasure).toSortedSet()


        val greatestCommonDivisor = intersection.last()

        val leastCommonMultiple = n * m / greatestCommonDivisor

        answer = intArrayOf(greatestCommonDivisor, leastCommonMultiple)
        return answer
    }
}