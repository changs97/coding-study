fun main() {
    val n = readln().toInt()

    val gradeList = readln().split(" ").map { it.toDouble() }
    val max = gradeList.max()

    val newGrade = gradeList.map { it / max * 100 }

    println(newGrade.sum() / n)
}