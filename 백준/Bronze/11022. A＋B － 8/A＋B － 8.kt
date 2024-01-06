fun main() {
    val n = readln().toInt()

    System.`in`.bufferedReader().use { br ->
        System.out.bufferedWriter().use { bw ->
            for (i in 1..n) {
                val (a, b) = br.readLine().split(" ").map { it.toInt() }
                bw.write("Case #$i: $a + $b = ${a + b}\n")
            }

            bw.flush()
        }
    }
}