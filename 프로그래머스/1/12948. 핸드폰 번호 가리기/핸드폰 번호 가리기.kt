class Solution {
    fun solution(phone_number: String): String {
        val list = phone_number.toMutableList()
        val lastIndex = phone_number.length - 4

        for (i in 0 until lastIndex) {
            list[i] = '*'
        }

        return list.joinToString(separator = "")

    }
}