fun main() {
    val br = System.`in`.bufferedReader()
    val bw = System.out.bufferedWriter()

    val n = br.readLine().toInt()
    val numList = mutableListOf<Int>()

    repeat(n) {
        numList.add(br.readLine().toInt())
    }

    numList.sort()

    for (i in numList) {
        bw.write(i.toString() + "\n")
    }

    bw.flush()
}