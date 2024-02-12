fun main() {
    val br = System.`in`.bufferedReader()
    val bw = System.out.bufferedWriter()

    val n = br.readLine().toInt()
    val list = IntArray(n)

    for (i in 0 until n) {
        list[i] = br.readLine().toInt()
    }

    list.sort()

    for (i in list) {
        bw.write(i.toString())
        bw.newLine()
    }

    bw.flush()
    bw.close()
}