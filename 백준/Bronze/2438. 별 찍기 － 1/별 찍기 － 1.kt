fun main() {
    val n = readln().toInt()
    System.`in`.bufferedReader().use { br ->
        System.out.bufferedWriter().use { bw ->
           for (i in 1..n) {
               for (j in 1..i) {
                   bw.write("*")
               }
               bw.flush()
               println()
           }

        }
    }
}