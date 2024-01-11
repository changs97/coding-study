fun main() {
    val str = readln().split(" ").toMutableList()

    str.removeAll { it.isBlank() }

    println(str.size)
}