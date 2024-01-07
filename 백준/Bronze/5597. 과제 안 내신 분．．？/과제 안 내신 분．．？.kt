fun main() {
    val studentList = BooleanArray(30) { false }
    val br = System.`in`.bufferedReader()

    for (i in 0..27) {
        val num = br.readLine().toInt()
        studentList[num-1] = true
    }
    
    studentList.forEachIndexed { index, i ->
        if (!i) println(index + 1)
    }
}