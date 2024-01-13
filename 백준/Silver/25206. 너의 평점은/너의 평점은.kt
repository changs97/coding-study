fun main() {
    var sum1 = 0.0
    var sum2 = 0.0
    for (i in 1..20) {
        val (_, grade, scale) = readln().split(" ")
        if (scale == "P") continue
        
        sum1 += grade.toDouble() * scale.toGrade()
        sum2 += grade.toDouble()
    }
    
    println(sum1/sum2)

}

data class CoursesTaken(val name: String, val grade: Double, val scale: String)

fun String.toGrade(): Double {
    return when (this) {
        "A+" -> 4.5
        "A0" -> 4.0
        "B+" -> 3.5
        "B0" -> 3.0
        "C+" -> 2.5
        "C0" -> 2.0
        "D+" -> 1.5
        "D0" -> 1.0
        else -> 0.0
    }
}
