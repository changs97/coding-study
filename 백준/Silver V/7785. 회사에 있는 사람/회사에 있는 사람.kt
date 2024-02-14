fun main() {
    val br = System.`in`.bufferedReader()
    val bw = System.out.bufferedWriter()
    
    val n = br.readLine().toInt()

    val comparator = compareByDescending<String> {
        it
    }

    val map = sortedMapOf<String, String>(comparator)


    repeat(n) {
        val (name, attendanceStatus) = br.readLine().split(" ")
        map[name] = attendanceStatus
    }

    map.filterValues { it == "enter" }.keys.forEach {
        println(it)
    }

    bw.flush()
    bw.close()
}