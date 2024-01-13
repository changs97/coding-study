fun main() {
    val list: MutableList<List<Char>> = mutableListOf()
    repeat(5) {
        list.add(readln().toList())
    }
    for (i in 0 until 15) {
        for (j in 0 until 5) {
            if (list[j].size > i)
            print(list[j][i])
        }
    }
}