fun main() = with(System.`in`.bufferedReader()) {
    val bw = System.out.bufferedWriter()
    val n = readLine().toInt()
    val list = mutableListOf<Pair<Int, String>>()
    repeat(n) {
        val (age, name) = readLine().split(" ")
        list.add(age.toInt() to name)
    }

    val sortedList = list.sortedBy { it.first }

    for (i in sortedList) {
        bw.write("${i.first} ${i.second}")
        bw.newLine()
    }

    bw.flush()
    bw.close()
}