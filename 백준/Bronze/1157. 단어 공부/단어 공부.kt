fun main() {
    val str = readln().uppercase()
    val set = str.toSet()
    
    val list = mutableListOf<CountingChar>()

    for (i in set) {
        val charCount = str.count { it == i }
        list.add(CountingChar(i, charCount))
    }

    val max = list.maxBy { it.count }
    val maxCount = list.count { it.count == max.count }

    if (maxCount > 1) println("?")
    else {
        println(max.char)
    }

}

private data class CountingChar(val char: Char, val count: Int)