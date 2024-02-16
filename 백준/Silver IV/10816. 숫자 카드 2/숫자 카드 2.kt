
fun main() {
    val br = System.`in`.bufferedReader()
    val bw = System.out.bufferedWriter()

    val n = br.readLine().toInt()
    val myCards = br.readLine().split(" ").groupBy { it }
    
    val m = br.readLine().toInt()
    val cards = br.readLine().split(" ")

    cards.forEach {
        bw.write("${myCards[it]?.size ?: 0} ")
    }

    bw.flush()
    bw.close()
}

