class Solution {
    fun solution(num: Int): Int {
        var count = 0
        var answer = num.toLong()
        
        if (answer == 0L) {
            return 0
        }

        while (answer != 1L) {
           count++
            
           if (count == 500) {
               return -1
           }
            
            if (answer % 2L == 0L) {
                answer /= 2L
            } else {
                answer = answer * 3L + 1L
            }
        
        }
        
        return count
    }
}