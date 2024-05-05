class Solution {
    fun solution(n: Int): String {
        val list = mutableListOf<String>()
        var temp = "박"
        for (i in 1..n) {
            temp = if (temp == "수") {
                "박"
            } else {
                "수"
            }
            
            list.add(temp)
        }

        return list.joinToString(separator = "")
    }
}