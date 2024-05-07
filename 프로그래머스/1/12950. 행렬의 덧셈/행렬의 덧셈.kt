class Solution {
    fun solution(arr1: Array<IntArray>, arr2: Array<IntArray>): Array<IntArray> {
        var answer = arrayOf<IntArray>()
        val arr =  mutableListOf<IntArray>()
        
        for (i in arr1.indices) {
            val temp = mutableListOf<Int>()
            
            for (j in arr1[0].indices) {
                temp.add(arr1[i][j] + arr2[i][j])
            }
            arr.add(temp.toIntArray())
        }
        
        answer = arr.toTypedArray()
        
        return answer
    }
}