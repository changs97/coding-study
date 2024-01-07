fun main() {
    val numbers = mutableListOf<Int>()

    for (i in 1..9) {
        numbers.add(readln().toInt())
    }

    val max = numbers.max()

    numbers.forEachIndexed { index, i ->
        if (i == max) {
            println(max)
            println(index + 1)
        }
    }
}