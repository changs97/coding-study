fun main() {
    val str = readln()
    var l = 0
    var r = str.length - 1

    while (l < r) {
        if (str[l] != str[r]) {
            println(0)
            return
        }

        l++
        r--
    }

    println(1)


}