import java.util.Scanner

fun main(){
    val s = Scanner(System.`in`)

    val xList = mutableListOf<Int>()
    val xSet = mutableSetOf<Int>()

    val yList = mutableListOf<Int>()
    val ySet = mutableSetOf<Int>()

    repeat(3) {
        val x = s.nextInt()
        val y = s.nextInt()
        xList.add(x)
        xSet.add(x)

        yList.add(y)
        ySet.add(y)
    }

    var x = 0
    var y = 0

    for (i in xSet) {
        val count = xList.count { it == i }
        if (count == 1) x = i
    }

    for (i in ySet) {
        val count = yList.count { it == i }
        if (count == 1) y = i
    }

    println("$x $y")
}