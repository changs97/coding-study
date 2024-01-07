fun main() {
    val set = hashSetOf<Int>()
    
    for (i in 1..10) {
        set.add(readln().toInt() % 42)
    }

    println(set.size)
}