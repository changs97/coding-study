class Solution {
    fun solution(price: Int, money: Int, count: Int): Long {
        var answer: Long = 0
        var m_money = money.toLong()


        for (i in 1..count) {
            m_money -= price * i
        }


        answer = if (m_money >= 0) {
            0
        } else {
            -(m_money)
        }

        return answer
    }
}