fun main() {
    val (a, b, v) = readln().split(" ").map { it.toInt() }

    var dayCount = (v-a)/(a-b)

    if ((v-a)%(a-b) == 0) dayCount++ else dayCount+=2
    println(dayCount)
    }




