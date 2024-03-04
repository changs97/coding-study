
fun main() {
    val br = System.`in`.bufferedReader()
    val bw = System.out.bufferedWriter()

    val (n, m) = br.readLine().split(" ").map { it.toInt() }

    val map = mutableMapOf<String, Int>()

    repeat(n) {
        map[br.readLine()] = 1
    }

    repeat(m) {
        val key = br.readLine()
        if (map.getOrDefault(key, 0) == 1) {
            map[key] = 2
        }
    }


    val filterMap = map.filter {it.value == 2 }.toSortedMap()

    println(filterMap.size)

    filterMap.forEach {
        bw.write(it.key)
        bw.newLine()
    }

    bw.flush()
    bw.close()
}


