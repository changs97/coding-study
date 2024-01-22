import java.util.Scanner

fun main() {
    val s = Scanner(System.`in`)

    val xList = mutableListOf<Int>()
    val yList = mutableListOf<Int>()

    repeat(readln().toInt()) {
        xList.add(s.nextInt())
        yList.add(s.nextInt())
    }

    val maxX = xList.max()
    val minX = xList.min()
    val maxY = yList.max()
    val minY = yList.min()

    println((maxX-minX)*(maxY-minY))
}