fun main() {
    var t = readln().toInt()

    repeat(t) {
        readln().run {
            println("${first()}${last()}")
        }
    }
}