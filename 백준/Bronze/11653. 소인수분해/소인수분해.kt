fun main() {
    var n = readln().toInt()

    val list1 = mutableListOf<Int>()

    for (i in 2..n) {
        if (n % i != 0) continue

        val list2 = mutableListOf<Int>()

        for (j in 2 until i) {
            if (i % j == 0) {
                list2.add(j)
            }
        }

        if (list2.size == 0) list1.add(i)
    }

    val list3 = mutableListOf<Int>()

    for (i in list1) {
        if (list1.contains(n)) {
            println(n)
            return
        }

        if (n % i != 0) continue

        while (n % i == 0) {
            n /= i
            println(i)
        }
    }
}