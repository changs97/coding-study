
fun main() {
    val bw = System.out.bufferedWriter()
    val n = readln().toInt()
    val myNumCards = readln().split(" ").map { it.toInt() }.toMutableSet()

    val m = readln().toInt()
    val numCards = readln().split(" ").map { it.toInt() }

    for (i in numCards) {
        if (myNumCards.contains(i)) {
            bw.write("1 ")
        } else {
            bw.write("0 ")
        }
    }

    bw.flush()
    bw.close()
}