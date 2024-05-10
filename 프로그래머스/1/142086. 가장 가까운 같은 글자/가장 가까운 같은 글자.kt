// 자신 보다 몇 칸 앞에 있습니다 -> 자신의 인덱스 - 앞에 있는 인덱스
// 처음 나왔음, 이미 나왔음 -> Map(알파벳 to 최신 인덱스)

class Solution {
    fun solution(s: String): IntArray {
        val answer = mutableListOf<Int>()
        val map = hashMapOf<Char, Int>()
        
        s.forEachIndexed { index, c -> 
            if (c in map) {
                answer.add(index - map[c]!!)
            } else {
                answer.add(-1)
            }

            map[c] = index
        }
        
        return answer.toIntArray()
    }
}