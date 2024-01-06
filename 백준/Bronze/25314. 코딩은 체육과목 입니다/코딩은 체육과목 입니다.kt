fun main() {
    val n = readln().toInt() / 4

    val sb = StringBuffer()

    for (i in 1..n) {
        sb.append("long ")
    }

    sb.append("int")
    print(sb)
}