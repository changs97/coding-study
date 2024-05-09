class Solution {
    fun solution(s: String): String {
        var answer = ""
        val list = s.split(" ").toMutableList()
        val result = mutableListOf<String>()

        list.forEach {
            val temp = mutableListOf<Char>()

            it.forEachIndexed { index, s ->
                if (index % 2 == 0) {
                    temp.add(s.uppercase()[0])
                } else {
                    temp.add(s.lowercase()[0])
                }
            }

            result.add(temp.joinToString(separator = ""))
        }

        answer = result.joinToString(separator = " ")

        return answer
    }
}