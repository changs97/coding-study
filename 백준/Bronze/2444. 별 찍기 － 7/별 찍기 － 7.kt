fun main() {
    val n = readln().toInt()

    for (i in 1..n) {
        for(k in 1..(n-i)) {
            print(" ")
        }

        for (j in 1..(2*i-1)) {
            print("*")
        }
        println()
    }

    for (i in (n-1) downTo  1 ) {
        for(k in 1..(n-i)) {
            print(" ")
        }

        for (j in 1..(2*i-1)) {
            print("*")
        }
        println()
    }



}