fun main() {
    readlnOrNull()?.split(" ")?.map { it.toInt() }?.also { numList ->
        val result = numList[0] - numList[1]
        print(result)
    }
}
