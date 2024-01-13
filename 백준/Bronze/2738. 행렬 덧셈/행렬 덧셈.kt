fun main() {
    val br = System.`in`.bufferedReader()
    val (n, m) = br.readLine().split(" ").map { it.toInt() }

    val a = mutableListOf<List<Int>>()
    val b = mutableListOf<List<Int>>()

    for (i in 1..n) {
        a.add(br.readLine().split(" ").map { it.toInt() })
    }

    for (i in 1..n) {
        b.add(br.readLine().split(" ").map { it.toInt() })
    }
    
    for (i in 0 until n) {
        for (j in 0 until m) {
            val add = a[i][j]+b[i][j]
            print("$add ")
        }
        println()
    }
}