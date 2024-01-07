fun main() {
    readln()
    readln().split(" ").map { it.toInt() }.run { 
        println("${min()} ${max()}")
    }
}