fun main() {
    val bw = System.out.bufferedWriter()
    val n = readln().toInt()
    val myNumCards = readln().split(" ").map { it.toInt() }.associateWith { 0 }

    val m = readln().toInt()
    val numCards = readln().split(" ").map { it.toInt() }

    for (i in numCards) {
        if (myNumCards.getOrDefault(i, -1) != -1) {
            bw.write("1 ")
        } else {
            bw.write("0 ")
        }
    }
    
    bw.flush()
    bw.close()
}