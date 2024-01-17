/*
1 -> 1       (6*0+0)
2..7 -> 2    (6*1+1)
8..19 -> 3   (6*2+7)
20..37 -> 4  (6*3+19)
*/
fun main() {
    val n = readln().toInt()
    var i = 1
    var pre = 1
    var cal = 6 * i + pre

    while (n > cal) {
        i++
        pre = cal
        cal = 6 * i + pre
    }

    if (n == 1) i--

    println(i+1)
}