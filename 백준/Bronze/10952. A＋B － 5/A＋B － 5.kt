fun main() {
    System.`in`.bufferedReader().use { br ->
        System.out.bufferedWriter().use { bw ->
            while (true) {
                val (a, b) = br.readLine().split(" ").map { it.toInt() }
                if (a == 0 && b == 0) break
                bw.write("${a + b}\n")
            }

            bw.flush()
        }
    }
}