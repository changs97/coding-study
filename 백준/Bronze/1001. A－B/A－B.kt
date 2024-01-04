fun main() {
    val numList = readln().split(" ").map { it.toInt() }
    val result = numList[0] - numList[1]
    print(result)
}