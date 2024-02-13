fun main() {
    val br = System.`in`.bufferedReader()
    val bw = System.out.bufferedWriter()
    val n = br.readLine().toInt()
    val coordinateList = mutableListOf<Pair<Int, Int>>()

    repeat(n) {
        val (x, y) = br.readLine().split(" ").map { it.toInt() }
        coordinateList.add(x to y)
    }

    coordinateList.sortedWith(compareBy({it.second}, {it.first})).run {
        forEach {
            bw.write("${it.first} ${it.second}")
            bw.newLine()
        }
    }
    bw.flush()
    bw.close() 

}