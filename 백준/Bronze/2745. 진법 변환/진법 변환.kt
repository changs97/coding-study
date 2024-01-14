fun main() {
    val map: HashMap<Char, Int> = hashMapOf()
    var num = 10

    for (i in 'A'..'Z') {
        map[i] = num++
    }

    val (a, b) = readln().split(" ")

    var sum = 0
    a.reversed().forEachIndexed { index, c ->
        var i = 1
        repeat(index) {
            i *= b.toInt()
        }
        sum += (map[c] ?: c.toString().toInt()) * i
    }

    println(sum)
}