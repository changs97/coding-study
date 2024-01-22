fun main() {
    val list = readln().split(" ").map { it.toInt() }.toMutableList()
    list.sort()

    if (list[2] >= (list[0] + list[1])) {
        list[2] = list[0] + list[1] - 1
    }

    println(list.sum())
}

