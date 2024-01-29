fun main() {
    val input = readln().toInt()

    for(n in input/2 until input) {
        val digitSum = "$n".sumOf { it - '0' }
        if(input == (n + digitSum)) {
            println(n)
            return
        }
    }
    println(0)
}