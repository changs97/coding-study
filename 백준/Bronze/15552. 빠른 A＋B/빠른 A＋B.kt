fun main() {
    val n = readln().toInt()
    val br = System.`in`.bufferedReader()
    val bw = System.out.bufferedWriter()

    for (i in 1..n) {
        val (a, b) = br.readLine().split(" ").map { it.toInt() }
        bw.write((a + b).toString()+"\n")
    }
    bw.flush()
}