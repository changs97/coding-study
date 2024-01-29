fun main() {
    val (_, m) = readln().split(" ").map { it.toInt() }
    val numList = readln().split(" ").map { it.toInt() }.toTypedArray()
    val resultList = mutableListOf<Int>()

    combination(numList, 3).forEach {
        if (it.sum() <= m) {
            resultList.add(it.sum())
        }
    }

    println(resultList.max())
}

fun <T> combination(elements: Array<T>, r: Int): List<List<T>> {
    val n = elements.size
    val results = mutableListOf<List<T>>() // 모든 경우의 수

    val result = elements.sliceArray(0 until r)

    fun recursionCombination(depth: Int = 0, index: Int = 0) {
        if (depth == r) {
            results.add(result.toList())
            return
        }

        for (i in index until n) {
            result[depth] = elements[i]
            recursionCombination(depth + 1, i + 1)
        }
    }

    recursionCombination()
    return results
}