fun main() {
    val n = readln().toInt()
    val myNumCards = readln().split(" ").map { it.toInt() }.associateWith { 0 }

    val m = readln().toInt()
    val numCards = readln().split(" ").map { it.toInt() }

    for (i in numCards) {
        if (myNumCards.getOrDefault(i, -1) != -1) {
            print("1 ")
        } else {
            print("0 ")
        }
    }
}