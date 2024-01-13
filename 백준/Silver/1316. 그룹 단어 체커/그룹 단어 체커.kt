fun main() {
    val n = readln().toInt()
    var count = 0

    for (i in 1..n) {
        val str = readln()
        var prior = '.'
        val set = hashSetOf<Char>()
        var check = 1

        for (c in str) {
            if (c != prior && set.contains(c)) {
                check = 0
                break
            } else {
                prior = c
                set.add(c)
            }
        }
        count += check
    }

    println(count)
}