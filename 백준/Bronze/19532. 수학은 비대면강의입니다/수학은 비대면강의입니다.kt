fun main() {
    val list = readln().split(" ").map { it.toInt() }
    val a = list[0]
    val b = list[1]
    val c = list[2]
    val d = list[3]
    val e = list[4]
    val f = list[5]

    for (y in -999..999) {
        for (x in -999..999) {
            if ((a * x + b * y) == c && (d * x + e * y) == f) {
                println("$x $y")
                break
            }
        }

    }
}