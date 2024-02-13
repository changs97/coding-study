fun main() {
    val br = System.`in`.bufferedReader()
    val n = br.readLine().toInt()
    val coordinateList = mutableListOf<Pair<Int, Int>>()

    repeat(n) {
        val (x, y) = br.readLine().split(" ").map { it.toInt() }
        coordinateList.add(x to y)
    }

    coordinateList.sortedWith(compareBy({it.first}, {it.second})).run {
        forEach {
            println("${it.first} ${it.second}")
        }
    }

}