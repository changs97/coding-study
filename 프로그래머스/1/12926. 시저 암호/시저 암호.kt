class Solution {
    fun solution(s: String, n: Int): String {
        // 아스키코드에서 대문자이면 65 ~ 90까지 소문자이면 97 ~ 122까지

        val stringBuffer = StringBuilder()

        s.forEachIndexed { index, c ->
            if (c == ' ') {
                stringBuffer.append(' ')
            } else {
                if (c.isUpperCase()) {
                    if (c.code + n <= 90) {
                        stringBuffer.append((c.code + n).toChar())
                    } else {
                        stringBuffer.append((c.code + n - 26).toChar())
                    }
                } else {
                    if (c.code + n <= 122) {
                        stringBuffer.append((c.code + n).toChar())
                    } else {
                        stringBuffer.append((c.code + n - 26).toChar())
                    }
                }
            }
        }

        return stringBuffer.toString()
    }
}