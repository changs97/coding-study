fun main() {
    val br = System.`in`.bufferedReader()
    val bw = System.out.bufferedWriter()

    val (n, m) = br.readLine().split(" ").map { it.toInt() }

    val mutableMap = mutableMapOf<String, Int>()

    repeat(n) {
        val str = br.readLine()
        mutableMap[str] = 0
    }

    val list = mutableListOf<String>()

    repeat(m) {
        val str = br.readLine()
        list.add(str)
    }

    var count = 0

    list.forEach {
        if (mutableMap.containsKey(it)) count++
    }

    bw.write(count.toString())

    bw.flush()
    bw.close()
}