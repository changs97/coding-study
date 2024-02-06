fun main() {
    val numList = mutableListOf<Int>()

    repeat(5) {
        numList.add(readln().toInt())
    }

    numList.sort()

    println(numList.sum() / 5)
    println(numList[2])
}