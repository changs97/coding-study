fun main() {
    val list: MutableList<List<Int>> = mutableListOf()
    repeat(9) {
        list.add(readln().split(" ").map { it.toInt() })
    }
    
    var max = 0
    var r = 0
    var c = 0
    
    for (i in 0..8) {
        for (j in 0..8) {
            if (max < list[i][j]) {
                max = list[i][j]
                r = i
                c = j
            }
        }
    }
    
    println(max)
    println("${++r} ${++c}")
}