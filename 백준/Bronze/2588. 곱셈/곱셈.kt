fun main() {
    val b = readln().split("").subList(1, 4).map { it.toInt() }.reversed()
    val a = readln().split("").subList(1, 4).map { it.toInt() }.reversed()
    val sumList = mutableListOf<Int>()
    for (i in 0..2) {
        var sum = 0
        var p1 = 1
        var p2 = 1

        for (j in 0..2) {
            sum += a[i] * b[j] * p1
            p1 *= 10
        }

        sumList.add(sum)
        p2 *= 10
    }

    sumList.forEach {
        println(it)
    }

    println(sumList[0]+sumList[1]*10+sumList[2]*100)
}
