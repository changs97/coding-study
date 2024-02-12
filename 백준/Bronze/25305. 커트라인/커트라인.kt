fun main() {
    val (_, k) = readln().split(" ").map { it.toInt() }
    val gradeList = readln().split(" ").map { it.toInt() }
    val sortedGradeList = gradeList.sortedDescending()
    println(sortedGradeList[k-1])
}