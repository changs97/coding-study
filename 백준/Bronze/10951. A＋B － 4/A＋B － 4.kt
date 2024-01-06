import java.util.StringTokenizer

fun main() {
    System.`in`.bufferedReader().use { br ->
        System.out.bufferedWriter().use { bw ->
            var s: String?
            while (br.readLine().also { s = it } != null) {
                val st = StringTokenizer(s)

                bw.write("${st.nextToken().toInt() + st.nextToken().toInt()}\n")
            }

            bw.flush()
        }
    }
}