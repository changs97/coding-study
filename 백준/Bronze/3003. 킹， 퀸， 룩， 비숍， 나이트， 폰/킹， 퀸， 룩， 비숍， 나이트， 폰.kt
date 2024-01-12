fun main() {
    val pieces = listOf(1, 1, 2, 2, 2, 8)
    val inputPieces = readln().split(" ").map { it.toInt() }
    val outputPieces = mutableListOf<Int>()

    pieces.forEachIndexed { index, i ->
        outputPieces.add(i - inputPieces[index])
    }

    println(outputPieces.joinToString(" "))
}