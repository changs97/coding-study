import java.text.Format

fun main() {
    val n = readln().toInt()
    System.`in`.bufferedReader().use { br ->
        System.out.bufferedWriter().use { bw ->
            var blankNumber = n-1

           for (i in 1..n) {
               for (j in 1..blankNumber) {
                   bw.write(" ")
               }

               for (k in 1..i) {
                   bw.write("*")
               }
               
               blankNumber--
               bw.flush()
               println()
           }

        }
    }
}