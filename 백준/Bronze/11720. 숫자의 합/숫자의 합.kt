fun main() {
    readln().toInt()
    val str = readln()
    var sum = 0
    for (i in str) {
        sum += i.toString().toInt()
    }

    println(sum)
}